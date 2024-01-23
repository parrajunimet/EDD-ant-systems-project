/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author Sofia
 */
public class Main {
    
    
    public static void  main(String[] args) {
        ListaDoble list  = new ListaDoble(); 
        
        for (int i = 0; i<10; i++) {
            list.insertFinal(i);
        }
        System.out.println(list.print());
        System.out.println("Addind 44");
        list.insertinIndex(44, 7);
        System.out.println(list.print());
        
        System.out.println("Addind 55");
        list.insertinIndex(55, 3);
        System.out.println(list.print());
        
        System.out.println("Head: " + list.getHead().getElement());
        System.out.println("Tail: " + list.getTail().getElement());
        
        System.out.println("ELIMINATING");
        System.out.println("Eliminiating final: " + list.deleteFinal());
        System.out.println(list.print());
        System.out.println("Head: " + list.getHead().getElement());
        System.out.println("Tail: " + list.getTail().getElement());
        System.out.println("Eliminiating start: " + list.deleteBegin());
        System.out.println(list.print());
        
        System.out.println("\nELIMINATING INDEX: "+ list.deleteinIndex(2));
        System.out.println(list.print());
        System.out.println("\nELIMINATING INDEX: "+ list.deleteinIndex(7));
        System.out.println(list.print());
        System.out.println("Inserting 0 at first");
        System.out.println(list.print());
        list.insertBegin(0); 
        System.out.println(list.print());
        System.out.println("Inserting 9 at last");
        
        list.insertFinal(9);
        System.out.println(list.print());
        

        System.out.println("Head: " + list.getHead().getElement());
        System.out.println("Tail: " + list.getTail().getElement());
        
}
    
    
}
