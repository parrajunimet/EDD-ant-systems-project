/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

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
        System.out.println("\n\n");
        
        System.out.println(prueba.getNumVerts());
        System.out.println("\n\n");
        
        System.out.println(prueba.citiesAndPaths()); 
        System.out.println("\n\n");
        prueba.eliminarVertice("1");
        prueba.print(0);
        System.out.println("\n\n");
        
        System.out.println(prueba.getNumVerts());
        System.out.println("\n\n");
        
        System.out.println(prueba.citiesAndPaths()); 
        prueba.eliminarVertice("3");
        
        prueba.print(0);
        System.out.println("\n\n");
        
        System.out.println(prueba.getNumVerts());
        System.out.println("\n\n");
        
        System.out.println(prueba.citiesAndPaths()); 
    }
}
