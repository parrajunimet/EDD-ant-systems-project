package gui;
import functions.GraficarGrafo;
import java.util.logging.Level;
import java.util.logging.Logger;
//import functions.GraficarGrafo; 
/**
 * Interfaz para mostrar el grafico
 * @author Luis Perez
 */
public class GraphGUI extends javax.swing.JFrame {
    //Atributos de la clase
    public CiclosGUI simulado;

    /**
     * Constructor de la clase
     * @param interfaz6
     */
    public GraphGUI(CiclosGUI interfaz6) {
        initComponents();
        simulado = interfaz6;
        interfaz6.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }// fin del constructor

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        crearGrafo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Graph Stream");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        crearGrafo.setBackground(new java.awt.Color(102, 51, 0));
        crearGrafo.setFont(new java.awt.Font("Adobe Devanagari", 0, 18)); // NOI18N
        crearGrafo.setForeground(new java.awt.Color(255, 255, 255));
        crearGrafo.setText("Crear Grafo");
        crearGrafo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearGrafoActionPerformed(evt);
            }
        });
        getContentPane().add(crearGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 230, 60));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2024-02-18 at 12.14.25 PM.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo para mostrar el grafo obtenido graficado
 * @param evt 
 */
    private void crearGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearGrafoActionPerformed
        try {
            // TODO add your handling code here:
            GraficarGrafo graph = new GraficarGrafo();
            graph.mostrar(simulado.getgrafos(),simulado.getSimulacion());
        } catch (Exception ex) {
            Logger.getLogger(GraphGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_crearGrafoActionPerformed
    /**
     * Metodo para ir al la interfaz FinalGUI
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FinalGUI interfaz7 = new FinalGUI(this);
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
            java.util.logging.Logger.getLogger(GraphGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearGrafo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
