/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

import edd.ListaDoble;

/**
 *
 * @author Sofia
 */
public class Ant {
    private int state; 
    private ListaDoble ciudades; 

    public Ant(int state) {
        this.state = state;
        this.ciudades = new ListaDoble();
    }

    public int getState() {
        return state;
    }
    
    public void addCity(String nom, String cityF) {
       if (nom != null) {
            if (nom.equals(cityF)) setState(2);
            getCiudades().insertFinal(nom);
       } else{
           setState(1);
       }
        
        
        
    }
    public void setState(int state) {
        this.state = state;
    }

    public ListaDoble getCiudades() {
        return ciudades;
    }
    
    
    
}
