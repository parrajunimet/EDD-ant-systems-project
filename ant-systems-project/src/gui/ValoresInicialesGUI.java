
package gui;

import edd.Matriz;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValoresInicialesGUI extends javax.swing.JFrame {

    public static EditCuidadesGUI interfaz4;
    public static IniciarSimulacionGUI interfaz4back;
    private Matriz grafo; 
    
    public ValoresInicialesGUI(EditCuidadesGUI interfaz4) {
        initComponents();
        this.interfaz4 = interfaz4;
        this.grafo = interfaz4.getGrafo();
        interfaz4.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.notify.setVisible(false);
    }
    
    public ValoresInicialesGUI(IniciarSimulacionGUI interfaz4back) {
        initComponents();
        this.interfaz4back = interfaz4back;
        this.grafo = interfaz4.getGrafo();
        interfaz4back.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.notify.setVisible(false);
    }

    public Matriz getGrafo() {
        return grafo;
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
        GammaValue = new javax.swing.JTextField();
        alphaValue = new javax.swing.JTextField();
        BetaValue = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nextGUI = new javax.swing.JButton();
        cycleValue = new javax.swing.JTextField();
        antnum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        startcity = new javax.swing.JTextField();
        endcity = new javax.swing.JTextField();
        notify = new javax.swing.JLabel();
        city1 = new javax.swing.JLabel();
        city2 = new javax.swing.JLabel();
        Antnumber = new javax.swing.JLabel();
        Antnumber2 = new javax.swing.JLabel();
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

        GammaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GammaValueActionPerformed(evt);
            }
        });
        getContentPane().add(GammaValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 71, -1));

        alphaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphaValueActionPerformed(evt);
            }
        });
        getContentPane().add(alphaValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 71, -1));

        BetaValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetaValueActionPerformed(evt);
            }
        });
        getContentPane().add(BetaValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 71, -1));

        label1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("α :");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 27));

        label2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("β :");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 27));

        label3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("ρ :");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, 20));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Adobe Devanagari", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOTA: Si deseas cambiar un valor, simplemente presione el text area y escribe el valor.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 16));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextGUI.setBackground(new java.awt.Color(102, 51, 0));
        nextGUI.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        nextGUI.setForeground(new java.awt.Color(255, 255, 255));
        nextGUI.setText("Continuar>>");
        nextGUI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextGUIActionPerformed(evt);
            }
        });
        jPanel3.add(nextGUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 110, 30));

        cycleValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cycleValueActionPerformed(evt);
            }
        });
        jPanel3.add(cycleValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 71, -1));

        antnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antnumActionPerformed(evt);
            }
        });
        jPanel3.add(antnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 71, -1));

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<Volver");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 30));

        startcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startcityActionPerformed(evt);
            }
        });
        jPanel3.add(startcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 71, -1));

        endcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endcityActionPerformed(evt);
            }
        });
        jPanel3.add(endcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 71, -1));

        notify.setBackground(new java.awt.Color(204, 153, 0));
        notify.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        notify.setForeground(new java.awt.Color(204, 0, 0));
        jPanel3.add(notify, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 440, 40));

        city1.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        city1.setForeground(new java.awt.Color(255, 255, 255));
        city1.setText("Start City:");
        jPanel3.add(city1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 73, 27));

        city2.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        city2.setForeground(new java.awt.Color(255, 255, 255));
        city2.setText("Final City:");
        jPanel3.add(city2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 27));

        Antnumber.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        Antnumber.setForeground(new java.awt.Color(255, 255, 255));
        Antnumber.setText("Ants number:");
        jPanel3.add(Antnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 122, 27));

        Antnumber2.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        Antnumber2.setForeground(new java.awt.Color(255, 255, 255));
        Antnumber2.setText("Amount of cycles:");
        jPanel3.add(Antnumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 130, 27));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2024-02-18 at 12.14.25 PM.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 290));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void nextGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextGUIActionPerformed
        this.notify.setVisible(false);
        this.notify.setText("");
        try {
           double ant, cycles, alpha, beta, gamma; 
           alpha = Double.parseDouble(this.alphaValue.getText());
           beta = Double.parseDouble(this.BetaValue.getText());
           gamma = Double.parseDouble(this.GammaValue.getText()); 
           ant= Double.parseDouble(this.antnum.getText()); 
           cycles = Double.parseDouble(this.cycleValue.getText());  
           if (alpha >= 0 && beta >=1 && (gamma > 0 && gamma<=1) && ant > 0 && cycles > 0 && ((double)((int)cycles) == cycles) && ((double)((int)ant) == ant)) {
               int c = (int)cycles; 
               int a = (int)ant; 
               if (this.grafo.isVert(this.startcity.getText()) && this.grafo.isVert(this.endcity.getText()) ) {
                   String ciudadi, ciudadf; 
                   ciudadi =this.startcity.getText(); 
                   ciudadf = this.endcity.getText(); 
                   if (!ciudadi.equalsIgnoreCase(ciudadf)) {
                       IniciarSimulacionGUI interfaz5a = new IniciarSimulacionGUI(this, ciudadi, ciudadf, c, a, alpha, beta, gamma);
                   }else {
                        this.notify.setVisible(true);
                        this.notify.setText("Por favor, ingrese ciudades diferentes");
                   }
                   
               }else {
                   this.notify.setVisible(true);
                   this.notify.setText("Por favor, entre ciudades de inicio y final existentes.");
               }     
           }else if (((double)((int)cycles) != cycles) || ((double)((int)ant) != ant)) {
               this.notify.setVisible(true);
               this.notify.setText("Por favor, solo ingrese valores enteros para el numero de ciclos y el numero de hormigas.");
           }else if  (alpha < 0) {
               this.notify.setVisible(true);
               this.notify.setText("Alpha debe ser mayor o igual a cero");
           } else if (beta < 1) {
               this.notify.setVisible(true);
               this.notify.setText("Beta debe ser mayor o igual a uno");
           } else if (gamma <= 0 || gamma> 1) {
               this.notify.setVisible(true);
               this.notify.setText("Gamma debe estar en el intervalo (o, 1]");   
           } else if (ant < 0 ) {
               this.notify.setVisible(true);
               this.notify.setText("El numero de hormigas debe ser un entero mayor a 0");
            } else {
               this.notify.setVisible(true);
               this.notify.setText("Por favor ingrese datos validos. ");
           }     
        } catch (Exception E) {
            this.notify.setVisible(true);
            this.notify.setText("Por favor, solo ingrese numeros");
        }
    }//GEN-LAST:event_nextGUIActionPerformed

    private void GammaValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GammaValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GammaValueActionPerformed

    private void alphaValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphaValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alphaValueActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            EditCuidadesGUI interfaz3back = new EditCuidadesGUI(this);
        } catch (Exception ex) {
            Logger.getLogger(ValoresInicialesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JTextField GammaValue;
    private javax.swing.JTextField alphaValue;
    private javax.swing.JTextField antnum;
    private javax.swing.JLabel city1;
    private javax.swing.JLabel city2;
    private javax.swing.JLabel city3;
    private javax.swing.JTextField cycleValue;
    private javax.swing.JTextField endcity;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTextField nValue1;
    private javax.swing.JButton nextGUI;
    private javax.swing.JLabel notify;
    private javax.swing.JTextField startcity;
    // End of variables declaration//GEN-END:variables
}
