/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class Cliente_1 {
    
    private String nombre;
    private String correo;
    private int telefono;

    
    //Constructor vacio
    public Cliente_1() {}
    
    //Constructor 

    public Cliente_1(String nombre, String correo, int telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    //Getter y Settter
    
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
