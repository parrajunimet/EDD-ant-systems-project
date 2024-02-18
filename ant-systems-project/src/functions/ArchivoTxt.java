
package functions;

import edd.Grafo;
import java.io.File;
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
    
    
    public void cargar_txt(String txt, Grafo grafo) throws Exception{
        String replaceCiudad = txt.replaceFirst("ciudad", "Ω");
        String replaceArista = replaceCiudad.replaceFirst("aristas", "Ω");
        String[] lines = replaceArista.split("Ω");
        
        String ciudades_txt = lines[1];
        String[] ciudades = ciudades_txt.split("\n");
        
        for (int i = 1; i < ciudades.length; i++) {
            
            grafo.nuevoVertice(ciudades[i]);
        }
        
        
        
        String aristas_txt = lines[2];
        String[] aristas = aristas_txt.split("\n");
        
        for (int i = 1; i < aristas.length; i++) {
            String[] partes = aristas[i].split(",");
            String vertice = partes[0];
            System.out.println("[" + vertice + "]");
            System.out.println(grafo.numVertice(vertice));
            //grafo.nuevaDistancia(partes[0], partes[1], Double.parseDouble(partes[2]));
        }
        
    }
    
    
}
