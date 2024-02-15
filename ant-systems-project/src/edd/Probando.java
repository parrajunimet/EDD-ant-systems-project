/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Sofia
 */
public class Probando {
    
    public static void main(String[] args) throws Exception{
        Grafo grafos = new Grafo(); 

        int z= 6; 
        double y = (1-0.5);
        z *=y; 
        System.out.println(z);
        
        
        
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i"}; 
        for (int i = 0; i < array.length; i++) {
            grafos.nuevoVertice(array[i]);
        }
        
        grafos.nuevaDistancia("a","b", 20);
        grafos.nuevaDistancia("b","c", 10);
        grafos.nuevaDistancia("a","d", 10);
        grafos.nuevaDistancia("d","c", 7);
        grafos.nuevaDistancia("d","b", 1);
      
        
        
        
        System.out.println("\n\n\n");
        grafos.feromonasIniciales();
        

        Simulacion prueba = new Simulacion(grafos.getMatrizFeromonas(), grafos.getMatrizDistancias(), "a", "c", 20, 8, 1, 2, 0.5);
        prueba.creadoHormigas();
        System.out.println("\n\n\n");
        prueba.Simulation();
        System.out.println("\n\n\n");

    }
}
