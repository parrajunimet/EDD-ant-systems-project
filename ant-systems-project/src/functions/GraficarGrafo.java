package functions;
import edd.Matriz;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;
import simulation.Simulacion;

/**
 * Esta clase se encarga de mostrar un gr&aacute;fico utilizando GraphStream y Swing.
 * Proporciona un m&eacute;todo para mostrar el gr&aacute;fico basado en una matriz dada.
 * 
 * @author luigi perez
 * @version 20 feb 2024
 */
public class GraficarGrafo {
    /**
    * Muestra un grafo utilizando GraphStream.
    * Recibiendo una Matriz que adjunte caminos, ciudades y la cantidad de 
    * feromonas por camino, para su posterior graficado.
    * 
    * @author luisperez
    * @param matriz Matriz de adyacencia del grafo a ser visualizado.
    * @param simulacion Instancia de <code>Simulacion</code> para acceder al optime path.
    */
    public void mostrar(Matriz matriz, Simulacion simulacion){
        
        //Se instancia un nuevo graph, de la librer&iacute;a.
        Graph graph = new SingleGraph("Prueba ");
        
        //Al agregar este atributo al grafo, se aplican t&eacute;cnicas de renderizado 
        //avanzadas para mejorar la apariencia de los elementos visuales del grafo.
        graph.addAttribute("ui.quality");
        
        //El antialiasing suaviza los bordes y las l&iacute;neas del grafo, 
        //lo que resulta en una apariencia m&aacute;s suave y de mayor calidad visual.
        graph.addAttribute("ui.antialias");
        
        
        // Establece el modo estricto del grafo en falso.
        // Esto permite agregar nodos y aristas sin restricciones.
        graph.setStrict(false);

        // Habilita la creación automática de nodos y aristas.
        // Cuando se agrega una arista entre dos nodos que no existen, los nodos se crean automáticamente.
        graph.setAutoCreate(true);

        // Establece la propiedad del renderizador de la interfaz de usuario para utilizar el renderizador J2DGraphRenderer.
        // Esto asegura que el grafo se renderice utilizando el renderizador J2D.
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        
        //Se le pone color al fondo de grafo a ver.
        graph.setAttribute("ui.stylesheet", "graph { fill-color: orange; }");
        
        String recorrido = simulacion.getOptimePath();
        int length = recorrido.length() - 1;
        String[] caminos = new String[length];
        
        //Hago un array con cada ciudad en string de el camino &oacute;ptimo.
        for (int i = 0; i < length; i++) {
            int camino = (recorrido.charAt(i) - '0') * 10 + (recorrido.charAt(i + 1) - '0');
            caminos[i] = Integer.toString(camino);
        }
        
        //Genero cada nodo recorriendo la matriz de adyacencia
        //Es decir sus v&eacute;rtices.
        for(int i =0;i<matriz.getNumVerts();i++){
            Node nuevo = graph.addNode(matriz.getVerts()[i].getNombre());
            nuevo.setAttribute("ui.label",matriz.getVerts()[i].getNombre());
            nuevo.addAttribute("ui.style", "text-alignment: center; text-size: 22px;fill-color: white; text-color: black; stroke-mode: plain; stroke-color: black;size-mode: fit; shape: circle; fill-color: white; stroke-mode: plain; padding: 6px, 6px;");
            nuevo.addAttribute("ui.label", matriz.getVerts()[i].getNombre());
        }

        //Se generan los caminos, en su interior se valida
        //con el condicional si tiene distancia es decir que existe
        //Y ibien se redondea las feromonas para mostrarlas como layout.
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
        
        //Se ponen en verde los del optimepath.
        for (String camino1 : caminos) {
            Edge camino = graph.getEdge(camino1);
            camino.addAttribute("ui.style", "fill-color: green;");
        }
        

        
        //Se muestra el grafo como un anueva ventana.
        graph.display();
        
    }
}


