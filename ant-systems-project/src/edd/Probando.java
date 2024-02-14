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
        
        grafos.nuevaDistancia("a","b", 2);
        grafos.nuevaDistancia("a","c", 3);
        grafos.nuevaDistancia("b","d", 5);
        grafos.nuevaDistancia("c","f", 3);
        grafos.nuevaDistancia("d","f", 4);
        grafos.nuevaDistancia("f","h", 1);
        grafos.nuevaDistancia("c","g", 8);
        grafos.nuevaDistancia("g","h", 2);
        grafos.nuevaDistancia("g","i", 2);
        
        
        
        System.out.println("\n\n\n");
        grafos.feromonasIniciales();
        grafos.getMatrizFeromonas().print();
        
        

        Simulacion prueba = new Simulacion(grafos.getMatrizFeromonas(), grafos.getMatrizDistancias(), "a", "d", 3, 8, 1, 2, 0.5);

        prueba.creadoHormigas();
        prueba.Cycle();
        System.out.println("\n\n\n");
        grafos.getMatrizDistancias().print();
        System.out.println("\n\n\n");
        grafos.getMatrizFeromonas().print();
    }
}
