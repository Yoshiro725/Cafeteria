/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class DetallePedido_1 {
    private Pedido pedido;
    private Producto producto;
    private int cantidad;
    private double subtotal;
    private String comentario; // Comentario específico para el producto

    public DetallePedido_1(){}

    public DetallePedido_1(Pedido pedido, Producto producto, int cantidad, double subtotal, String comentario) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.comentario = comentario;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public String getComentario() {
        return comentario;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
     @Override
    public String toString() {
        return "DetallePedido [pedido=" + pedido + ", producto=" + producto + 
               ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", comentario=" + comentario + "]";
    }
}
