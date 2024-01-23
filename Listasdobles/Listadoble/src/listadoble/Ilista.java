/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package listadoble;

/**
 *
 * @author Sofia
 */
public interface Ilista {
    
    public void insertBegin(Object element); 
    public void insertFinal (Object element); 
    public void insertinIndex (Object element, int index);
    public Object deleteFinal (); 
    public Object deleteBegin (); 
    public Object deleteinIndex (int index);
    public boolean isEmpty(); 
    public String print(); 
}
