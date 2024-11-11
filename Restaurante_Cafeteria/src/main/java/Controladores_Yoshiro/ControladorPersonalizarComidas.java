/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores_Yoshiro;

import Modelo.ConexionBD;
import Vista.Personalizar_comidas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

/**
 *
 * @author user
 */
public class ControladorPersonalizarComidas {
    
    private Personalizar_comidas vista;
    private ConexionBD conexionBD;

    public ControladorPersonalizarComidas(Personalizar_comidas vista) {
        this.vista = vista;
        this.conexionBD = new ConexionBD();
        cargarPlatillos(); 
        // Agregar el ActionListener para el JComboBox
        vista.jComboBox2.addActionListener(e -> {
            String tipoProductoSeleccionado = (String) vista.jComboBox2.getSelectedItem();
            if (tipoProductoSeleccionado != null) {
                actualizarExtras(tipoProductoSeleccionado);  // Llamar al método para cargar los extras
            }
        });
    }

 public void cargarPlatillos() {
    // Modificamos la consulta para obtener los tipos de producto, no los productos específicos
    String sql = "SELECT nombre_tipo FROM Tipo_Producto WHERE nombre_tipo IN ('Bollos al vapor', 'Sándwiches', 'Molletes', 'Sincronizadas', 'Ramen')";

    try (Connection conn = conexionBD.connectDB();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        // Iteramos sobre los resultados y agregamos los tipos de productos al ComboBox
        while (rs.next()) {
            String tipoProducto = rs.getString("nombre_tipo");
            System.out.println("Tipo de producto cargado: " + tipoProducto);  // Para depurar
            model.addElement(tipoProducto);
        }

        // Verificar si jComboBox2 está correctamente inicializado
        if (vista.jComboBox2 != null) {
            vista.jComboBox2.setModel(model);
        } else {
            System.out.println("jComboBox2 no está inicializado");
        }

    } catch (SQLException e) {
        System.out.println("Error al cargar los tipos de productos: " + e.getMessage());
    }
}



    // Método para guardar el comentario del usuario
    public void guardarComentario() {
        String platilloSeleccionado = (String) vista.jComboBox2.getSelectedItem();
        String comentario = vista.jTextField2.getText();

        if (platilloSeleccionado != null && !comentario.trim().isEmpty()) {
            // Guardar el comentario en la base de datos
            try (Connection conn = conexionBD.connectDB()) {
                // Asegúrate de insertar el comentario con el id_producto correspondiente
                String query = "INSERT INTO Tipo_Solicitud_Especial (nombre_solicitud, id_producto) VALUES (?, ?)";
                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    // Obtener el id_producto basado en el nombre del platillo seleccionado
                    String queryIdProducto = "SELECT id_producto FROM Productos WHERE nombre_producto = ?";
                    try (PreparedStatement pstmt = conn.prepareStatement(queryIdProducto)) {
                        pstmt.setString(1, platilloSeleccionado);
                        try (ResultSet rs = pstmt.executeQuery()) {
                            if (rs.next()) {
                                int idProducto = rs.getInt("id_producto");

                                // Insertar el comentario junto con el id_producto
                                stmt.setString(1, comentario);
                                stmt.setInt(2, idProducto);
                                stmt.executeUpdate();
                                System.out.println("Comentario guardado con éxito");
                            }
                        }
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error al guardar el comentario: " + e.getMessage());
            }
        } else {
            System.out.println("Por favor, seleccione un platillo y escriba un comentario.");
        }
    }
    
    public void cargarExtrasPorTipo(String tipoProductoSeleccionado) {
        if (tipoProductoSeleccionado != null) {
            String sql = "SELECT p.nombre_producto FROM Productos p "
                       + "JOIN Tipo_Producto tp ON p.id_tipo_producto = tp.id_tipo_producto "
                       + "WHERE tp.nombre_tipo = ?";

            try (Connection conn = conexionBD.connectDB();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, tipoProductoSeleccionado);
                ResultSet rs = stmt.executeQuery();

                // Limpiar los botones antes de agregar nuevos extras
                limpiarBotones();

                int buttonIndex = 8;
                while (rs.next()) {
                    String extra = rs.getString("nombre_producto");
                    JButton button = getButton(buttonIndex);
                    if (button != null) {
                        button.setText(extra);
                        button.setVisible(true);  // Aseguramos que el botón esté visible
                    }
                    buttonIndex++;
                }

            } catch (SQLException e) {
                System.out.println("Error al cargar los extras: " + e.getMessage());
            }
        }
    }

    // Obtener el botón correspondiente por índice
    private JButton getButton(int index) {
        switch (index) {
            case 8:
                return vista.jButton8;
            case 9:
                return vista.jButton9;
            case 10:
                return vista.jButton10;
            case 11:
                return vista.jButton11;
            case 12:
                return vista.jButton12;
            default:
                return null;
        }
    }

    // Limpiar los botones de extras
    private void limpiarBotones() {
        vista.jButton8.setText("");
        vista.jButton9.setText("");
        vista.jButton10.setText("");
        vista.jButton11.setText("");
        vista.jButton12.setText("");

        // Hacerlos invisibles
        vista.jButton8.setVisible(false);
        vista.jButton9.setVisible(false);
        vista.jButton10.setVisible(false);
        vista.jButton11.setVisible(false);
        vista.jButton12.setVisible(false);
    }

    // Método para actualizar los extras (esto se puede llamar en cualquier parte del controlador)
    public void actualizarExtras(String tipoProductoSeleccionado) {
        cargarExtrasPorTipo(tipoProductoSeleccionado);
    }
}
