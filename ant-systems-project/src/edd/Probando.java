/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

//import gui.EliminarCiudad;

/**
 *
 * @author Sofia
 */
public class Probando {
   
    public static void main (String[] args) throws Exception{
         Matriz prueba = new Matriz(); 
    
        String[] array = {"a", "b", "c", "d"};
        for (int i = 0; i < array.length; i++) {
               prueba.nuevoVertice(array[i]);
            }

            prueba.nuevaDistancia("a","b", 1);
            prueba.nuevaDistancia("b","c", 2);
            prueba.nuevaDistancia("c","d", 2);
            
            prueba.print();
            prueba.countDFS();
           
            System.out.println(prueba.vertName(0) + " "+prueba.isBridge(0));
            System.out.println(prueba.vertName(1) + " "+ prueba.isBridge(1));
            System.out.println(prueba.vertName(2) + " " +prueba.isBridge(2));
            System.out.println(prueba.vertName(3) + " " +prueba.isBridge(3));
            String [] x = prueba.nonBridgeds(); 
            
            //EliminarCiudad h = new EliminarCiudad(prueba); 
            //h.start();

    }
}
