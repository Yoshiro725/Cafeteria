/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class Producto_1 {
    private String nombreProducto;
    private double precio;
    private int stock;
    private TipoProducto tipoProducto; // Relación con Tipo_Producto
    
    public Producto_1(){}

    public Producto_1(String nombreProducto, double precio, int stock, TipoProducto tipoProducto) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.tipoProducto = tipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    @Override
public String toString() {
    return "Productos [nombreProducto=" + nombreProducto + 
           ", precio=" + precio + ", stock=" + stock + ", tipoProducto=" + tipoProducto + "]";
}

    
}
