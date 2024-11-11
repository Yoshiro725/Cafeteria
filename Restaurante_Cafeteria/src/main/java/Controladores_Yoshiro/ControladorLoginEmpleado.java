/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores_Yoshiro;

import Modelo.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class ControladorLoginEmpleado {
    
    // Conexión a la base de datos
    private ConexionBD conexion;

    public ControladorLoginEmpleado() {
        conexion = new ConexionBD();
    }

    // Método para validar la contraseña del empleado
    public boolean validarEmpleado(String password) {
        boolean isValid = false;

        try {
            // Establecemos la conexión con la base de datos
            Connection conn = conexion.connectDB();

            String sql = "SELECT * FROM empleados WHERE contrasena = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, password);  // Establecemos la contraseña en el parámetro

            ResultSet rs = pst.executeQuery();

            // Si hay un resultado, la contraseña es válida
            if (rs.next()) {
                isValid = true;
            }

            rs.close();
            pst.close();
            conn.close();  // Cerramos la conexión

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
