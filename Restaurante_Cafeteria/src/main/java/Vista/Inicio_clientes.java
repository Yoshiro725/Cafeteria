/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author fresi
 */
public class Inicio_clientes extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_clientes
     */
    public Inicio_clientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_bebidas = new javax.swing.JButton();
        btn_postres = new javax.swing.JButton();
        btn_comida = new javax.swing.JButton();
        btn_paquetes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_facturar = new javax.swing.JButton();
        btn_ordenar = new javax.swing.JButton();
        btn_confirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_bebidas.setBackground(new java.awt.Color(219, 215, 194));
        btn_bebidas.setText("Bebidas");
        btn_bebidas.setBorder(null);
        getContentPane().add(btn_bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, 50));

        btn_postres.setBackground(new java.awt.Color(219, 215, 194));
        btn_postres.setText("Postres");
        btn_postres.setBorder(null);
        getContentPane().add(btn_postres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 90, 50));

        btn_comida.setBackground(new java.awt.Color(219, 215, 194));
        btn_comida.setText("Platillos");
        btn_comida.setBorder(null);
        getContentPane().add(btn_comida, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 80, 50));

        btn_paquetes.setBackground(new java.awt.Color(219, 215, 194));
        btn_paquetes.setText("Paquetes");
        btn_paquetes.setBorder(null);
        getContentPane().add(btn_paquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 90, 60));

        jButton1.setBackground(new java.awt.Color(219, 215, 194));
        jButton1.setText("Colaboraciones");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 220, 100));

        btn_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/catfeteriauwu/imagenes/icono factura.png"))); // NOI18N
        btn_facturar.setBorder(null);
        btn_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 60, 40));

        btn_ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/catfeteriauwu/imagenes/icono orden.png"))); // NOI18N
        btn_ordenar.setBorder(null);
        getContentPane().add(btn_ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 60, -1));

        btn_confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/catfeteriauwu/imagenes/icono confirmar orden.png"))); // NOI18N
        btn_confirmar.setBorder(null);
        getContentPane().add(btn_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 50, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/catfeteriauwu/imagenes/Cafeteria Catfecito clientes(3).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bebidas;
    private javax.swing.JButton btn_comida;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JButton btn_facturar;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JButton btn_paquetes;
    private javax.swing.JButton btn_postres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}