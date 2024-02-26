/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author juan-parra
 */
public class Arista {
    //Atributos de la clase
    private double distancia;
    private double feromona;
/**
 * Constructor de la clase
 */
    public Arista() {
        this.distancia = 0;
        this.feromona = 0;
    }// Fin del cosntructor

    /**
     * Metodo para retornar la distancia correspondiente a la arista
     * @return double de distanciaq
     */
    public double getDistancia() {
        return distancia;
    }
    /**
     * Metodo para setear la distancia correspondiente a la arista
     * @param distancia double distancia entre dos vertices 
     */

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    /**
     * Metodo para retornar la fermona correspondiente a la arista
     * @return double de feromona
     */
    public double getFeromona() {
        return feromona;
    }
/**
 * Metodo para setear la feromona correspondiente a la arista
 * @param feromona cantidad de feromona repartida en la arista
 */
    public void setFeromona(double feromona) {
        this.feromona = feromona;
    }
    
    
    
}
