------Creacion de la base de Datos-------
create database Tienda;

 ---------Creacion de las Tablas---------
 CREATE TABLE Proveedores (
    id_proveedor SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(150),
    telefono VARCHAR(15),
    email VARCHAR(100)
);

CREATE TABLE Clientes (
    id_cliente SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(150),
    telefono VARCHAR(15),
    email VARCHAR(100)
);}CREATE TABLE Productos (
    id_producto SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL,
    id_proveedor INT REFERENCES Proveedores(id_proveedor) ON DELETE CASCADE
);

CREATE TABLE Ventas (
    id_venta SERIAL PRIMARY KEY,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    id_cliente INT REFERENCES Clientes(id_cliente) ON DELETE SET NULL,
    total DECIMAL(10,2)
);

CREATE TABLE Detalle_Venta (
    id_detalle_venta SERIAL PRIMARY KEY,
    id_venta INT REFERENCES Ventas(id_venta) ON DELETE CASCADE,
    id_producto INT REFERENCES Productos(id_producto) ON DELETE CASCADE,
    cantidad INT NOT NULL,
    subtotal DECIMAL(10,2) NOT NULL
);







