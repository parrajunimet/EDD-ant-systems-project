
package gui;
    
import edd.Matriz;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Interfaz que permite editar el numero de ciudades, ya sea agregando o eliminando
 * 
 * @author Julene
 */

public class EditCuidadesGUI extends javax.swing.JFrame {
    //Se llaman a las interfaces EditorTxtGUI, AgregarCuidadGUI, EliminarCiudades, ValoresInicialesGUI y a la Matriz
    public static EditorTxtGUI interfaz2;
    public static AgregarCiudadesGUI interfazC;
    public static EliminarCiudades interfazD;
    public static ValoresInicialesGUI interfaz3back;
    private Matriz grafo; 
    
    /**
     * Constructor que inicializa la interfaz3back de ValoresInicialesGUI y la Matriz grafo
     * @param interfaz3back interfaz que se encuentra en ValoresInicialesGUI
     *
     */
    public EditCuidadesGUI(ValoresInicialesGUI interfaz3back) throws Exception {
        initComponents();
        //Instancia la interfaz3back
        this.interfaz3back = interfaz3back;
        
        //Instancia al grafo
        this.grafo = interfaz3back.getGrafo();
        
        // No permite a los usuarios cambiar el tamaño de la ventana al aparecer
        this.setResizable(false);
        
        //Declara que la interfaz3back inicialmente no es visible
        interfaz3back.setVisible(false);
        
        //Declara visible a la interfaz EditCiudadesGUI
        this.setVisible(true);
        
        //Posiciona la interfaz en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //Muestra las ciudades
        this.showCities();
    }
    
    /**
     * Constructor que inicializa la interfazD de EliminarCiudades y la Matriz grafo
     * @param interfazD interfaz que se encuentra en EliminarCiudades
     *
     */
    public EditCuidadesGUI(EliminarCiudades interfazD) throws Exception {
        initComponents();
        //Instancia al grafo
        this.grafo = interfazD.getGrafo(); 
        
        //Instancia a la interfazD
        this.interfazD = interfazD;
        
        // No permite a los usuarios cambiar el tamaño de la ventana al aparecer
        this.setResizable(false);
        
        //Declara que la interfazD inicialmente no es visible 
        interfazD.setVisible(false);
        
        //Declara visible a la interfaz EditCiudadesGUI
        this.setVisible(true);
        
        //Posiciona la interfaz en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //Muestra las ciudades
        this.showCities();
    }
    
    /**
     * Constructor que inicializa la interfazc de AgregarCiudades y la Matriz grafo
     * @param interfazC interfaz que se encuentra en AgregarCiudadesGUI
     *
     */
    public EditCuidadesGUI(AgregarCiudadesGUI interfazC) throws Exception {
        initComponents();
        // No permite a los usuarios cambiar el tamaño de la ventana al aparecer
        this.setResizable(false);
        
        //Instancia al grafo
        this.grafo = interfazC.getGrafo(); 
        
        //Instancia a la interfazC
        this.interfazC = interfazC;
        
        //Declara que la interfazC inicialmente no es visible 
        interfazC.setVisible(false);
        
        //Declara visible a la interfaz EditCuidadesGUI
        this.setVisible(true);
        
        //Posiciona la interfaz en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //Muestra ciudades 
        this.showCities();
    }
    
    /**
     * Constructor que inicializa la interfaz2 de EditorTxtGUI y la Matriz grafo
     * @param interfaz2 interfaz que se encuentra en EditorTxtGUI
     *
     */
    public EditCuidadesGUI(EditorTxtGUI interfaz2) throws Exception {
        initComponents();
        //Inicializa el grafo
        this.grafo = interfaz2.getGrafo(); 
        
        // No permite a los usuarios cambiar el tamaño de la ventana al aparecer
        this.setResizable(false);
        
        //Inicializa la interfaz2
        this.interfaz2 = interfaz2;
        
        //Declara que la interfaz2 inicialmente no es visible 
        interfaz2.setVisible(false);
        
        //Declara visible a la interfaz EditCuidadesGUI
        this.setVisible(true);
        
        //Posiciona la interfaz en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //Muestra las ciudades
        this.showCities();
    }
    /*
    public EditCuidadesGUI(Matriz grafo) {
        initComponents();
        this.grafo = grafo;
        this.grafoupdated = grafoupdated;
    }
    /*
    
    */
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

        ciudades.setEditable(false);
        ciudades.setColumns(20);
        ciudades.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
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
    
    public void showCities() throws Exception {
       this.ciudades.setText(this.grafo.citiesAndPaths());
    } 

    public Matriz getGrafo() {
        return grafo;
    }
    
    /**
     * Metodo para que al presionar el boton se continue a la siguiente interfaz (ValoresInicialesGUI)
     * @param evt 
     */
    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        //Inicializa la interfaz siguiente interfaz4/ValoresInicialesGUI
        ValoresInicialesGUI interfaz4 = new ValoresInicialesGUI(this);
    }//GEN-LAST:event_ContinueActionPerformed
    
    /**
     * Metodo para que al presionar el boton se continue a la interfazB AgregarCiudadesGUI
     * @param evt 
     * @exception ex
     */
    private void agregarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarciudadActionPerformed
        try {
            //Inicializa interfazB/AgregarCiudadesGUI
            AgregarCiudadesGUI interfazB = new AgregarCiudadesGUI(this);
        } catch (Exception ex) {
            Logger.getLogger(EditCuidadesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarciudadActionPerformed
    
    /**
     * Metodo para que al presionar el boton se continue a la interfazA EliminarCiudades
     * @param evt 
     * @exception ex
     */
    private void eliminarciudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarciudadesActionPerformed
        try {
            //Inicializa interfazA/EliminarCiudades
            EliminarCiudades interfazA = new EliminarCiudades(this);
        } catch (Exception ex) {
            Logger.getLogger(EditCuidadesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarciudadesActionPerformed
    /**
     * Metodo para que al presionar el boton se devuelva a la interfaz anterior (EditorTxtGUI)
     * @param evt 
     */
    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        //Inicializa la interfaz anterior interfaz2back/EditorTxtGUI
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
                try {
                    new EditCuidadesGUI(interfaz2).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(EditCuidadesGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
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
