/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class CuentaPuntos_1 {
    private Cliente cliente;
    private int puntos;
    private String fechaActualizacion; // Fecha de la última actualización de puntos
    
    public CuentaPuntos_1(){}

    public CuentaPuntos_1(Cliente cliente, int puntos, String fechaActualizacion) {
        this.cliente = cliente;
        this.puntos = puntos;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    
    @Override
public String toString() {
    return "CuentaPuntos [cliente=" + cliente + 
           ", puntos=" + puntos + ", fechaActualizacion=" + fechaActualizacion + "]";
}

}
