/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class Recompensas {
    private String descripcion;
    private int puntosNecesarios;
    
    public Recompensas (){}

    public Recompensas(String descripcion, int puntosNecesarios) {
        this.descripcion = descripcion;
        this.puntosNecesarios = puntosNecesarios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPuntosNecesarios() {
        return puntosNecesarios;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPuntosNecesarios(int puntosNecesarios) {
        this.puntosNecesarios = puntosNecesarios;
    }
    
    @Override
public String toString() {
    return "Recompensas [descripcion=" + descripcion + 
           ", puntosNecesarios=" + puntosNecesarios + "]";
}

    
}
