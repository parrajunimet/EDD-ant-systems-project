/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

import edd.Matriz;

/**
 *
 * @author Sofia
 */
public class Probando2 {
    
    public static void main(String[] args) throws Exception{
        
        Matriz prueba = new Matriz(); 
       
        
      
        for (int i = 1; i <= 20; i++) {
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
        prueba.nuevaDistancia("8","7", 5.2);
        prueba.nuevaDistancia("9","7",3);
        prueba.nuevaDistancia("9","2",6);
        prueba.nuevaDistancia("10","2",4.8);
        prueba.nuevaDistancia("10","9",5.5);
        prueba.nuevaDistancia("11","20", 5);
        prueba.nuevaDistancia("11","10",3.1);
        prueba.nuevaDistancia("11","6", 5.2);
        prueba.nuevaDistancia("13","6", 3.2);
        prueba.nuevaDistancia("15","6", 4.7);
        prueba.nuevaDistancia("3","12", 4.9);
        prueba.nuevaDistancia("12","7", 5.2);
        prueba.nuevaDistancia("14","7",3);
        prueba.nuevaDistancia("14","5",6);
        prueba.nuevaDistancia("16","7",4.8);
        prueba.nuevaDistancia("17","16",5.5);
        prueba.nuevaDistancia("18","17", 5.2);
        prueba.nuevaDistancia("17","3",3);
        prueba.nuevaDistancia("19","18",6);
        prueba.nuevaDistancia("19","20",4.8);
        prueba.nuevaDistancia("18","20",5.5);
      
        
        
        
        System.out.println("\n\n\n");

        Simulacion r = new Simulacion(prueba, "1", "20", 5, 51, 1, 2, 0.5);
        System.out.println("\n\n\n"); 
        System.out.println("\n\n\n");
        r.startData();
        for (int i = 0; i < 5; i++) {
            r.Cycle(); 
        }
        r.simulationResults(); 
        
    }
}
