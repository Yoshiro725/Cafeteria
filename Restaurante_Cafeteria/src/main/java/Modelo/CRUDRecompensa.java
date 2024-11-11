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
public class CRUDRecompensa implements Almacenamiento{
    ArrayList<Recompensa> listaRecompensa;
    Recompensa objMRecompensa;
    ConexionBD objBD = new ConexionBD();

    public CRUDRecompensa() {
        this.objMRecompensa = new Recompensa();
    }

    public Recompensa getObjMRecompensa() {
        return objMRecompensa;
    }

    public void setObjMRecompensa(Recompensa objMRecompensa) {
        this.objMRecompensa = objMRecompensa;
    }
    
    
    
    @Override
    public void create() {
        objBD.connectDB();
        try{
            String query = "INSERT INTO recompensas (descripcion, puntos_necesarios, id_cuenta) VALUES (?,?,?)";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setString(1, objMRecompensa.getDescripcion());
            statement.setInt(2, objMRecompensa.getPuntos_necesarios());
            statement.setInt(3, objMRecompensa.getId_cuenta());
            
            statement.executeLargeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDRecompensa.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            objBD.desconectedDB();
        }
    }

    @Override
    public ArrayList read() {
        objBD.connectDB();
        try{
            ResultSet resultado = objBD.connection.createStatement().executeQuery("SELECT * FROM recompensas");
            objMRecompensa = new Recompensa();
            listaRecompensa = new ArrayList();
            while(resultado.next()){
                objMRecompensa.setId_recompensa(Integer.parseInt(resultado.getString(1)));
                objMRecompensa.setDescripcion(resultado.getString(2));
                objMRecompensa.setPuntos_necesarios(Integer.parseInt(resultado.getString(3)));
                objMRecompensa.setId_cuenta(Integer.parseInt(resultado.getString(4)));
                listaRecompensa.add(objMRecompensa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CRUDRecompensa.class.getName()).log(Level.SEVERE, null, ex);
        }
        objBD.desconectedDB();
        return listaRecompensa;
    }

    @Override
    public void update() {
        objBD.connectDB();

        try {
            objBD.connection.createStatement().execute(
                    "UPDATE recompensas SET ? = ? WHERE id_recompensa = " + objMRecompensa.getId_recompensa()+ ";"
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
            String query = "DELETE FROM recompensas WHERE id_recompensa = ?";
            PreparedStatement statement = objBD.connection.prepareStatement(query);
            statement.setInt(1, objMRecompensa.getId_recompensa());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            objBD.desconectedDB();
        }
    }

}
