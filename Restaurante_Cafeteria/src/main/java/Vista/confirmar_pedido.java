/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author fresi
 */
public class confirmar_pedido extends javax.swing.JFrame {

    /**
     * Creates new form confirmar_pedido
     */
    public confirmar_pedido() {
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

        btn_facturar = new javax.swing.JButton();
        btn_ordenar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        bts_pagar = new javax.swing.JButton();
        btn_facturar1 = new javax.swing.JButton();
        btn_ordenar1 = new javax.swing.JButton();
        btn_confirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btn_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/catfeteriauwu/imagenes/icono factura.png"))); // NOI18N
        btn_facturar.setBorder(null);
        btn_facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturarActionPerformed(evt);
            }
        });

        btn_ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/catfeteriauwu/imagenes/icono orden.png"))); // NOI18N
        btn_ordenar.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_atras.setBackground(new java.awt.Color(228, 208, 194));
        btn_atras.setText("Regresar");
        btn_atras.setBorder(null);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 100, 30));

        bts_pagar.setBackground(new java.awt.Color(228, 208, 194));
        bts_pagar.setText("Pagar");
        bts_pagar.setBorder(null);
        getContentPane().add(bts_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 100, 30));

        btn_facturar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/catfeteriauwu/imagenes/icono factura.png"))); // NOI18N
        btn_facturar1.setBorder(null);
        btn_facturar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_facturar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 60, 40));

        btn_ordenar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/catfeteriauwu/imagenes/icono orden.png"))); // NOI18N
        btn_ordenar1.setBorder(null);
        getContentPane().add(btn_ordenar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 60, -1));

        btn_confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/catfeteriauwu/imagenes/icono confirmar orden.png"))); // NOI18N
        btn_confirmar.setBorder(null);
        getContentPane().add(btn_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/catfeteriauwu/imagenes/factura.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturarActionPerformed

    private void btn_facturar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturar1ActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(confirmar_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirmar_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirmar_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirmar_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new confirmar_pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JButton btn_facturar;
    private javax.swing.JButton btn_facturar1;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JButton btn_ordenar1;
    private javax.swing.JButton bts_pagar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
