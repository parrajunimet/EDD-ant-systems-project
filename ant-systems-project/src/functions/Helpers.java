
package functions;

import javax.swing.JOptionPane;

/**
 * Esta clase contiene las validaciones utilizadas en el programa
 *
 * @version 24/02/2024
 */
public class Helpers {
    //Validaciones de todas las entradas que recibe el programa en las interfaces
    
    //Validar que una cadena sea un numero. return -1 si la cadena no representa un numero
    public int validarNumero(String num){
        return -1;
    }
    
    //Validar que una cadena sea un numero decimal. return -1 si la cadena no representa un numero
    public float validarNumeroDecimal(String num){
        return -1;
    }
    
    public int num(String numS) {
       int num; 
        try {
        num = Integer.parseInt(numS); 
        return num; 
        }catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error, please enter number");
    }
        return 0;
    }
    
}
