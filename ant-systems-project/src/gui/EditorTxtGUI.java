
package gui;
/**
 * Interfaz que permite subir un archivotxt, guardar el archivo y cargar el archivo de la ultima simulacion
 * 
 * @author Julene
 */
import edd.Matriz;
import functions.ArchivoTxt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



public class EditorTxtGUI extends javax.swing.JFrame {
    //Atributos de la interfaz
    public static WelcomeGUI interfaz1;
    public static EditCuidadesGUI interfaz2back;
    public static Matriz grafo = new Matriz();
    public String show; 
    /**
     * Constructor que inicializa la interfaz3back de ValoresInicialesGUI y la Matriz grafo
     * @param interfaz2back interfaz que se encuentra en EditCuidadesGUI
     *
     */
    public EditorTxtGUI(EditCuidadesGUI interfaz2back, String show) {
        initComponents();
        cargararch.setVisible(false);
        noinfo.setVisible(false);
        guardado.setVisible(false);
        next.setVisible(false);
        this.setResizable(false);
        this.interfaz2back = interfaz2back;
        interfaz2back.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.Contenido.setText(show);
    }
     /**
     * Constructor que inicializa la interfaz3back de ValoresInicialesGUI y la Matriz grafo
     * @param interfaz1 interfaz que se encuentra en WelcomeGUI
     *
     */
    public EditorTxtGUI(WelcomeGUI interfaz1) {
        initComponents();
        cargararch.setVisible(false);
        noinfo.setVisible(false);
        guardado.setVisible(false);
        next.setVisible(false);
        this.setResizable(false);
        this.interfaz1 = interfaz1;
        interfaz1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
   /**
     * Metodo que retorna el Grafo
     * @return grafo
     *
     */
    public static Matriz getGrafo() {
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
        Contenido = new javax.swing.JTextArea();
        next = new javax.swing.JButton();
        crear_txt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        abrir_archivo = new javax.swing.JButton();
        route = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        GuardarInfo = new javax.swing.JButton();
        noinfo = new javax.swing.JLabel();
        guardado = new javax.swing.JLabel();
        cargararch = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 389, -1, -1));

        Contenido.setEditable(false);
        Contenido.setColumns(20);
        Contenido.setRows(5);
        jScrollPane1.setViewportView(Contenido);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 105, 512, 180));

        next.setBackground(new java.awt.Color(102, 51, 0));
        next.setFont(new java.awt.Font("Adobe Devanagari", 0, 16)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Continuar>>");
        next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 120, 30));

        crear_txt.setBackground(new java.awt.Color(102, 51, 0));
        crear_txt.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        crear_txt.setForeground(new java.awt.Color(255, 255, 255));
        crear_txt.setText("Cargar");
        crear_txt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crear_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_txtActionPerformed(evt);
            }
        });
        getContentPane().add(crear_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 132, 31));

        jLabel2.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cargar ultimo archivo TXT:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));

        abrir_archivo.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        abrir_archivo.setText("Abrir archivo");
        abrir_archivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abrir_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_archivoActionPerformed(evt);
            }
        });
        getContentPane().add(abrir_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 130, 22));

        route.setEditable(false);
        route.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeActionPerformed(evt);
            }
        });
        getContentPane().add(route, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 370, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Archivo TXT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Adobe Devanagari", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subir un archivo TXT:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Guardar informacion del TXT superior");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, 20));

        GuardarInfo.setBackground(new java.awt.Color(102, 51, 0));
        GuardarInfo.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        GuardarInfo.setForeground(new java.awt.Color(255, 255, 255));
        GuardarInfo.setText("Guardar");
        GuardarInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GuardarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarInfoActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 190, 30));

        noinfo.setBackground(new java.awt.Color(255, 0, 0));
        noinfo.setFont(new java.awt.Font("Adobe Devanagari", 1, 14)); // NOI18N
        noinfo.setForeground(new java.awt.Color(255, 0, 0));
        noinfo.setText("No hay informacion que guardar! ");
        getContentPane().add(noinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        guardado.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        guardado.setForeground(new java.awt.Color(51, 255, 0));
        guardado.setText("Guardado exitosamente!!");
        getContentPane().add(guardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        cargararch.setFont(new java.awt.Font("Adobe Devanagari", 0, 14)); // NOI18N
        cargararch.setForeground(new java.awt.Color(0, 255, 0));
        cargararch.setText("Archivo cargado con exito!!");
        getContentPane().add(cargararch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2024-02-18 at 12.14.25 PM.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
     * Metodo para que al presionar el boton se continue a la siguiente interfaz3 (EditCuidadesGUI)
     * @param evt 
     */
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        try {
            EditCuidadesGUI interfaz3 = new EditCuidadesGUI(this, this.show);
        } catch (Exception ex) {
            Logger.getLogger(EditorTxtGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_nextActionPerformed
   /**
     * Metodo que carga el archivo creado en la ultima simulacion
     * @param evt 
     */
    private void crear_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_txtActionPerformed
        ArchivoTxt func = new ArchivoTxt();
        try {
              
            
              func.cargar_txt(func.leer_txt().substring(0, func.leer_txt().length()-1), grafo);
              System.out.println(grafo.grafoDistanciaString());
              this.Contenido.setText(grafo.grafoDistanciaString());
              
        } catch (Exception ex) {
            Logger.getLogger(EditorTxtGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargararch.setVisible(true);
        this.show = this.Contenido.getText(); 
        next.setVisible(true);
    }//GEN-LAST:event_crear_txtActionPerformed
/**
     * Metodo que permite bajar un archivo Txt de la computadora y leerlo
     * @param evt 
     * @exception IOException e1
     */
    private void abrir_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_archivoActionPerformed
        //Creo el Objeto JFileChooser
        JFileChooser fc = new JFileChooser();

        //Creo el filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");

        //Le indico el filtro
        fc.setFileFilter(filtro);

        //Abrimos la ventana, guardamos la op seleccionada por el usuario
        int seleccion = fc.showOpenDialog(this);

        //Si el usario presiona aceptar
        if(seleccion == JFileChooser.APPROVE_OPTION){

            //Selecciono el fichero
            File fichero = fc.getSelectedFile();

            //Escribir la ruta del fichero
            this.route.setText(fichero.getAbsolutePath());

            try(FileReader fr = new FileReader(fichero)){
                String cadena = "";
                int valor = fr.read();
                while(valor != -1){
                    cadena = cadena + (char) valor;
                    valor = fr.read();
                }
                this.Contenido.setText(cadena);
                this.show = cadena; 
            }catch (IOException e1){
                e1.printStackTrace();
            }
        }else{
            this.noinfo.setText("No se ha seleccionado ningún archivo.");
        }
    }//GEN-LAST:event_abrir_archivoActionPerformed

    private void routeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeActionPerformed
/**
     * Metodo que permite guardar los valores mostrados del Txt
     * @param evt 
     * @exception ex
     */
    private void GuardarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarInfoActionPerformed
        if (Contenido.getText().length() == 0){
            noinfo.setVisible(true);
            guardado.setVisible(false);
        }else{
            String txt = Contenido.getText();
            ArchivoTxt func = new ArchivoTxt();

            try {
                func.cargar_txt(txt, grafo);
            } catch (Exception ex) {
                Logger.getLogger(EditorTxtGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            noinfo.setVisible(false);
            guardado.setVisible(true);
            next.setVisible(true);

            grafo.print(0);
                
        }
            
       
    }//GEN-LAST:event_GuardarInfoActionPerformed

    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorTxtGUI(interfaz1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Contenido;
    private javax.swing.JButton GuardarInfo;
    private javax.swing.JButton abrir_archivo;
    private javax.swing.JLabel cargararch;
    private javax.swing.JButton crear_txt;
    private javax.swing.JLabel guardado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JLabel noinfo;
    private javax.swing.JTextField route;
    // End of variables declaration//GEN-END:variables
}
