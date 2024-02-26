
package functions;
/**
 * Esta clase define el Archivo Txt y sus funciones: leer_txt, eliminar_txt, cargar_txt y guardar_txt
 *
 * @author Julene
 * @version 24/02/2024
 */
import edd.Matriz;
import edd.Vertice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class ArchivoTxt {
    
    File archivo;
    /**
     * Metodo que lee el txt y retorna la informacion 
     * @return String expresion_txt
     *@exception ex
     */
    public String leer_txt() {
        String line;
        String expresion_txt = "";
        String path = "test\\grafo.txt";
        File file = new File(path);
        try{
            if(!file.exists()){
               file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine())!= null){
                    if(!line.isEmpty()){
                        expresion_txt += line + "\n";
                    }
                }
                
                br.close();
                return expresion_txt;
            }  
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }
        return expresion_txt;
    }
    
    
    /**
     * Metodo que elimina un txt 
     *@exception IOException exepcion
     */
    public void eliminar_txt() {
        try{
            if(archivo.createNewFile()) {
                System.out.println("Archivo eliminado con exito!");
            }
            else{
                System.out.println("Error al eliminar el archivo.");
            }
        }catch(IOException exepcion){
            exepcion.printStackTrace(System.out);
        }
    } 
      /**
     * Metodo que carga y lee un txt 
     *@exception 
     * 
     */
    public void cargar_txt(String txt, Matriz grafo) throws Exception{
        String replaceCiudad = txt.replaceFirst("ciudad", "Ω");
        String replaceArista = replaceCiudad.replaceFirst("aristas", "Ω");
        String[] lines = replaceArista.split("Ω");
        
        String ciudades_txt = lines[1];
        String[] ciudades = ciudades_txt.split("\n");
        
        for (int i = 1; i < ciudades.length; i++) {
            String salida = ciudades[i].replaceAll("\r", "");
            grafo.nuevoVertice(salida);
        }

        String aristas_txt = lines[2];
        
        String[] aristas = aristas_txt.split("\n");
        
        for (int i = 1; i < aristas.length; i++) {
            String[] partes = aristas[i].split(",");
            String salida1 = partes[0].replaceAll("\r", "");
            String salida2 = partes[1].replaceAll("\r", "");
            String salida3 = partes[2].replaceAll("\r", "");
            grafo.nuevaDistancia(salida1, salida2, Double.parseDouble(salida3));
        }
        
    }
        /**
     * Metodo que Guarda un txt 
     * @exception IOException e
     * 
     */
    public void guardar_txt(String grafoferomonas_string) {
        try{
            FileWriter writer = new FileWriter("test\\grafo.txt");
            writer.write(grafoferomonas_string);
            writer.close();
        }catch( IOException e){
            System.out.println("Fallo");
        }
    }    
}