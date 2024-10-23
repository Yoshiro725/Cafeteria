/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class SolicitudEspecial {
    private int id_solicitud;
    private int id_producto;
    private int id_tipo_solicitud;

    public SolicitudEspecial() {}

    public SolicitudEspecial(int id_solicitud, int id_producto, int id_tipo_solicitud) {
        this.id_solicitud = id_solicitud;
        this.id_producto = id_producto;
        this.id_tipo_solicitud = id_tipo_solicitud;
    }

    public int getId_solicitud() {
        return id_solicitud;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getId_tipo_solicitud() {
        return id_tipo_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setId_tipo_solicitud(int id_tipo_solicitud) {
        this.id_tipo_solicitud = id_tipo_solicitud;
    }

    
}

