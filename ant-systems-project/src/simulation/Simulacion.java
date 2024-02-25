/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

import edd.Matriz;
import edd.ListaDoble;
import edd.NodoDoble;
import java.text.DecimalFormat;

/**
 *
 * @author Sofia
 */

public class Simulacion {
    private String ciudadi; 
    private String ciudadf; 
    private Matriz grafos; 
    private int cycles, antn;
    private double p, a, b; 
    private Ant[] ants; 
    private String optimepath;
    private double optimedistance;
    
    //Valores iniciales de la simulacion 
    public Simulacion(Matriz grafos, String ciudadi, String ciudadf, int cycles, int antn, double a, double b, double p) {
        this.grafos = grafos; 
        this.ciudadi = ciudadi;
        this.ciudadf = ciudadf;
        this.cycles = cycles;
        this.antn = antn;
        this.a = a;
        this.b = b;
        this.ants = new Ant[antn];
        this.p = p;
        this.optimepath = ""; 
        this.optimedistance = 0; 
        
    }
    
    public void startData() throws Exception {
        creadoHormigas(); 
        grafos.feromonasIniciales();
    }
    
    
    public void creadoHormigas(){
        for (int i = 0; i < antn; i++) {
            Ant ant = new Ant(0);
            ant.addCity(this.ciudadi, this.ciudadf);
            this.ants[i] = ant; 
        }
    }
    
    
    public String getOptimePath(){
        return this.optimepath;
    }
    
    public String simulationResults() throws Exception {
        String result = "El camino mas optimo en los " + this.cycles + " ciclos fue:\n        "; 
        for (int i = 0; i < this.optimepath.length(); i++) {
            if (i != this.optimepath.length() -1 ) result+=  this.optimepath.charAt(i) + " --> "; 
            else result+=  this.optimepath.charAt(i); 
        }
        result += "\nDistancia: " + String.format("%.2f", this.optimedistance).replace(',', '.')  + "m"; 
        //System.out.println(result);
        return result; 
    }
    public String[] Cycle() throws Exception {
        while (!endofCycle()) {
            for (Ant ant : ants) {
                if (ant.getState() == 0) {
                    String a = String.valueOf(ant.getCiudades().getTail().getElement());
                    String camino = chooseCity(a, ant); 
                    ant.addCity(camino, this.ciudadf);   
                    //System.out.println("Hormiga  " + ant +" : " + ant.getCiudades().printString() );
                    //System.out.println("\n\n");
                }       
            }
            //System.out.println("\n\n");
        } 
        feromonesUptade();
        double mindistance = -1; 
        String results1 = "", resultsc = "", resultsd = ""; 
        NodoDoble pointer;
        int x, y, index=0; 
        double [] distances = new double[this.antn]; 
        for (int i = 0; i < ants.length; i++) { 
            distances[i]=0; 
            pointer = ants[i].getCiudades().getHead(); 
            while (pointer.getNext() != null) {
                x= grafos.numVertice(String.valueOf(pointer.getElement()));
                y=grafos.numVertice(String.valueOf(pointer.getNext().getElement()));
                distances[i] += grafos.getMatAd()[x][y].getDistancia(); 
                pointer = pointer.getNext(); 
            }
        }
       
        for (int i = 0; i < distances.length; i++){
            if (mindistance == -1) {
                if (ants[i].getState() == 2) {
                    mindistance = distances[i]; 
                    index = i; 
                }
            }
            if (ants[i].getState() == 2) {
                if (distances[i] < mindistance) {
                   mindistance = distances[i]; 
                   index = i; 
                }
            } 
        }
        
        if (mindistance == -1) {
            results1 += "No hay camino mas corto, puesto que ninguna hormiga llego a la ciudad destino, todas quedaron estancadas. ";
        } else {
                   if (this.optimepath == "") {
                    this.optimepath = ants[index].getCiudades().printString().replace(" -> ", ""); 
                    this.optimedistance =  mindistance; 
                } else {
                    int optdistance = 0; 
                    for (int i = 0; i < this.optimepath.length()-1; i++) {
                        x=grafos.numVertice(String.valueOf(this.optimepath.charAt(i)));
                        y=grafos.numVertice(String.valueOf(this.optimepath.charAt(i+1)));
                        optdistance += grafos.getMatAd()[x][y].getDistancia(); 
                        }
                    if (optdistance > mindistance) {
                        this.optimepath = ants[index].getCiudades().printString().replace(" -> ", ""); 
                        this.optimedistance = mindistance; 
                    }
            
                } 
        }
     
        //System.out.println("\n\n");
        //String results= "El camino mas corto fue: \n";
        results1 += ants[index].getCiudades().printString() +"\nDistancia: " + String.format("%.2f", mindistance).replace(',', '.') +"m\n";
        //results += results1; 
        for (int i = 0; i < ants.length; i++) {
            resultsc+= ants[i].getCiudades().printString()+ "\n\n"; 
            resultsd += String.format("%.2f",distances[i] ).replace(',', '.') + " m\n\n";
            //results += "Hormiga " + i+1 + "           " + ants[i].getCiudades().printString() + "           " + distances[i] + " m\n"; 
            
        }
        for (Ant ant : ants) {
            ant.getCiudades().emptyButHead();
            ant.setState(0);
        }
        
        
        //System.out.println(results);
        String[] results = {results1, resultsc, resultsd}; 
        return results; 
    }
        
        
    public void feromonesUptade() throws Exception{
        int xA, yB; 
        for (Ant ant: ants) {
            if (ant.getState() != 1) {
                ListaDoble camino = ant.getCiudades();
                NodoDoble ciudad = camino.getHead(); 
                while (ciudad.getNext() != null){
                    xA= grafos.numVertice(String.valueOf(ciudad.getElement()));
                    yB = grafos.numVertice(String.valueOf(ciudad.getNext().getElement()));
                    double add = 1/(grafos.getMatAd()[xA][yB].getDistancia());
                    grafos.getMatAd()[yB][xA].setFeromona(grafos.getMatAd()[yB][xA].getFeromona()+ add);
                    grafos.getMatAd()[xA][yB].setFeromona(grafos.getMatAd()[xA][yB].getFeromona()+ add);
                    ciudad = ciudad.getNext(); 
                }
            }
        }
        int numVerts = grafos.getNumVerts();
        double factor = 1- this.p, v1, v2;
        for (int x=0; x < numVerts; x++) {
            String sx = grafos.vertName(x);
            for (int y=0; y < numVerts; y++) {
                String sy = grafos.vertName(y);
                if(grafos.adyacente(sx, sy)){
                    v1 = grafos.getMatAd()[y][x].getFeromona(); 
                    v1 *= factor; 
                    grafos.getMatAd()[y][x].setFeromona(v1);
                }
            }
        
           }   

        
    }
    
    public String [] possibleCitys(String a, Ant ant) throws Exception{
        String[] ciudadesAd = grafos.verticesAd(a);
        ListaDoble visitadas = ant.getCiudades(); 
        /*
        System.out.println("Ciudades visitadas");
        System.out.println(visitadas.printString());
        System.out.println("Ciudades adyacentes");
        for (String c: ciudadesAd) {
            System.out.print(c + "-");
            }
       System.out.println("\n");
*/
        
        int x=0; 
        for (int i = 0; i < ciudadesAd.length; i++) {
            if (visitadas.isIn(ciudadesAd[i])) {
                x++;
            } 
        }if (x< ciudadesAd.length) {
            String [] cities = new String[ciudadesAd.length-x];
            x =0; 
            for (String ciudad: ciudadesAd) {
                if (!visitadas.isIn(ciudad)) {
                    cities[x] = ciudad; 
                    x++;
                }
            }  //System.out.println("Ciudades para la hormiga");
            /*
                for (String c: cities) {
                    System.out.print(c + "-");
                }
                System.out.println("\n");
            */
                return cities; 
        } return null;
    }
    
    
    
    public String chooseCity(String a, Ant ant) throws Exception{ 
        int xA = grafos.numVertice(a);
        String cityB = ""; 
        int y;
        double d, t, n, sumatoria =0; 
        String[] ciudadesAd = possibleCitys(a, ant);
        if (ciudadesAd != null) {
            for (String i: ciudadesAd) {
                y = grafos.numVertice(i);
                t = grafos.getMatAd()[xA][y].getFeromona();
                d = grafos.getMatAd()[xA][y].getDistancia();
                n = 1/d; 
                sumatoria += Math.pow(t, this.a)* Math.pow(n, b); 
            }
            double[] acomulated = new double[ciudadesAd.length];
            double[] probabilities = new double[ciudadesAd.length];
            double probacomulation = 0;
            for (int i = 0; i < acomulated.length; i++) {
                y = grafos.numVertice(ciudadesAd[i]);
                t = grafos.getMatAd()[xA][y].getFeromona();
                d = grafos.getMatAd()[xA][y].getDistancia();
                n = 1/d; 
                probabilities [i] =  (Math.pow(t, this.a)*Math.pow(n, this.b))/sumatoria; 
                probacomulation += probabilities[i] ; 
                acomulated[i] = probacomulation; 
            }
            Double random =  Math.random(); 
            for (int i = 0; i < acomulated.length; i++) {
                if (acomulated[i] >  random) {
                    return ciudadesAd[i]; 
                }        
            }
        }else {
            ant.setState(1);
        }   
       return null;
    }
    
    
    public boolean endofCycle() {
        boolean end = true; 
        for (Ant ant : ants) {
            if (ant.getState() == 0) {
                end = false; 
            }
        } 
        return end; 
    }
        
    
}
