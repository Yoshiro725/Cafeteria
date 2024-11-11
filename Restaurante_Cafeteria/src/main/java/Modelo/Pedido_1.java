/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class Pedido_1 {
 private Cliente cliente;
    private String fecha;
    private double monto;
    private String estado; // Estado del pedido (ej. "Pendiente", "Preparación")
    
    public Pedido_1(){}

    public Pedido_1(Cliente cliente, String fecha, double monto, String estado) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
