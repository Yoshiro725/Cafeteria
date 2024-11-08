/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Yoshiro
 */
public class CuentaPuntos {
    private int id_cuenta;
    private int id_cliente;
    private int puntos;

    public CuentaPuntos() {
    }

    public CuentaPuntos(int id_cuenta, int id_cliente, int puntos) {
        this.id_cuenta = id_cuenta;
        this.id_cliente = id_cliente;
        this.puntos = puntos;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

   
}

