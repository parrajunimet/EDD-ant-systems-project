/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

import edd.Matriz;
import gui.CiclosGUI;

/**
 *
 * @author Sofia
 */
public class Probando {
    
    public static void main(String[] args) throws Exception {
        Matriz grafos = new Matriz(); 

        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i"}; 
        for (int i = 0; i < array.length; i++) {
            grafos.nuevoVertice(array[i]);
        }
        
        grafos.nuevaDistancia("a","b", 20.8);
        grafos.nuevaDistancia("b","c", 10);
        grafos.nuevaDistancia("a","d", 10.9);
        grafos.nuevaDistancia("d","c", 7);
        grafos.nuevaDistancia("d","b", 1.5);

        CiclosGUI x = new CiclosGUI(grafos, "a", "c", 3, 5, 1, 2, 0.5); 
    }
    
    
}
