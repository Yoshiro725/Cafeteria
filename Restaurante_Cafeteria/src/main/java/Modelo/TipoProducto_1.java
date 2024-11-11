/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class TipoProducto_1 {
    private int idTipoProducto; // ID del tipo de producto, coincide con id_tipo_producto en la BD
    private String nombreTipo;  // Nombre del tipo de producto, como "Bebida", "Postre", etc.
    
    //Constructor Vacio
    public TipoProducto_1(){}
    
    //Constructor Vacio 
    public TipoProducto_1(int idTipoProducto, String nombreTipo) {
        this.idTipoProducto = idTipoProducto;
        this.nombreTipo = nombreTipo;
    }
    
    //Setter y Getters

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    
    
    
}
