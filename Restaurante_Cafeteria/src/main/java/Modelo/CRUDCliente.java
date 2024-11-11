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
public class CRUDCliente implements Almacenamiento {

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
        try {
            String query = "INSERT INTO Clientes (nombre, correo, telefono) VALUES (?,?,?)";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setString(1, objMCliente.getNombre());
            statement.setString(2, objMCliente.getCorreo());
            statement.setInt(3, objMCliente.getTelefono());

            statement.executeLargeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objBD.desconectedDB();
        }

    }
//   }

    @Override
    public ArrayList read() {
        objBD.connectDB();
        try {
            ResultSet resultado = objBD.connection.createStatement().executeQuery("SELECT * FROM Clientes");
            objMCliente = new Cliente();
            listaCliente = new ArrayList();
            while (resultado.next()) {
                objMCliente.setId_cliente(Integer.parseInt(resultado.getString(1)));
                objMCliente.setNombre(resultado.getString(2));
                objMCliente.setCorreo(resultado.getString(3));
                objMCliente.setTelefono(Integer.parseInt(resultado.getString(4)));
                listaCliente.add(objMCliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        objBD.desconectedDB();
        return listaCliente;

    }

    @Override
    public void update() {
        objBD.connectDB();

        try {
            objBD.connection.createStatement().execute(
                    "UPDATE cliente SET ? = ? WHERE id_cliente = " + objMCliente.getId_cliente() + ";"
            );
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
        objBD.desconectedDB();
    }

    @Override
    public void delete() {
        objBD.connectDB();
        try {
            String query = "DELETE FROM clientes WHERE ClienteID = ?";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setInt(1, objMCliente.getId_cliente());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objBD.desconectedDB();
        }
    }

}
