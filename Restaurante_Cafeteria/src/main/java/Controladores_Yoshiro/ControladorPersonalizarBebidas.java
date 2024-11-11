/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores_Yoshiro;

import Modelo.ConexionBD;
import Vista.Personalizar_bebidas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class ControladorPersonalizarBebidas {
    private Personalizar_bebidas vista;
    private ConexionBD conexionBD;

    public ControladorPersonalizarBebidas(Personalizar_bebidas vista) {
        this.vista = vista;
        this.conexionBD = new ConexionBD();
        cargarTiposBebidas();
        cargarTiposLeche();
        configurarEventosComboBox();
        cargarExtras();
    }

    private void cargarTiposBebidas() {
        try (Connection conn = conexionBD.connectDB()) {
            // Cargar tipos de producto que sean solo bebidas en jComboBox4
            String queryTipoProducto = "SELECT nombre_tipo FROM Tipo_Producto WHERE nombre_tipo IN ('Bebida', 'Frappe', 'Soda')";
            try (Statement stmt = conn.createStatement();
                 ResultSet rsTipoProducto = stmt.executeQuery(queryTipoProducto)) {
                while (rsTipoProducto.next()) {
                    vista.jComboBox4.addItem(rsTipoProducto.getString("nombre_tipo"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  private void cargarTiposLeche() {
    try (Connection conn = conexionBD.connectDB()) {
        // Consulta para obtener los productos relacionados con id_tipo_producto = 9 (leche)
        String queryLeche = "SELECT nombre_producto FROM Productos WHERE id_tipo_producto = 9";
        try (Statement stmt = conn.createStatement();
             ResultSet rsLeche = stmt.executeQuery(queryLeche)) {
            while (rsLeche.next()) {
                // Añadir los productos de leche al jComboBox6
                vista.jComboBox6.addItem(rsLeche.getString("nombre_producto"));
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}



    private void configurarEventosComboBox() {
    vista.jComboBox4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cargarProductosPorTipo();

            // Lógica para desactivar/activar el combo de tipos de leche
            String tipoSeleccionado = (String) vista.jComboBox4.getSelectedItem();
            if ("Soda".equalsIgnoreCase(tipoSeleccionado) || "OtraBebidaSinLeche".equalsIgnoreCase(tipoSeleccionado)) {
                // Si la bebida seleccionada no lleva leche, desactiva el combo de tipos de leche
                vista.jComboBox6.setEnabled(false);
                vista.jComboBox6.setSelectedItem(null); // Limpiar la selección
            } else {
                // Si la bebida sí permite leche, activa el combo de tipos de leche
                vista.jComboBox6.setEnabled(true);
            }
        }
    });
}


    private void cargarProductosPorTipo() {
        vista.jComboBox5.removeAllItems(); // Limpiar jComboBox5
        String tipoSeleccionado = (String) vista.jComboBox4.getSelectedItem();

        try (Connection conn = conexionBD.connectDB()) {
            String queryProductos = "SELECT nombre_producto FROM Productos p " +
                                    "JOIN Tipo_Producto tp ON p.id_tipo_producto = tp.id_tipo_producto " +
                                    "WHERE tp.nombre_tipo = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(queryProductos)) {
                pstmt.setString(1, tipoSeleccionado);
                try (ResultSet rsProductos = pstmt.executeQuery()) {
                    while (rsProductos.next()) {
                        vista.jComboBox5.addItem(rsProductos.getString("nombre_producto"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


   private void cargarExtras() {
    // Obtener la conexión de la clase ConexionBD
    try (Connection conn = conexionBD.connectDB()) {
        // Cargar productos que sean de tipo 'extra' (id_tipo_producto = 10) para los botones
        String queryExtras = "SELECT nombre_producto FROM Productos WHERE id_tipo_producto = 10";
        try (Statement stmt = conn.createStatement();
             ResultSet rsExtras = stmt.executeQuery(queryExtras)) {

            int index = 1; // Empezamos con el botón 1
            while (rsExtras.next() && index <= 5) {
                String extraNombre = rsExtras.getString("nombre_producto");
                System.out.println("Cargando extra: " + extraNombre); // Línea de depuración

                // Asignamos los extras a los botones
                switch (index) {
                    case 1:
                        vista.jButton9.setText(extraNombre);
                        break;
                    case 2:
                        vista.jButton10.setText(extraNombre);
                        break;
                    case 3:
                        vista.jButton11.setText(extraNombre);
                        break;
                    case 4:
                        vista.jButton12.setText(extraNombre);
                        break;
                    case 5:
                        vista.jButton8.setText(extraNombre);
                        break;
                }
                index++;
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    
   }
}
