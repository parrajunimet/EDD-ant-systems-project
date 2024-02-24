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
        Matriz prueba = new Matriz(); 
        for (int i = 1; i < 8; i++) {
               prueba.nuevoVertice(String.valueOf(i));
            }

        prueba.nuevaDistancia("1","2", 5);
        prueba.nuevaDistancia("1","3",3.1);
        prueba.nuevaDistancia("1","6", 5.2);
        prueba.nuevaDistancia("3","6", 3.2);
        prueba.nuevaDistancia("5","6", 4.7);
        prueba.nuevaDistancia("3","2", 4.9);
        prueba.nuevaDistancia("2","7", 5.2);
        prueba.nuevaDistancia("3","7",3);
        prueba.nuevaDistancia("3","5",6);
        prueba.nuevaDistancia("4","7",4.8);
        prueba.nuevaDistancia("5","4",5.5);
            
        prueba.print(0);
        Simulacion  x = new Simulacion (prueba, "1", "7", 4, 5, 1,2,0.5); 
        x.startData();
        System.out.println("\n\n");
        prueba.print(1);
        for (int i = 0; i < 4; i++) {
            x.Cycle();
            System.out.println("\n\n");
            prueba.print(1);
            System.out.println("\n\n");
        }
        System.out.println("\n\n");
        x.simulationResults(); 
       

    }
}
