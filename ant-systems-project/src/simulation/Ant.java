/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

import edd.ListaDoble;

/**
 *Esta clase define a las hormigas como objetos con estado y ciudades visitadas.
 * @author Sofia
 * @version 12/02/2024
 */
public class Ant {
    //ATributos de la clase
    private int state; 
    private ListaDoble ciudades; 
    
    /**
     * Constructor de la clase
     * @param state, el cual es un int que define el estado de la hormiga, 0 significa recorriendo (todavia puede avanzar), 1 significa estancada, y 2 que ha llegado a la comida.
     */
    public Ant(int state) {
        this.state = state;
        this.ciudades = new ListaDoble();
    }// Fin del constructor
    
    /**
     * Metodo para obtener el estado de la hormiga
     * @return int de estado, 0, 1 o 2.
     */
    public int getState() {
        return state;
    }
    
    /**
     * Metodo para agregar una ciudad a la lista de ciudades visitadas de la hormiga
     * @param nom Ciudad que se desea agregar
     * @param cityF Ciudad destino de la hormiga (Comida)
     */
    public void addCity(String nom, String cityF) {
       if (nom != null) {
            if (nom.equals(cityF)) setState(2);
            getCiudades().insertFinal(nom);
       } else{
           setState(1);
       }

    }
    
    /**
     * Metodo para setear el estado de la hormiga a 0, 1 o 2
     * @param state 
     */
    public void setState(int state) {
        this.state = state;
    }
    /**
     * Metodo para obtener la lista doble de ciudades visitadas por la hormigaa
     * @return listadoble de ciudades visitadas
     */
    public ListaDoble getCiudades() {
        return ciudades;
    }
    
    
    
}
