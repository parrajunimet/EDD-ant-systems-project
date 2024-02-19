
package gui;
    
public class EditCuidadesGUI extends javax.swing.JFrame {

    public static EditorTxtGUI interfaz2;
    
    public EditCuidadesGUI(EditorTxtGUI interfaz2) {
        initComponents();
        this.interfaz2 = interfaz2;
        interfaz2.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        valor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        agregarciudad = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Continue = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CiudadInicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CiudadFinal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jLabel4.setFont(new java.awt.Font("Adobe Devanagari", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ciudad:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setText("Ciudades");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 19, -1, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 53, 390, 110));

        valor.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 71, 20));

        jLabel2.setFont(new java.awt.Font("Adobe Devanagari", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ciudad:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 60, -1));

        agregarciudad.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        agregarciudad.setText("Agregar");
        agregarciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarciudadActionPerformed(evt);
            }
        });
        getContentPane().add(agregarciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 100, -1));

        jButton1.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        jButton1.setText("Eliminar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 100, -1));

        Continue.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        Continue.setText("Continuar>>");
        Continue.setActionCommand("Volver ");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });
        getContentPane().add(Continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 110, 30));

        jLabel5.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ciudad Inicial");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, -1));

        CiudadInicial.setFont(new java.awt.Font("Adobe Devanagari", 0, 12)); // NOI18N
        CiudadInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadInicialActionPerformed(evt);
            }
        });
        getContentPane().add(CiudadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 71, 22));

        jLabel3.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ciudad Final");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 100, 16));

        CiudadFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadFinalActionPerformed(evt);
            }
        });
        getContentPane().add(CiudadFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 71, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2024-02-18 at 1.01.31 PM (1) (2).jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 470, 330));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        ValoresInicialesGUI interfaz4 = new ValoresInicialesGUI(this);
    }//GEN-LAST:event_ContinueActionPerformed

    private void agregarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarciudadActionPerformed

    private void CiudadInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CiudadInicialActionPerformed

    private void CiudadFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CiudadFinalActionPerformed

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
            java.util.logging.Logger.getLogger(EditCuidadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCuidadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCuidadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCuidadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCuidadesGUI(interfaz2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CiudadFinal;
    private javax.swing.JTextField CiudadInicial;
    private javax.swing.JButton Continue;
    private javax.swing.JButton agregarciudad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
