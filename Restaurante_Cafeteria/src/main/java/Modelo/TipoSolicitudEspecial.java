/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class TipoSolicitudEspecial {
    private int idTipoSolicitud;
    private String nombreSolicitud;
    
    public TipoSolicitudEspecial() {}

    public TipoSolicitudEspecial(int idTipoSolicitud, String nombreSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
        this.nombreSolicitud = nombreSolicitud;
    }

    public int getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public String getNombreSolicitud() {
        return nombreSolicitud;
    }

    public void setIdTipoSolicitud(int idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    public void setNombreSolicitud(String nombreSolicitud) {
        this.nombreSolicitud = nombreSolicitud;
    }
    
     @Override
    public String toString() {
        return "Tipo_Solicitud_Especial [idTipoSolicitud=" + idTipoSolicitud + ", nombreSolicitud=" + nombreSolicitud + "]";
    }
}
