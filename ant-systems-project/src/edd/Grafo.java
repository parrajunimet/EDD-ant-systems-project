
package edd;

import edd.GrafoMatriz;


public class Grafo {
    
    private GrafoMatriz matrizDistancias;
    private GrafoMatriz matrizFeromonas;

    //Constructor
    public Grafo() {
        this.matrizDistancias = new GrafoMatriz();
        this.matrizFeromonas = new GrafoMatriz();
    }
    
    //Getters  y Setters
     public GrafoMatriz getMatrizDistancias() {
        return matrizDistancias;
    }

    public void setMatrizDistancias(GrafoMatriz matrizDistancias) {
        this.matrizDistancias = matrizDistancias;
    }

    public GrafoMatriz getMatrizFeromonas() {
        return matrizFeromonas;
    }

    public void setMatrizFeromonas(GrafoMatriz matrizFeromonas) {
        this.matrizFeromonas = matrizFeromonas;
    }
    
    //Primitivas
    public void nuevoVertice (String nom){
        this.matrizDistancias.nuevoVertice(nom);
        this.matrizFeromonas.nuevoVertice(nom);
    }
    
    public void eliminarVertice (String nom){
        this.matrizDistancias.eliminarVertice(nom);
        this.matrizFeromonas.eliminarVertice(nom);
    }
    
    public void nuevaDistancia(String a, String b, double d)throws Exception{
        this.matrizDistancias.nuevoArco(a, b, d);
    }
    
    public void nuevaFeromona(String a, String b, double d)throws Exception{
        if(this.matrizDistancias.adyacente(a, b)){
            this.matrizFeromonas.nuevoArco(a, b, d); 
        }
    }
    
    public void feromonasIniciales()throws Exception{
        int numVerts = this.matrizDistancias.getNumVerts();
        double valorInicial = 1/(double) numVerts;
        for (int x=0; x < numVerts; x++) {
            String sx = this.matrizDistancias.vertName(x);
            for (int y=0; y < numVerts; y++) {
                String sy = this.matrizDistancias.vertName(y);
                if(this.matrizDistancias.adyacente(sx, sy)){
                    this.matrizFeromonas.nuevoArco(sx, sy, valorInicial);
                }
            }
        }
    }
        
    public int numVertice(String e){
        return this.matrizDistancias.numVertice(e);
    }

   
}
