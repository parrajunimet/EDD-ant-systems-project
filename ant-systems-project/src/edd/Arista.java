/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *Clase para definir cada una de las aristas multiponderass del grafo no dirigido
 * @author juan-parra
 */
public class Arista {
    //Atributos de la clase
    private double distancia;
    private double feromona;
    /**
     * Constructor 
     */
    public Arista() {
        this.distancia = 0;
        this.feromona = 0;
    }// Fin del constructor
    /**
     * Metodo para obtener la distancia correspondiente a la arista
     * @return double de distancia 
     */
    public double getDistancia() {
        return distancia;
    }
    /**
     * Metodo para setear la distancia correspondiente a la arista
     * @param distancia  nuevo double de distancia
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * Metodo para obtener la feromona correspondiente a la arista
     * @return double de feromona  
     */
    public double getFeromona() {
        return feromona;
    }
    /**
     * Metodo para setear la feromona correspondiente a la arista
     * @param feromona  nuevo double de feromona
     */
    public void setFeromona(double feromona) {
        this.feromona = feromona;
    }
    
    
    
}
