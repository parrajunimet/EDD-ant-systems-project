
package Objetos;

import java.io.File;
import java.io.IOException;


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
    
    
    public String leer_txt() {
        String line;
        String ciudades_txt = "";
        
        return null;
    }
}
