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
public class CRUDCuentaPuntos implements Almacenamiento{
    ArrayList<CuentaPuntos> listaCuentaPuntos;
    CuentaPuntos objMCuentaPuntos;
    ConexionBD objBD = new ConexionBD();

    public CRUDCuentaPuntos() {
        this.objMCuentaPuntos = new CuentaPuntos();
    }

    public CuentaPuntos getObjMCuentaPuntos() {
        return objMCuentaPuntos;
    }

    public void setObjMCuentaPuntos(CuentaPuntos objMCuentaPuntos) {
        this.objMCuentaPuntos = objMCuentaPuntos;
    }

    
    
    @Override
    public void create() {
        objBD.connectDB();
        try {
            String query = "INSERT INTO Cuenta_Puntos VALUES (?,?,?)";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setInt(1, objMCuentaPuntos.getId_cuenta());
            statement.setInt(2, objMCuentaPuntos.getId_cliente());
            statement.setInt(3, objMCuentaPuntos.getPuntos());

            statement.executeLargeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objBD.desconectedDB();
        }
    }

    @Override
    public ArrayList read() {
        objBD.connectDB();
        try {
            ResultSet resultado = objBD.connection.createStatement().executeQuery("SELECT * FROM Clientes");
            objMCuentaPuntos = new CuentaPuntos();
            listaCuentaPuntos = new ArrayList();
            while (resultado.next()) {
                objMCuentaPuntos.setId_cuenta(Integer.parseInt(resultado.getString(1)));
                objMCuentaPuntos.setId_cliente(Integer.parseInt(resultado.getString(2)));
                objMCuentaPuntos.setPuntos(Integer.parseInt(resultado.getString(3)));
                listaCuentaPuntos.add(objMCuentaPuntos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        objBD.desconectedDB();
        return listaCuentaPuntos;
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
