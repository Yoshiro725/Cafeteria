/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author grecia
 */
  // ControladorClientes.java
import Vista.Confirmar_pedido_cliente;
import Vista.Factura_cliente;
import Vista.Inicio_clientes;
import Vista.Menu_paquetes;
import Vista.Personalizar_bebidas;
import Vista.Personalizar_comidas;
import Vista.Personalizar_postres;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorClientes implements ActionListener {
    private ModeloClientes modelo;
    private Inicio_clientes inicio_clientes;
    private final Personalizar_bebidas Personalizar_bebidas;
    private final Personalizar_postres Personalizar_postres;
    private final Personalizar_comidas Personalizar_comidas;
    private final Confirmar_pedido_cliente Confirmar_pedido_cliente;
    private final Factura_cliente Factura_cliente;
    private final Menu_paquetes Menu_paquetes;
    private final Inicio_clientes Inicio_clientes;

    public ControladorClientes(ModeloClientes modelo, Inicio_clientes inicio, Personalizar_bebidas bebidas,
                               Personalizar_postres postres, Personalizar_comidas comida,
                               Confirmar_pedido_cliente confirmar, Factura_cliente factura, Menu_paquetes paquetes) {
        this.modelo = modelo;
        this.Inicio_clientes = inicio;
        this.Personalizar_bebidas = bebidas;
        this.Personalizar_postres = postres;
        this.Personalizar_comidas = comida;
        this.Confirmar_pedido_cliente = confirmar;
        this.Factura_cliente = factura;
        this.Menu_paquetes = paquetes;

        // Asignar controlador a botones en la vista de inicio
        inicio.btn_bebidas.addActionListener(this);
        inicio.btn_comida.addActionListener(this);
        inicio.btn_confirmar.addActionListener(this);
        inicio.btn_facturar.addActionListener(this);
        inicio.btn_ordenar1.addActionListener(this);
        inicio.btn_paquetes.addActionListener(this);
        inicio.btn_postres.addActionListener(this);

        // Mostrar la vista de inicio al comenzar
        inicio.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Inicio_clientes.btn_bebidas) {
            Inicio_clientes.setVisible(false);
            Personalizar_bebidas.setVisible(true);
        } else if (e.getSource() == Inicio_clientes.btn_comida) {
            Inicio_clientes.setVisible(false);
            Personalizar_comidas.setVisible(true);
        } else if (e.getSource() == Inicio_clientes.btn_confirmar) {
            Inicio_clientes.setVisible(false);
            Confirmar_pedido_cliente.setVisible(true);
        } else if (e.getSource() == Inicio_clientes.btn_facturar) {
            Inicio_clientes.setVisible(false);
            Factura_cliente.setVisible(true);
        } else if (e.getSource() == Inicio_clientes.btn_ordenar1) {
            JOptionPane.showMessageDialog(Inicio_clientes, "Estás aquí", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == Inicio_clientes.btn_paquetes) {
            Inicio_clientes.setVisible(false);
            Menu_paquetes.setVisible(true);
        } else if (e.getSource() == Inicio_clientes.btn_postres) {
            Inicio_clientes.setVisible(false);
            Personalizar_postres.setVisible(true);
        }
    }
}
  
   