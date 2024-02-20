package functions;
//import edd.GrafoMatriz;
//import org.graphstream.graph.*;
//import org.graphstream.graph.implementations.*;

/**Clase que define el GraphStream.
 * Recibiendo como param las matrices de distancias y feromonas.
 * 
 * @author luisperezp
 * @version 19 feb 2024
 */
/*
public class GraficarGrafo {
    
    public void mostrar(GrafoMatriz feromonas, GrafoMatriz distancias) throws Exception{
        
        System.setProperty("org.graphstream.ui", "swing");
        Graph graph = new SingleGraph("Ciudades");

        graph.setStrict(false);
        graph.setAutoCreate(true);
        graph.display();
        
        graph.setAutoCreate(true);
        graph.setAttribute("ui.quality");
        graph.setAttribute("ui.antialias");
        graph.setAttribute("ui.stylesheet", "node { size-mode: fit; shape:circle;fill-color: white;  stroke-mode: plain; padding: 4px, 3px; }edge { arrow-shape: line; size: 2px; fill-color: #444; }");
        
        for(int i =0; i<feromonas.getNumVerts();i++){
            graph.addNode(feromonas.getVerts()[i].getNombre());
        }
        
        for(int j =0;j<feromonas.getNumVerts();j++){
            for(int k =0;k<feromonas.getNumVerts();k++){
                if(feromonas.adyacente(feromonas.vertName(j), feromonas.vertName(k)))
                    graph.addEdge("Feromonas: "+ Double.toString(feromonas.getMatAd()[j][k]) + "Distancia: "+ Double.toString(distancias.getMatAd()[j][k]),feromonas.getVerts()[j].getNombre(), feromonas.getVerts()[k].getNombre());
            }
        }
        
        for(Node node : graph){
            node.setAttribute("ui.label", node.getId());
        }
        
        
        
    
    }
}
*/