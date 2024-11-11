/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
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
public class CRUDPedido implements Almacenamiento{
    ArrayList<Pedido> listaPedido;
    Pedido objMPedido;
    ConexionBD objBD = new ConexionBD();

    public CRUDPedido() {
        this.objMPedido = new Pedido();
    }

    public Pedido getObjMPedido() {
        return objMPedido;
    }

    public void setObjMPedido(Pedido objMPedido) {
        this.objMPedido = objMPedido;
    }

    
    @Override
    public void create() {
        try {
            String query = "INSERT INTO pedidos (Id_cliente, Fecha, Monto) VALUES (?,?,?)";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setInt(1, objMPedido.getId_cliente());
            statement.setDate(2, objMPedido.getFecha());
            statement.setDouble(3, objMPedido.getMonto());

            statement.executeLargeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objBD.desconectedDB();
        }

    }

    @Override
    public ArrayList read() {
                try {
            ResultSet resultado = objBD.connection.createStatement().executeQuery("SELECT * FROM Pedidos");
            objMPedido = new Pedido();
            listaPedido = new ArrayList();
            while (resultado.next()) {
            objMPedido.setId_pedido(Integer.parseInt(resultado.getString(1)));
            objMPedido.setId_cliente(Integer.parseInt(resultado.getString(2)));
            objMPedido.setFecha(resultado.getDate(3));
            objMPedido.setMonto(Double.parseDouble(resultado.getString(4)));
            listaPedido.add(objMPedido);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        objBD.desconectedDB();
        return listaPedido;
    }

    @Override
    public void update() {
        objBD.connectDB();

        try {
            objBD.connection.createStatement().execute(
                    "UPDATE Pedidos SET ? = ? WHERE id_pedido = " + objMPedido.getId_pedido()+ ";"
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
            String query = "DELETE FROM Pedidos WHERE id_pedido = ?";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setInt(1, objMPedido.getId_pedido());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objBD.desconectedDB();
        }
    }
    
}
