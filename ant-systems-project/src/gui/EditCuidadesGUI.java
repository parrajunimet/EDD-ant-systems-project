
package gui;
    
import edd.Matriz;

public class EditCuidadesGUI extends javax.swing.JFrame {

    public static EditorTxtGUI interfaz2;
    public static AgregarCiudadesGUI interfazC;
    public static EliminarCiudades interfazD;
    public static ValoresInicialesGUI interfaz3back;
    private Matriz grafo;
    private Matriz grafoupdated; 
    
    public EditCuidadesGUI(ValoresInicialesGUI interfaz3back) {
        initComponents();
        this.interfaz3back = interfaz3back;
        this.setResizable(false);
        interfaz3back.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public EditCuidadesGUI(EliminarCiudades interfazD) {
        initComponents();
        this.interfazD = interfazD;
        this.setResizable(false);
        interfazD.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public EditCuidadesGUI(AgregarCiudadesGUI interfazC) {
        initComponents();
        this.setResizable(false);
        this.interfazC = interfazC;
        interfazC.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public EditCuidadesGUI(EditorTxtGUI interfaz2) {
        initComponents();
        this.setResizable(false);
        this.interfaz2 = interfaz2;
        interfaz2.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public EditCuidadesGUI(Matriz grafo) {
        initComponents();
        this.grafo = grafo;
        this.grafoupdated = grafoupdated;
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
        ciudades = new javax.swing.JTextArea();
        agregarciudad = new javax.swing.JButton();
        eliminarciudades = new javax.swing.JButton();
        Continue = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        goback = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Adobe Devanagari", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ciudad:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 2, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ciudades");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 20));

        ciudades.setColumns(20);
        ciudades.setRows(5);
        jScrollPane1.setViewportView(ciudades);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, 110));

        agregarciudad.setBackground(new java.awt.Color(102, 51, 0));
        agregarciudad.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        agregarciudad.setForeground(new java.awt.Color(255, 255, 255));
        agregarciudad.setText("Agregar");
        agregarciudad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agregarciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarciudadActionPerformed(evt);
            }
        });
        getContentPane().add(agregarciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, -1));

        eliminarciudades.setBackground(new java.awt.Color(102, 51, 0));
        eliminarciudades.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        eliminarciudades.setForeground(new java.awt.Color(255, 255, 255));
        eliminarciudades.setText("Eliminar");
        eliminarciudades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarciudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarciudadesActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarciudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 210, -1));

        Continue.setBackground(new java.awt.Color(102, 51, 0));
        Continue.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        Continue.setForeground(new java.awt.Color(255, 255, 255));
        Continue.setText("Continuar>>");
        Continue.setActionCommand("Volver ");
        Continue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });
        getContentPane().add(Continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 110, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        goback.setBackground(new java.awt.Color(102, 51, 0));
        goback.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        goback.setForeground(new java.awt.Color(255, 255, 255));
        goback.setText("<<Volver");
        goback.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });
        getContentPane().add(goback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2024-02-18 at 12.14.25 PM.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        ValoresInicialesGUI interfaz4 = new ValoresInicialesGUI(this);
    }//GEN-LAST:event_ContinueActionPerformed

    private void agregarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarciudadActionPerformed
        AgregarCiudadesGUI interfazB = new AgregarCiudadesGUI(this);
    }//GEN-LAST:event_agregarciudadActionPerformed

    private void eliminarciudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarciudadesActionPerformed
        EliminarCiudades interfazA = new EliminarCiudades(this);
    }//GEN-LAST:event_eliminarciudadesActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        EditorTxtGUI interfaz2back = new EditorTxtGUI(this);
    }//GEN-LAST:event_gobackActionPerformed

    
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
    private javax.swing.JButton Continue;
    private javax.swing.JButton agregarciudad;
    private javax.swing.JTextArea ciudades;
    private javax.swing.JButton eliminarciudades;
    private javax.swing.JButton goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
