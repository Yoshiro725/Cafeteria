/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CRUDSolicitudEspecial implements Almacenamiento{
    ArrayList<SolicitudEspecial> listaSolicitudEspecial;
    SolicitudEspecial objMSolicitudEspecial;
    ConexionBD objBD = new ConexionBD();

    public CRUDSolicitudEspecial() {
        this.objMSolicitudEspecial = new SolicitudEspecial();
    }

    public SolicitudEspecial getObjMSolicitudEspecial() {
        return objMSolicitudEspecial;
    }

    public void setObjMSolicitudEspecial(SolicitudEspecial objMSolicitudEspecial) {
        this.objMSolicitudEspecial = objMSolicitudEspecial;
    }
    
    
    
    @Override
    public void create() {
//        objBD.connectDB();
//        try{
//            String query = "INSERT INTO solicutd";
//        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

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
