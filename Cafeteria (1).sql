-- Crear la base de datos
CREATE DATABASE cafeteria;

-- Conectarse a la base de datos
\c cafeteria;

-- Crear tabla Clientes
CREATE TABLE Clientes (
    id_cliente SERIAL PRIMARY KEY,
    nombre VARCHAR(100),
    correo VARCHAR(100),
    telefono INT CHECK (telefono BETWEEN 100000000 AND 9999999999)  -- Asegura que sea un número de 10 dígitos
);

-- Crear tabla Tipo de Producto
CREATE TABLE Tipo_Producto (
    id_tipo_producto SERIAL PRIMARY KEY,
    nombre_tipo VARCHAR(50)
);

-- Crear tabla Productos
CREATE TABLE Productos (
    id_producto SERIAL PRIMARY KEY,
    nombre_producto VARCHAR(100),
    precio NUMERIC(10, 2),
    stock INT,
    id_tipo_producto INT,
    FOREIGN KEY (id_tipo_producto) REFERENCES Tipo_Producto(id_tipo_producto)
);

-- Crear tabla Tipo de Solicitud Especial
CREATE TABLE Tipo_Solicitud_Especial (
    id_tipo_solicitud SERIAL PRIMARY KEY,
    nombre_solicitud VARCHAR(100)
);

-- Crear tabla Solicitud Especial
CREATE TABLE Solicitud_Especial (
    id_solicitud SERIAL PRIMARY KEY,
    id_producto INT,
    id_tipo_solicitud INT,
    FOREIGN KEY (id_producto) REFERENCES Productos(id_producto),
    FOREIGN KEY (id_tipo_solicitud) REFERENCES Tipo_Solicitud_Especial(id_tipo_solicitud)
);

-- Crear tabla Cuenta de Puntos
CREATE TABLE Cuenta_Puntos (
    id_cuenta SERIAL PRIMARY KEY,
    id_cliente INT,
    puntos INT DEFAULT 0,
    FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente)
);

-- Crear tabla Recompensas
CREATE TABLE Recompensas (
    id_recompensa SERIAL PRIMARY KEY,
    descripcion VARCHAR(100),
    puntos_necesarios INT,
    id_cuenta INT,
    FOREIGN KEY (id_cuenta) REFERENCES Cuenta_Puntos(id_cuenta)
);

-- Crear tabla Pedidos
CREATE TABLE Pedidos (
    id_pedido SERIAL PRIMARY KEY,
    id_cliente INT,
    fecha DATE DEFAULT CURRENT_DATE,
    monto NUMERIC(10, 2),
    FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente)
);

-- Crear tabla Detalle Pedido
CREATE TABLE Detalle_Pedido (
    id_detalle SERIAL PRIMARY KEY,
    id_pedido INT,
    id_producto INT,
    cantidad INT,
    subtotal NUMERIC(10, 2),
    FOREIGN KEY (id_pedido) REFERENCES Pedidos(id_pedido),
    FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)
);



CREATE OR REPLACE FUNCTION clientes_mes () RETURNS TABLE (id_cliente INT, nombre VARCHAR, correo VARCHAR, telefono VARCHAR, fecha_registro DATE) AS $$
BEGIN
    RETURN QUERY
    SELECT c.id_cliente, c.nombre, c.correo, c.telefono, c.fecha_registro
    FROM Clientes c
    WHERE c.fecha_registro >= (CURRENT_DATE - INTERVAL '1 month')
    AND c.fecha_registro < CURRENT_DATE + INTERVAL '1 day';
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION insertar_y_verificar(
    tabla TEXT, 
    campos TEXT, 
    valores TEXT
) RETURNS TEXT AS $$
DECLARE
    mensaje_confirmacion TEXT;
    consulta TEXT;
BEGIN
    -- Construir la consulta dinámica
    consulta := 'INSERT INTO ' || tabla || ' (' || campos || ') VALUES (' || valores || ')';

    -- Intentar ejecutar la consulta
    BEGIN
        EXECUTE consulta;
        mensaje_confirmacion := 'La inserción ha sido exitosa';
    EXCEPTION
        WHEN OTHERS THEN
            mensaje_confirmacion := 'Hubo un error en la inserción';
    END;

    -- Retornar el mensaje
    RETURN mensaje_confirmacion;

END;
$$ LANGUAGE plpgsql;

