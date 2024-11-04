/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CRUDCliente implements Almacenamiento{
    
    ArrayList<Cliente> listaCliente;
    Cliente objMCliente;
    ConexionBD objBD = new ConexionBD();

    public CRUDCliente() {
        this.objMCliente = new Cliente();
    }

    public Cliente getObjMCliente() {
        return objMCliente;
    }

    public void setObjMCliente(Cliente objMCliente) {
        this.objMCliente = objMCliente;
    }
    
    

    @Override
    public void create() {
         objBD.connectDB();
         try{
            String query = "INSERT INTO Clientes (nombre, correo, telefono) VALUES (?,?,?)";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setString(1, objMCliente.getNombre());
            statement.setString(2, objMCliente.getCorreo());
            statement.setInt(3, objMCliente.getTelefono());
            
            statement.executeLargeUpdate();
                    
            } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
            objBD.desconectedDB();
            }


    }

    @Override
    public ArrayList read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
