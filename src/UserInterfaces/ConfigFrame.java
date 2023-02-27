/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterfaces;

/**
 *      +--------------------------+
 *      |                          |
 *      |  @author BenjaminFisico! |
 *      |                          |
 *      +--------------------------+
 */
public class ConfigFrame extends javax.swing.JFrame {
    
    // External - attributes
    private Controllers.UiController uiController;

    public ConfigFrame(Controllers.UiController uic) {
        initComponents();
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setTitle("Minimalist Management Library - V 0.0 [CONFIGURATION]");
        uiController = uic;
        
        jLblTitle.setLocation(250, 250);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCmbTheme = new javax.swing.JComboBox<>();
        jLblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCmbTheme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Claro", "oscuro" }));
        jCmbTheme.setBorder(javax.swing.BorderFactory.createTitledBorder("- TEMA -"));
        getContentPane().add(jCmbTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, 102, -1));

        jLblTitle.setText("CONFIGURACION");
        getContentPane().add(jLblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 362, 10));

        jButton1.setText("<-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 50, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        uiController.ChangeFrame(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCmbTheme;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
