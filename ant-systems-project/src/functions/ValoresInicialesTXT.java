package functions;
/**
 * Clase que permite cargar el TXT de valores iniciales
 * @Author Juan 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class ValoresInicialesTXT {
    //Atributos de la clase
    private String filePath;
/**
 * Constructor de la clase
 * @param filePath txt convertido en string
 */
    public ValoresInicialesTXT(String filePath) {
        this.filePath = filePath;
    }
/**
 * Metodo para crear un txt, si no ha sido creado, y obtener los valores iniciales
 */
    public void createTxtFile() {
        try {
            File selectedFile = new File(filePath);
            if (!selectedFile.exists()) {
                selectedFile.createNewFile();
                System.out.println("Archivo creado exitosamente: " + selectedFile.getAbsolutePath());
                this.editTxtFile(1 , 2 , 0.5 , 5 , 4 );
            } else {
                System.out.println("El archivo ya existe: " + selectedFile.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/**
 * Meotodo para editar el txt existente
 * @param alfa grado de feromonas
 * @param beta grado de visibilidad entre ciudades
 * @param gamma parametro p 
 * @param hormigas numero de hormigas
 * @param ciclos  numero de ciclos
 */
    public void editTxtFile(double alfa, double beta, double gamma, int hormigas, int ciclos) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(alfa + ";" + beta + ";" + gamma + ";" + hormigas + ";" + ciclos);
            writer.close();
            System.out.println("Archivo editado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/**
 * Metodo para leer el String previamente cargado proveniente del txt
 * @return 
 */
    public String[] readTxtFile() {
        StringBuilder content = new StringBuilder();
        String[] valores = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                valores = line.split(";");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return valores;
    }
}
