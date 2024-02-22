
package functions;
/*
//<<<<<<< HEAD
import edd.Matriz;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
//=======

import edd Matriz;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

//>>>>>>> d715b9b6c36cea962fe4e1d75d1561ff32976943

/**Clase que define el GraphStream.
 * Recibiendo como param las matrices de distancias y feromonas.
 * 
 * @author luisperezp
 * @version 19 feb 2024
 */
//<<<<<<< HEAD

/*
>>>>>>> d715b9b6c36cea962fe4e1d75d1561ff32976943
public class GraficarGrafo {

    public void mostrar(Matriz grafo) throws Exception{
        
        System.setProperty("org.graphstream.ui", "swing");
        Graph graph = new SingleGraph("Ciudades");

        graph.setStrict(false);
        graph.setAutoCreate(true);
        graph.display();
        
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        graph.setAutoCreate(true);
        graph.setAttribute("ui.quality");
        graph.setAttribute("ui.antialias");
        graph.setAttribute("ui.stylesheet", "node { text-alignment: center; text-size: 23px; text-background-mode: rounded-box; text-background-color: white; }");
        graph.setAttribute("ui.stylesheet", "node { size-mode: fit; shape: circle; fill-color: white; stroke-mode: plain; padding: 6px, 6px; } edge { arrow-shape: arrow; size: 2px; fill-color: white; }");
        graph.setAttribute("ui.stylesheet", "graph { fill-color: brown; }");
        
        for(int i =0; i<grafo.getNumVerts();i++){
            Node nuevo = graph.addNode(grafo.getVerts()[i].getNombre());
            nuevo.setAttribute("ui.label",grafo.getVerts()[i].getNombre());
        }
        
        double x, y;
        
        for(int j =0;j<grafo.getNumVerts();j++){
            for(int k =0;k<grafo.getNumVerts();k++){
                if(grafo.adyacente(grafo.vertName(j), grafo.vertName(k)))
                    x = grafo.getMatAd()[j][k].getFeromona();
                    y=grafo.getMatAd()[j][k].getDistancia(); 
                    Edge camino = graph.addEdge("Feromonas: "+ Double.toString(x) + "Distancia: "+ Double.toString(y),grafo.getVerts()[j].getNombre(), grafo.getVerts()[k].getNombre());
                    camino.setAttribute("ui.label",Double.toString(y)); 
            }
        }
        
        
        
        
        
    
    }
*/
