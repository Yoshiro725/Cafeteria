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
