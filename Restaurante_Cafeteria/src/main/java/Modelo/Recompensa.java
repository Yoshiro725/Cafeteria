/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class Recompensa {
    private int id_recompensa;
    private String descripcion;
    private int puntos_necesarios;
    private int id_cuenta;

    public Recompensa() {}

    public Recompensa(int id_recompensa, String descripcion, int puntos_necesarios, int id_cuenta) {
        this.id_recompensa = id_recompensa;
        this.descripcion = descripcion;
        this.puntos_necesarios = puntos_necesarios;
        this.id_cuenta = id_cuenta;
    }

    public int getId_recompensa() {
        return id_recompensa;
    }

    public void setId_recompensa(int id_recompensa) {
        this.id_recompensa = id_recompensa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntos_necesarios() {
        return puntos_necesarios;
    }

    public void setPuntos_necesarios(int puntos_necesarios) {
        this.puntos_necesarios = puntos_necesarios;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

   
}

