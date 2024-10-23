/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
import java.sql.Date;

public class Pedido {
    private int id_pedido;
    private int id_cliente;
    private Date fecha;
    private double monto;

    public Pedido() {}

    public Pedido(int id_pedido, int id_cliente, Date fecha, double monto) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    
}

