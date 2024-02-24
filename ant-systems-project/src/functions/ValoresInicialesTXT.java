package functions;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class ValoresInicialesTXT {
    private String filePath;

    public ValoresInicialesTXT(String filePath) {
        this.filePath = filePath;
    }

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
