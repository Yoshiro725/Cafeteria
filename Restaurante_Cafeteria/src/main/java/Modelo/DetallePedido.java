/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class DetallePedido {
    private int id_detalle;
    private int id_pedido;
    private int id_producto;
    private int cantidad;
    private double subtotal;

    public DetallePedido() {}

    public DetallePedido(int id_detalle, int id_pedido, int id_producto, int cantidad, double subtotal) {
        this.id_detalle = id_detalle;
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

   
}
