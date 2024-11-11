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
public class CRUDDetallePedido implements Almacenamiento{
    
    ArrayList<DetallePedido> listaDetallePedido;
    DetallePedido objMDetallePedido;
    ConexionBD objBD = new ConexionBD();

    public CRUDDetallePedido() {
        this.objMDetallePedido = new DetallePedido();
    }

    public DetallePedido getObjMDetallePedido() {
        return objMDetallePedido;
    }

    public void setObjMDetallePedido(DetallePedido objMDetallePedido) {
        this.objMDetallePedido = objMDetallePedido;
    }
    
    
    
    
    @Override
    public void create() {
        objBD.connectDB();
        try{
            String query = "INSERT INTO DetallePedido (Id_pedido, id_producto, cantidad, subtotal) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setInt(1, objMDetallePedido.getId_pedido());
            statement.setInt(2, objMDetallePedido.getId_producto());
            statement.setInt(3, objMDetallePedido.getCantidad());
            statement.setDouble(4, objMDetallePedido.getSubtotal());
            
            statement.executeLargeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CRUDDetallePedido.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            objBD.desconectedDB();
        }
    }

    @Override
    public ArrayList read() {
        objBD.connectDB();
        try{
            ResultSet resultado = objBD.connection.createStatement().executeQuery("SELECT * FROM Detalle_pedido");
            objMDetallePedido = new DetallePedido();
            listaDetallePedido = new ArrayList();
            while(resultado.next()){
                objMDetallePedido.setId_detalle(Integer.parseInt(resultado.getString(1)));
                objMDetallePedido.setId_pedido(Integer.parseInt(resultado.getString(2)));
                objMDetallePedido.setId_producto(Integer.parseInt(resultado.getString(3)));
                objMDetallePedido.setCantidad(Integer.parseInt(resultado.getString(4)));
                objMDetallePedido.setSubtotal(Integer.parseInt(resultado.getString(5)));
                listaDetallePedido.add(objMDetallePedido);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDDetallePedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        objBD.desconectedDB();
        return listaDetallePedido;
    }

    @Override
    public void update() {
        try {
            objBD.connection.createStatement().execute(
                    "UPDATE detalle_pedido SET ? = ? WHERE id_detalle = " + objMDetallePedido.getId_detalle()+ ";"
            );
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
        objBD.desconectedDB();    }

    @Override
    public void delete() {
objBD.connectDB();
        try {
            String query = "DELETE FROM detalle_pedido WHERE id_detalle = ?";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setInt(1, objMDetallePedido.getId_detalle());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objBD.desconectedDB();
        }    }
    
}
