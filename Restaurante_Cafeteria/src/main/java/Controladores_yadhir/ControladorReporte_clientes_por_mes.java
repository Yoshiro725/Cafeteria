package Controladores_yadhir;

import Modelo.Cliente;
import Vista.Reporte_clientes_por_mes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorReporte_clientes_por_mes implements ActionListener {

    Reporte_clientes_por_mes objReporte_clientes_por_mes;
    Cliente objCliente;
    ArrayList<Cliente> listaCliente;

    public ControladorReporte_clientes_por_mes(Reporte_clientes_por_mes objReporte_clientes_por_mes) {
        this.objReporte_clientes_por_mes = objReporte_clientes_por_mes;
        this.objReporte_clientes_por_mes.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.objReporte_clientes_por_mes.jButton1 == e.getSource()) {
            ClientesPorMes();
        }
    }

    private void ClientesPorMes() {
        // Configura los parámetros de conexión
        String url = "jdbc:postgresql://localhost:5432/cafeteria";
        String usuario = "postgres";
        String contraseña = "tu_contraseña";

        Connection conexion = null;
        CallableStatement llamada = null;
        ResultSet resultado = null;

        try {
            // Establece la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Prepara la llamada al procedimiento almacenado
            llamada = conexion.prepareCall("{ call clientes_mes () }");

            // Ejecuta el procedimiento y obtiene los resultados
            boolean tieneResultados = llamada.execute();
            if (tieneResultados) {
                resultado = llamada.getResultSet();
                listaCliente = new ArrayList();
                // Itera sobre el ResultSet para procesar los datos
                while (resultado.next()) {
                    objCliente.setId_cliente(resultado.getInt(1));
                    objCliente.setNombre(resultado.getString(2));
                    objCliente.setCorreo(resultado.getString(3));
                    objCliente.setTelefono(resultado.getInt(4));
                    listaCliente.add(objCliente);
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error al ejecutar el procedimiento almacenado.");

        } finally {
            try {
                if (resultado != null) resultado.close();
                if (llamada != null) llamada.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
