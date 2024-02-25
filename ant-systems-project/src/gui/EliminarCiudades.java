/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import edd.Matriz;
import static gui.AgregarCiudadesGUI.interfazB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * @author Julene
 * @author Sofia
 */
public class EliminarCiudades extends javax.swing.JFrame {
    private Matriz grafo;
    private String[] deletable ; 
    public static EditCuidadesGUI interfazA;
    
    
    /**
     * Constructor que inicializa la interfazA de EditCuidadesGUI y la Matriz grafo
     */
    public EliminarCiudades(EditCuidadesGUI interfazA) throws Exception {
        initComponents();
        
        //Inicializa interfazA
        this.interfazA= interfazA;
        
        //Declara que la interfazA inicialmente no es visible
        interfazA.setVisible(false);
        
        //Declara visible a la interfaz EliminarCiudades
        this.setVisible(true);
        
        //Posiciona la interfaz en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        // No permite a los usuarios cambiar el tamaño de la ventana al aparecer
        this.setResizable(false);
        
        //Inicializa al grafo
        this.grafo = interfazA.getGrafo(); 
        
        
        this.eliminar.setVisible(false);
        this.start();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ciudades = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        notify = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ciudades.setEditable(false);
        ciudades.setColumns(20);
        ciudades.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ciudades.setRows(5);
        jScrollPane1.setViewportView(ciudades);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 60, 150));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eliminar ciudades");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        jPanel1.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, -1));

        eliminar.setBackground(new java.awt.Color(102, 51, 0));
        eliminar.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, -1));

        Volver.setBackground(new java.awt.Color(102, 51, 0));
        Volver.setFont(new java.awt.Font("Adobe Devanagari", 0, 12)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setText("Volver");
        Volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 100, 30));

        jLabel4.setFont(new java.awt.Font("Adobe Devanagari", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Posibles ciudades a eliminar:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        notify.setBackground(new java.awt.Color(153, 102, 0));
        notify.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        notify.setForeground(new java.awt.Color(204, 0, 0));
        notify.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(notify, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 420, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2024-02-18 at 12.14.25 PM.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       String x = this.input.getText();
       boolean found = false; 
       if (this.deletable.length == 0) {
           input.setText("");
           this.notify.setText("No puede borrar ciudades");
       } else if (x.isBlank()){
           this.notify.setText("Por favor ingrese una ciudad");
       } else {
           for (String c: this.deletable) {
               x = x.replace(" ", ""); 
               if (c.equals(x)) {
                   found = true; 
                }
            } 
            if (found) {
                   this.grafo.eliminarVertice(x);
                   try { 
                       start();
                   } catch (Exception ex) {
                       Logger.getLogger(EliminarCiudades.class.getName()).log(Level.SEVERE, null, ex);
                   }
            } else {
                   input.setText("");
                   this.notify.setText("Por favor entre una ciudad valida.");
               }
       }
    }//GEN-LAST:event_eliminarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        try {
            EditCuidadesGUI interfazD= new EditCuidadesGUI(this);
        } catch (Exception ex) {
            Logger.getLogger(EliminarCiudades.class.getName()).log(Level.SEVERE, null, ex);
        }
        Matriz grafoUpdated = grafo;
        
    }//GEN-LAST:event_VolverActionPerformed
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
            java.util.logging.Logger.getLogger(AgregarCiudadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudadesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AgregarCiudadesGUI(interfazA).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(EliminarCiudades.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    public void start () throws Exception {
        input.setText("");
        this.ciudades.setText("");
        //System.out.println("Numero de ciudades: " + this.grafo.getNumVerts());
        if (this.grafo.getNumVerts() <= 4) {
            this.eliminar.setVisible(false);
            this.notify.setText("Solo puede eliminar ciudades si hay más de cuatro ciudades existentes");
            this.deletable =  new String[0]; 
        } else {
            this.deletable = this.grafo.nonBridgeds();
            String show = ""; 
            int counter = 1; 
            if (this.deletable.length == 0) {
                this.notify.setText("Ninguna ciudad puede ser eliminada."); 
            }else {
                this.eliminar.setVisible(true);
                for (String c: this.deletable) {
                show += "-.    " +c + "\n"; 
                counter++; 
            }
            this.ciudades.setText(show);
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JTextArea ciudades;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel notify;
    // End of variables declaration//GEN-END:variables
}
