
package gui;
/**
 * Interfaz Inicial del Programa
 * 
 * @author Julene
 * @version 24/02/2024
 */

public class WelcomeGUI extends javax.swing.JFrame {
/**
     * Constructor
     */
    public WelcomeGUI() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(193, 141, 73));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Ant-Farm");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        text1.setFont(new java.awt.Font("Adobe Devanagari", 0, 16)); // NOI18N
        text1.setForeground(new java.awt.Color(102, 51, 0));
        text1.setText("Bienvenidos a...");
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continuar>>");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 120, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  /**
     * Metodo para que al presionar el boton se continue a la siguiente interfaz 
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EditorTxtGUI interfaz2 = new EditorTxtGUI(this);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        WelcomeGUI interfaz1 = new WelcomeGUI();
        interfaz1.setVisible(true);
        interfaz1.setLocationRelativeTo(null);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel text1;
    // End of variables declaration//GEN-END:variables
}
