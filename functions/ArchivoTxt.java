
package functions;

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

/**
 * Esta clase define el Archivo Txt y sus funciones: leer_txt, eliminar_txt, cargar_txt y guardar_txt
 *
 * @author Julene
 * @version 24/02/2024
 */
public class ArchivoTxt {
    
    File archivo;
    
    /**
     * Metodo que lee el txt y retorna la informacion 
     * @return String expresion_txt
     *@exception ex
     */
    public String leer_txt() {
        //Declara string line
        String line;
        
        //Crea un string vacio llamado expresion_txt donde estara toda la informacion 
        String expresion_txt = "";
        
        //Declara el camino a donde esta el archivo txt 
        String path = "test\\grafo.txt";
        
        //Crea un nuevo file
        File file = new File(path);
        
        try{
            //Chequea que el file exista 
            if(!file.exists()){
                //Si no existe, crea un nuevo file
               file.createNewFile();
            }else{
                //Instancia un nuevo FileReader fr con el file
                FileReader fr = new FileReader(file);
                
                //Instacia un nuevo BufferedReader br con el fr
                BufferedReader br = new BufferedReader(fr);
                
                //Chequea que el br no esta vacio y lo recorre
                while((line = br.readLine())!= null){
                    
                    //Chequea que la linea que recorremos no esta vacia
                    if(!line.isEmpty()){
                        
                        //Añade a el string expresion_txt la informacion del txt con un salto de linea
                        expresion_txt += line + "\n";
                    }
                }
                //Cierra el BufferedReader br
                br.close();
                
                //Retorna la expresion_txt con la informacion
                return expresion_txt;
            }  
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }
        //Retorna la expresion_txt con la informacion
        return expresion_txt;
    }
    
    /**
     * Metodo que elimina un txt 
     *@exception IOException exepcion
     */
    public void eliminar_txt() {
        try{
            //Chequea que se creo un file
            if(archivo.createNewFile()) {
                //Imprime "Archivo eliminado con exito"
                System.out.println("Archivo eliminado con exito!");
            }
            else{
                // En el caso contrario, imprime "Error al eliminar el archivo"
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
        //Crea un string replaceCiudad donde, en el String txt, reemplaza la palabra ciudad con "Ω"
        String replaceCiudad = txt.replaceFirst("ciudad", "Ω");
        
        //Crea un string replaceArista donde reemplaza la palabra aristas con "Ω"
        String replaceArista = replaceCiudad.replaceFirst("aristas", "Ω");
        
        //Crea un string array lines en el que separa el replaceArista por cada "Ω" 
        String[] lines = replaceArista.split("Ω");
        
        //Crea un string ciudades_txt cuyo valor es el valor en la posicion 1 del string array lines
        String ciudades_txt = lines[1];
        
        //Crea un string array ciudades con los valores de ciudades_txt separados por cada "Ω"
        String[] ciudades = ciudades_txt.split("\n");
        
        //Recorre ciudades
        for (int i = 1; i < ciudades.length; i++) {
            
            //Crea un string salida en el que intercambia/elimina todos los \r
            String salida = ciudades[i].replaceAll("\r", "");
            
            //Crea un nuevo vertice en el grafo con la informacion del string salida
            grafo.nuevoVertice(salida);
        }

        //Crea un nuevo string aristas_txt cuyo valor es el valor en la posicion 2 del string array
        String aristas_txt = lines[2];
        
        //Crea un string array aristas cuyo valor es el de string aristas separado por cada salto de linea
        String[] aristas = aristas_txt.split("\n");
        
        //Recorre aristas
        for (int i = 1; i < aristas.length; i++) {
            
            //Crea un string array partes y separa cada elemento con una coma ","
            String[] partes = aristas[i].split(",");
            
            //Crea tres strings en los cuales remplaza en las posiciones 0, 1 y 2 el "\r" con "" (arreglando un bug)
            String salida1 = partes[0].replaceAll("\r", "");
            String salida2 = partes[1].replaceAll("\r", "");
            String salida3 = partes[2].replaceAll("\r", "");
            
            //Crea una nueva distancia en el grafo utilizando los valores de salida1, 2 y 3
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
            //Instancia un nuevo FileWriter writer y le indica el camino para encontrar el archivo
            FileWriter writer = new FileWriter("test\\grafo.txt");
            
            //Escribe en el writer el String grafoferomonas_string con toda la informacion para el txt
            writer.write(grafoferomonas_string);
            
            //Cierra el FileWriter writer
            writer.close();
            
        }catch( IOException e){
            
            System.out.println("Fallo");
        }
    }    
}