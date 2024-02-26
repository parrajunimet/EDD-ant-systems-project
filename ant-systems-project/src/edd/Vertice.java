package edd;
/**
 * Clase que definen los vertices del grafo multiponderado representado por la matriz de adyacencia 
 * @author Juan Parra
 */
public class Vertice {
    // Atributos de la clase
    private String nombre;
    private int numVertice;
/**
 * Constructor de la clase
 * @param nombre del vertice, en este caso, de la ciudad, son numeros del 1-20
 */
    public Vertice(String nombre) {
        this.nombre = nombre;
        this.numVertice = -1;
    }// Fin del constructor
    
    
/**
 * Metodo que retorna el nombre del vertice
 * @return String correspondiente al nombre del vertice
 */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo que setea el nombre del vertice
     * @param nombre que se le desea dar al vertice
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Nombre para obtener el numero de vertice asignado a este vertice en el array de vertices de la matriz
     * @return int index en el array de vertices 
     */
    public int getNumVertice() {
        return numVertice;
    }
    
    /**
     * Metodo para setear el indice correspondiente a este vertice en el array de vertices de la matriz
     * @param numVertice int index
     */

    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }
    
    /**
     * Metodo para saber si este vertice es el mismo que otro vertice n. 
     * @param n Vertice del tipo n
     * @return true si son iguales, false si no lo son
     */
    
    public boolean equals(Vertice n){
        return getNombre().equals(n.getNombre());
    }
    /**
     * Metodo para obtener toda la informacion del vertice
     * @return String con el nombre del vertice y su index
     */
    
    public String info(){
        return getNombre() + " (" + getNumVertice() + ")";
    }
}
