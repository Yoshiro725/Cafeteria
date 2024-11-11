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
public class CRUDProducto implements Almacenamiento{
    ArrayList<Producto> listaProducto;
    Producto objMProducto;
    ConexionBD objBD = new ConexionBD();

    public CRUDProducto() {
        this.objMProducto = new Producto();
    }

    public Producto getObjMProducto() {
        return objMProducto;
    }

    public void setObjMProducto(Producto objMProducto) {
        this.objMProducto = objMProducto;
    }




    
    @Override
    public void create() {
        objBD.connectDB();
        try{
            String query = "INSERT INTO Productos (nombre_producto, precio, stock, id_tipo_producto) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setString(1, objMProducto.getNombre_producto());
            statement.setDouble(2, objMProducto.getPrecio());
            statement.setInt(3, objMProducto.getStock());
            statement.setInt(4, objMProducto.getId_tipo_producto());
            
            statement.executeLargeUpdate();
            } catch (SQLException ex) {
            Logger.getLogger(CRUDProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objBD.desconectedDB();
        }

    }

    @Override
    public ArrayList read() {
        objBD.connectDB();
        try{
           ResultSet resultado = objBD.connection.createStatement().executeQuery("SELECT * FROM Productos");
            objMProducto = new Producto();
            listaProducto = new ArrayList();
            while(resultado.next()){
                objMProducto.setId_producto(Integer.parseInt(resultado.getString(1)));
                objMProducto.setNombre_producto(resultado.getString(2));
                objMProducto.setPrecio(Double.parseDouble(resultado.getString(3)));
                objMProducto.setStock(Integer.parseInt(resultado.getString(4)));
                objMProducto.setId_tipo_producto(Integer.parseInt(resultado.getString(5)));
                listaProducto.add(objMProducto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        objBD.desconectedDB();
        return listaProducto;
    }

    @Override
    public void update() {
        objBD.connectDB();

        try {
            objBD.connection.createStatement().execute(
                    "UPDATE Productos SET ? = ? WHERE id_producto = " + objMProducto.getId_producto() + ";"
            );
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
        objBD.desconectedDB();}

    @Override
    public void delete() {
        objBD.connectDB();
        try {
            String query = "DELETE FROM Productos WHERE id_producto = ?";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setInt(1, objMProducto.getId_producto());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objBD.desconectedDB();
        }  
        
         
        }
    
}
