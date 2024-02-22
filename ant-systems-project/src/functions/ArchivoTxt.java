
package functions;

import edd.Matriz;
import edd.Vertice;
import static gui.FinalGUI.grafo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class ArchivoTxt {
    
    File archivo;
    
    public void crear_txt() {
        archivo = new File ("archivo.txt");
        try{
            if(archivo.createNewFile()) {
                System.out.println("Archivo creado con exito!");
            }
            else{
                System.out.println("Error al crear el archivo.");
            }
        }catch(IOException exepcion){
            exepcion.printStackTrace(System.out);
        }
    }
    
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
    
    public void guardar_txt(String grafodistancias_string, String grafoferomonas_string) {
        BufferedWriter writer = null;
        BufferedWriter writer2 = null;
        
        try{
            writer = new BufferedWriter( new FileWriter("grafodistancias.txt"));
            writer2 = new BufferedWriter( new FileWriter("grafoferomonas.txt"));
            writer.write( grafodistancias_string);
            writer2.write( grafoferomonas_string);
            }catch ( IOException e){
            }finally {
                try{
                    if ( writer != null && writer2 != null){
                        writer.close();
                        writer2.close();
                    }
                }catch ( IOException e){
                }
        }
    }
        
}