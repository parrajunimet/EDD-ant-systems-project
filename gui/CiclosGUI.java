package gui;

import edd.Matriz;
import simulation.Simulacion;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Interfaz que permite mostrar informacion de cada Ciclo de la Simulacion
 * 
 * @author Sofia
 * @author Julene
 * @version 24/02/2024
 */

public class CiclosGUI extends javax.swing.JFrame {
    //Se llama a  la clase IniciarSimulacionGUI/ interfaz5b
    public static IniciarSimulacionGUI interfaz5b;
    private Matriz grafos; 
    public static String ciudadi; 
    public static String ciudadf; 
    private int cycles, antn, counter;
    private double p, a, b;
    private Simulacion simulacion; 
    private boolean done; 
    
    
    /**
     * Constructor que inicializa todas las variables necesarias para la clase
     * @param interfaz5b interfaz que se encuentra en ValoresInicialesGUI
     *
     */
    ///Preguntar 
    public CiclosGUI(IniciarSimulacionGUI interfaz5b, String ciudadi, String ciudadf, int cycles, int antn, double a, double b, double p) throws Exception {
        initComponents();
        // No permite a los usuarios cambiar el tamaño de la ventana al aparecer
        this.setResizable(false);
        
        //Inicializa la interfaz5b
        this.interfaz5b = interfaz5b;
        
        //Declara que inicialmente la interfaz5b no es visible
        interfaz5b.setVisible(false);
        
        //Declara que la interfaz CiclosGUI si es visible inicialmente
        this.setVisible(true);
        
        //Posiciona la interfaz en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        this.grafos = interfaz5b.getGrafo();
        this.ciudadi = ciudadi;
        this.ciudadf = ciudadf;
        this.cycles = cycles;
        this.antn = antn;
        this.a = a;
        this.b = b;
        this.p = p;
        this.counter = 0;
        this.done = false; 
        this.start(); 
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
        jLabel1 = new javax.swing.JLabel();
        ncycles = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultados = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        caminos = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        distancias = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        hormigas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        optimo = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 223, 188));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Adobe Devanagari", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Distancia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 110, 30));

        ncycles.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        ncycles.setForeground(new java.awt.Color(255, 255, 255));
        ncycles.setText("1");
        jPanel1.add(ncycles, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 50));

        jLabel3.setFont(new java.awt.Font("Adobe Devanagari", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Resultados: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));

        jLabel4.setFont(new java.awt.Font("Adobe Devanagari", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Camino");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 90, 30));

        next.setBackground(new java.awt.Color(102, 51, 0));
        next.setFont(new java.awt.Font("Adobe Devanagari", 0, 18)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Continuar>>");
        next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 130, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CICLO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 50));

        jLabel6.setFont(new java.awt.Font("Adobe Devanagari", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hormiga ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        resultados.setBackground(new java.awt.Color(255, 204, 153));
        resultados.setColumns(20);
        resultados.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        resultados.setRows(5);
        jScrollPane1.setViewportView(resultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 900, 70));

        caminos.setEditable(false);
        caminos.setBackground(new java.awt.Color(255, 204, 153));
        caminos.setColumns(20);
        caminos.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        caminos.setRows(5);
        jScrollPane4.setViewportView(caminos);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 670, 180));

        distancias.setEditable(false);
        distancias.setBackground(new java.awt.Color(255, 204, 153));
        distancias.setColumns(20);
        distancias.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        distancias.setRows(5);
        jScrollPane5.setViewportView(distancias);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 110, 180));

        hormigas.setEditable(false);
        hormigas.setBackground(new java.awt.Color(255, 204, 153));
        hormigas.setColumns(20);
        hormigas.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        hormigas.setRows(5);
        jScrollPane6.setViewportView(hormigas);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 180));

        optimo.setBackground(new java.awt.Color(255, 204, 153));
        optimo.setColumns(20);
        optimo.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        optimo.setRows(5);
        jScrollPane2.setViewportView(optimo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 900, 40));

        jLabel7.setFont(new java.awt.Font("Adobe Devanagari", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("El camino óptimo fue: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo ciclos.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo para que al presionar el boton se continue a la siguiente interfaz y se inicialice la simulacion
     * @param evt 
     */
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        if (this.counter < this.cycles) {
            counter++; 
            try { 
                this.simulacion.Cycle();
                this.showCycle();
            } catch (Exception ex) {
                Logger.getLogger(CiclosGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            if (!done) {
                try {
                    String x = this.simulacion.simulationResults();
                    this.resultados.setText(x);
                    done = true; 
                } catch (Exception ex) {
                    Logger.getLogger(CiclosGUI.class.getName()).log(Level.SEVERE, null, ex);
                }   
            }else {
                
                //Inicializa la interfaz siguiente interfaz6/ GraphGUI
                GraphGUI interfaz6 = new GraphGUI(this);
            }
        }
        
        
    }//GEN-LAST:event_nextActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void showCycle() throws Exception {
        String[] results = simulacion.Cycle();
        String x = ""; 
        for (int i = 0; i < antn; i++) {
            x += (i+1) + "\n\n";
        }
        this.ncycles.setText(String.valueOf(counter));
        this.hormigas.setText(x);
        this.caminos.setText(results[1]);
        this.distancias.setText(results[2]);
        this.optimo.setText(results[0]);
    }
    
    
    public void start() throws Exception {
        this.simulacion = new Simulacion (this.grafos, this.ciudadi, this.ciudadf, this.cycles, this.antn, this.a, this.b, this.p); 
        this.simulacion.startData();
        counter++; 
        this.showCycle();
    }
    
    public Matriz getgrafos(){
        return this.grafos;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea caminos;
    private javax.swing.JTextArea distancias;
    private javax.swing.JTextArea hormigas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel ncycles;
    private javax.swing.JButton next;
    private javax.swing.JTextArea optimo;
    private javax.swing.JTextArea resultados;
    // End of variables declaration//GEN-END:variables
}
