/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author fresi
 */
public class Menu_colaboraciones extends javax.swing.JFrame {

    /**
     * Creates new form Menu_colaboraciones
     */
    public Menu_colaboraciones() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setBackground(new java.awt.Color(254, 240, 237));
        jButton1.setText("Escojer ( $ 280 c/u )");
        jButton1.setBorder(null);

        jButton2.setBackground(new java.awt.Color(254, 240, 237));
        jButton2.setText("Escojer ( $ 150 c/u )");
        jButton2.setBorder(null);

        jButton3.setBackground(new java.awt.Color(208, 181, 162));
        jButton3.setText("< Atras");
        jButton3.setBorder(null);

        jButton4.setBackground(new java.awt.Color(208, 181, 162));
        jButton4.setText("Comprar mas");
        jButton4.setBorder(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "mas de 5" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "mas de 5" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(254, 240, 237));
        jButton5.setText("Escojer ( $ 280 c/u )");
        jButton5.setBorder(null);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 140, 40));

        jButton6.setBackground(new java.awt.Color(254, 240, 237));
        jButton6.setText("Escojer ( $ 150 c/u )");
        jButton6.setBorder(null);
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 140, 40));

        jButton7.setBackground(new java.awt.Color(208, 181, 162));
        jButton7.setText("< Atras");
        jButton7.setBorder(null);
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 100, 30));

        jButton8.setBackground(new java.awt.Color(208, 181, 162));
        jButton8.setText("Comprar mas");
        jButton8.setBorder(null);
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 620, 100, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "mas de 5" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 40, 20));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "mas de 5" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 272, 40, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_colaboraciones.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu_colaboraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_colaboraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_colaboraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_colaboraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_colaboraciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JComboBox<String> jComboBox3;
    public javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
