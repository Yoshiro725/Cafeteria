/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gokum
 */
public class ConexionBD {
    Connection connection  = null;
    
    public void connectDB(){
            try{
            try{
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex){
            System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
             connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/cafeteria", "postgres", "Rafita24");
             
             boolean valid= connection.isValid(50000);
             System.out.println(valid ? "Ta bueno":"Ta malo");
        }catch (java.sql.SQLException sqle){
            System.out.println("Error"+ sqle);
        }
    }
    
    public void desconectedDB() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void main(String[] args) {
        ConexionBD javaPostgreSQLBasic = new ConexionBD();
        javaPostgreSQLBasic.connectDB();
    }
}
