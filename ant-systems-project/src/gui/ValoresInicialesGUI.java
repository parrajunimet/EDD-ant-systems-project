
package gui;

public class ValoresInicialesGUI extends javax.swing.JFrame {

    public static EditCuidadesGUI interfaz4;
    
    public ValoresInicialesGUI(EditCuidadesGUI interfaz4) {
        initComponents();
        this.interfaz4 = interfaz4;
        interfaz4.setVisible(false);
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

        jComboBox1 = new javax.swing.JComboBox<>();
        nValue1 = new javax.swing.JTextField();
        Antnumber1 = new javax.swing.JLabel();
        city3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        startcity = new javax.swing.JTextField();
        endcity = new javax.swing.JTextField();
        city1 = new javax.swing.JLabel();
        city2 = new javax.swing.JLabel();
        Antnumber = new javax.swing.JLabel();
        RoValue = new javax.swing.JTextField();
        alphaValue1 = new javax.swing.JTextField();
        BetaValue = new javax.swing.JTextField();
        alpha = new javax.swing.JLabel();
        beta = new javax.swing.JLabel();
        ro = new javax.swing.JLabel();
        Antnumber2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nextGUI = new javax.swing.JButton();
        cycleValue = new javax.swing.JTextField();
        antnum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nValue1ActionPerformed(evt);
            }
        });

        Antnumber1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Antnumber1.setText("Ants number:");

        city3.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        city3.setForeground(new java.awt.Color(255, 255, 255));
        city3.setText("Start City:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese los valores iniciales: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 384, -1));

        startcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startcityActionPerformed(evt);
            }
        });
        getContentPane().add(startcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 131, 71, -1));

        endcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endcityActionPerformed(evt);
            }
        });
        getContentPane().add(endcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 178, 71, -1));

        city1.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        city1.setForeground(new java.awt.Color(255, 255, 255));
        city1.setText("Start City:");
        getContentPane().add(city1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 133, 73, 27));

        city2.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        city2.setForeground(new java.awt.Color(255, 255, 255));
        city2.setText("Final City:");
        getContentPane().add(city2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 180, 61, 27));

        Antnumber.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        Antnumber.setForeground(new java.awt.Color(255, 255, 255));
        Antnumber.setText("Ants number:");
        getContentPane().add(Antnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 133, 122, 27));

        RoValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoValueActionPerformed(evt);
            }
        });
        getContentPane().add(RoValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 71, -1));

        alphaValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphaValue1ActionPerformed(evt);
            }
        });
        getContentPane().add(alphaValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 71, -1));

        BetaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetaValueActionPerformed(evt);
            }
        });
        getContentPane().add(BetaValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 71, -1));

        alpha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        alpha.setForeground(new java.awt.Color(255, 255, 255));
        alpha.setText("α :");
        getContentPane().add(alpha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 27));

        beta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        beta.setForeground(new java.awt.Color(255, 255, 255));
        beta.setText("β :");
        getContentPane().add(beta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 27));

        ro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ro.setForeground(new java.awt.Color(255, 255, 255));
        ro.setText("ρ :");
        getContentPane().add(ro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, 20));

        Antnumber2.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        Antnumber2.setForeground(new java.awt.Color(255, 255, 255));
        Antnumber2.setText("Amount of cycles:");
        getContentPane().add(Antnumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 180, 97, 27));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Adobe Devanagari", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOTA: Si deseas cambiar un valor, simplemente presione el text area y escribe el valor.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 16));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextGUI.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        nextGUI.setText("Continuar>>");
        nextGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextGUIActionPerformed(evt);
            }
        });
        jPanel3.add(nextGUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 110, 30));

        cycleValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cycleValueActionPerformed(evt);
            }
        });
        jPanel3.add(cycleValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 71, -1));

        antnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antnumActionPerformed(evt);
            }
        });
        jPanel3.add(antnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 71, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2024-02-18 at 1.01.31 PM (1) (2).jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 290));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextGUIActionPerformed
        
    }//GEN-LAST:event_nextGUIActionPerformed

    private void RoValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoValueActionPerformed

    private void alphaValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphaValue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alphaValue1ActionPerformed

    private void BetaValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetaValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BetaValueActionPerformed

    private void antnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antnumActionPerformed

    private void startcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startcityActionPerformed

    private void endcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endcityActionPerformed

    private void nValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nValue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nValue1ActionPerformed

    private void cycleValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cycleValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cycleValueActionPerformed

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
            java.util.logging.Logger.getLogger(ValoresInicialesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValoresInicialesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValoresInicialesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValoresInicialesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValoresInicialesGUI(interfaz4).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Antnumber;
    private javax.swing.JLabel Antnumber1;
    private javax.swing.JLabel Antnumber2;
    private javax.swing.JTextField BetaValue;
    private javax.swing.JTextField RoValue;
    private javax.swing.JLabel alpha;
    private javax.swing.JTextField alphaValue1;
    private javax.swing.JTextField antnum;
    private javax.swing.JLabel beta;
    private javax.swing.JLabel city1;
    private javax.swing.JLabel city2;
    private javax.swing.JLabel city3;
    private javax.swing.JTextField cycleValue;
    private javax.swing.JTextField endcity;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nValue1;
    private javax.swing.JButton nextGUI;
    private javax.swing.JLabel ro;
    private javax.swing.JTextField startcity;
    // End of variables declaration//GEN-END:variables
}
