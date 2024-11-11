/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class SolicitudEspecial_1 {
    private Producto producto;
    private TipoSolicitudEspecial tipoSolicitud;
    private String descripcion; // Detalles adicionales de la solicitud específica del cliente

     public SolicitudEspecial_1() {
         
    }

    public SolicitudEspecial_1(Producto producto, TipoSolicitudEspecial tipoSolicitud, String descripcion) {
        this.producto = producto;
        this.tipoSolicitud = tipoSolicitud;
        this.descripcion = descripcion;
    }

    public Producto getProducto() {
        return producto;
    }

    public TipoSolicitudEspecial getTipoSolicitud() {
        return tipoSolicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setTipoSolicitud(TipoSolicitudEspecial tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
     
     @Override
public String toString() {
    return "SolicitudEspecial [producto=" + producto + 
           ", tipoSolicitud=" + tipoSolicitud + ", descripcion=" + descripcion + "]";
}

     
}
