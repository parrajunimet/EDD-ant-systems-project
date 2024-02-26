package edd;
/**
 * Metodo para definir los vertice de la matriz de adyacencia 
 * @author Juan Parra
 */
public class Vertice {
    //Atributos de la clase
    private String nombre;
    private int numVertice;
    
    /**
     * Constructor
     * @param nombre del nuevo vertice, ciudad. 
     */
    public Vertice(String nombre) {
        this.nombre = nombre;
        this.numVertice = -1;
    }
    
    /**
     * Metodo para obtener el nombre de la ciudad referente a la arista
     * @return String de ciudad 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo para setear el nombre del vertice
     * @param nombre String del nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo para obtener el index de posicion del vertice
     * @return int de posicion  en el array de vertices de la matriz de adyacencia
     */
    public int getNumVertice() {
        return numVertice;
    }
    /**
     * Metodo para setear el index de posicion del verice
     * @param numVertice 
     */
    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }
    
    /**
     * Metodo para saber si dos vertices son iguales
     * @param n vertice a comparar
     * @return boolean, true si son iguales. 
     */
    public boolean equals(Vertice n){
        return getNombre().equals(n.getNombre());
    }
    
    /**
     * Metodo para obtener toda la informacion del vertice
     * @return String con el nombre y numero del vertice. 
     */
    public String info(){
        return getNombre() + " (" + getNumVertice() + ")";
    }
}
