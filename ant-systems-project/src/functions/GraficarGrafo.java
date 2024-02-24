package functions;
import edd.Matriz;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;
import simulation.Simulacion;
/**
 * Esta clase se encarga de mostrar un gr&aacute;fico utilizando GraphStream y Swing.
 * Proporciona un método para mostrar el gr&aacute;fico basado en una matriz dada.
 * 
 * @author luigiperezp
 * @version 20 feb 2024
 */
public class GraficarGrafo {
    /**
    * Muestra un grafo utilizando GraphStream.
    * 
    * @author luisperez
    * @param matriz El grafo a ser visualizado.
    */
    public void mostrar(Matriz matriz, Simulacion simulacion){
        
        Graph graph = new SingleGraph("Prueba ");
        graph.addAttribute("ui.quality");
        graph.addAttribute("ui.antialias");
         graph.setStrict(false);
        graph.setAutoCreate(true);
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");

         graph.setAttribute("ui.stylesheet", "graph { fill-color: orange; }");

        
        //Node nodo1 = graph.addNode("A");
        //nodo1.addAttribute("ui.style", "text-alignment: center; text-size: 22px;fill-color: white; text-color: black; stroke-mode: plain; stroke-color: black;size-mode: fit; shape: circle; fill-color: white; stroke-mode: plain; padding: 6px, 6px;");
        //nodo1.addAttribute("ui.label", "!A");
        
        graph.display();
        
        String recorrido = simulacion.getOptimePath();
        int length = recorrido.length() - 1;
        String[] caminos = new String[length];

        for (int i = 0; i < length; i++) {
            int camino = (recorrido.charAt(i) - '0') * 10 + (recorrido.charAt(i + 1) - '0');
            caminos[i] = Integer.toString(camino);
        }
        
        
        for(int i =0;i<matriz.getNumVerts();i++){
            Node nuevo = graph.addNode(matriz.getVerts()[i].getNombre());
            nuevo.setAttribute("ui.label",matriz.getVerts()[i].getNombre());
            nuevo.addAttribute("ui.style", "text-alignment: center; text-size: 22px;fill-color: white; text-color: black; stroke-mode: plain; stroke-color: black;size-mode: fit; shape: circle; fill-color: white; stroke-mode: plain; padding: 6px, 6px;");
            nuevo.addAttribute("ui.label", matriz.getVerts()[i].getNombre());
        }

        
        for(int k=0;k<matriz.getNumVerts();k++){
            for(int y =0;y<matriz.getNumVerts();y++){
                if(matriz.getMatAd()[k][y].getDistancia()>0.0){
                  String id = Integer.toString(k+1)+Integer.toString(y+1);
                  Edge camino = graph.addEdge(id, matriz.getVerts()[k].getNombre(), matriz.getVerts()[y].getNombre());
                  if(camino!=null){
                    DecimalFormat df = new DecimalFormat("#.##");
                    df.setRoundingMode(RoundingMode.HALF_UP);
                    camino.addAttribute("ui.label", Double.valueOf(df.format(matriz.getMatAd()[k][y].getFeromona())));
                    
                  }
                        
                }
            }
        }
        
        for (String camino1 : caminos) {
            Edge camino = graph.getEdge(camino1);
            camino.addAttribute("ui.style", "fill-color: green;");
        }
        

        

        graph.display();
        
    }
}


