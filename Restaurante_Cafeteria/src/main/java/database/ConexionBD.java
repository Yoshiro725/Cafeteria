/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {

    private Connection connection;

    // Conectar a la base de datos
    public Connection connectDB() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/cafeteria", "postgres", "JLNB58915");

            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "Conexion exitosa" : "Conexion fallida");

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al conectar: " + ex);
        }
        return connection;
    }

    // Desconectar de la base de datos
    public void disconnectDB() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Desconectado exitosamente.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Método para autenticar el empleado por su contraseña
    public boolean autenticarEmpleado(String contrasena) {
        String query = "SELECT * FROM empleados WHERE contrasena = ?"; // Asegúrate de que el nombre de la tabla y campo coincidan
        try (PreparedStatement pst = connectDB().prepareStatement(query)) {
            pst.setString(1, contrasena);
            try (ResultSet rs = pst.executeQuery()) {
                return rs.next(); // Si se encuentra un registro, la autenticación es exitosa
            }
        } catch (SQLException ex) {
            System.out.println("Error al autenticar: " + ex);
            return false;
        }
    }

    // Método main para ejecutar la clase en Maven o desde la terminal
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        conexion.connectDB();
        // Puedes agregar más código aquí para probar la funcionalidad de la autenticación, si lo necesitas
    }
}
