/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *Clase para definir una matriz de adyacencia que representa un grafo no dirigido co aristas multiponderadas 
 * @author juan-parra
 */
public class Matriz {
    //Atributos de la clase
    private int numVerts;
    private static final int MaxVerts = 20;
    private Vertice verts[];
    private Arista[][] matAd;
/**
 * Constructor de la clase, creando una matriz 20*20, con sus valores aij siendo objetos aristas con dos atributos principales, distancia y feromonas
 */
    public Matriz() {
        matAd = new Arista[MaxVerts][MaxVerts];
        verts = new Vertice[MaxVerts];
        Arista[] aristas = new Arista[400];
        for (int i = 0; i < aristas.length; i++) {
            aristas[i] = new Arista();
        }
        int counter = 0;
        for (int i = 0; i < MaxVerts; i++) {
            for (int j = 0; j < MaxVerts; j++) {
                matAd[i][j] = aristas[counter];
                counter++;
            }
        }
        numVerts = 0;
    }//fin del constructor
/**
 * Metodo para agregar un nuevo vertice a la matriz
 * @param nom string nombre del nuevo vertice
 */
    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.setNumVertice(numVerts);
            verts[numVerts++] = v;
        }

    }
/**
 * Metodo para retornar el nombre de un vertice en un determinado indice
 * @param i index en el array de vertices
 * @return nombre del vertice en un string
 */
    public String vertName(int i) {
        return verts[i].getNombre();
    }
/**
 * Metodo para eliminar un vertice determinado
 * @param nom String nombre del vertice
 * @throws Exception 
 */
    public void eliminarVertice(String nom) throws Exception {
        boolean esta = numVertice(nom) >= 0;
        if (esta) {
            Vertice v = new Vertice(nom);
            boolean encontrado = false;
            int i = 0;
            for (; (i < numVerts) && !encontrado;) {
                encontrado = verts[i].equals(v);
                if (!encontrado) {
                    i++;
                }
            }
           
            for (int j = i; j < (MaxVerts - 1); j++) {
                verts[j] = verts[j + 1];
                for (int k = 0; k < (MaxVerts - 1); k++) {
                    matAd[j][k] = matAd[j + 1][k];
                    matAd[k][j] = matAd[k][j + 1];

                }
            }
                               
            Arista arista = new Arista();
            for (int j = 0; j < (MaxVerts - 1); j++) {
                matAd[j][MaxVerts - 1] = arista;
                matAd[MaxVerts - 1][j] = arista;
            }
            matAd[MaxVerts - 1][MaxVerts - 1] = arista;
           
            numVerts--;
          
            
        }
    }
/**
 * Metodo que retorna el indice correspondiente en el array de vertices de la matriz, de un vertice determinado
 * @param vs nombre del vertice (String)
 * @return int index
 */
    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado;) {
            if (verts[i] != null) {
                encontrado = verts[i].equals(v);
            }
            if (!encontrado) {
                i++;
            }
        }
        return (i < numVerts) ? i : -1;
    }
/**
 * Metodo para agregar una nueva relacion, camino, de distancia entre dos vertices
 * @param a  nombre de ciudad inicial
 * @param b nombre de ciudad final 
 * @param d distancia entre las ciudades
 * @throws Exception 
 */
    public void nuevaDistancia(String a, String b, double d) throws Exception {
        int va,
         vb;

        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            throw new Exception("Vertice no existe");
        }
        int numVerts = getNumVerts();
        //double valorInicial = 1/(double) numVerts;
        matAd[va][vb].setDistancia(d);
        matAd[vb][va].setDistancia(d);
        //matAd[va][vb].setFeromona(valorInicial);
        //matAd[vb][va].setFeromona(valorInicial);
    }
/**
 * Metodo para setear la feromona entre dos vertices determinados
 *@param a  nombre de ciudad inicial
 * @param b nombre de ciudad final 
 * @param f cantidad de feromona entre las ciudades
 * @throws Exception 
 */
    public void nuevaFeromona(String a, String b, double f) throws Exception {
        int va,
         vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            throw new Exception("Vertice no existe");
        }
        matAd[va][vb].setFeromona(f);
        matAd[vb][va].setFeromona(f);
    }
/**
 * Metodo que devuelve el numero de vertices existentes en la matriz
 * @return 
 */
    public int getNumVerts() {
        return numVerts;
    }
/**
 * Metodo para indicar si dos vertices son adyacentes, es decir, si tienen una distancia entre si en la matriz
 * @param a ciudad de inicio
 * @param b ciudad final
 * @return booleano true, si son adyacentes, false si no lo son 
 * @throws Exception 
 */
    public boolean adyacente(String a, String b) throws Exception {
        int va,
         vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            throw new Exception("Vertice no existe");
        }
        return matAd[va][vb].getDistancia() != 0;
    }
/**
 * Metodo para retornar una ListaDoble de las ciudades adyacentes a una ciudad dada
 * @param a ciudad a la que se quieren buscar las ciudades adyacentes
 * @return LIstaDoble de ciudades adyacentes a la ciudad a
 * @throws Exception 
 */
    private ListaDoble adyacentes(String a) throws Exception {
        int va;
        ListaDoble adyacentes = new ListaDoble();
        va  = numVertice(a);
        if (va  < 0) {
            throw new Exception("Vertice no existe");
        }
        for (int i = 0; i < MaxVerts; i++) {
            if (matAd[va][i].getDistancia() != 0) {
                adyacentes.insertFinal(matAd[va][i]);
            }
        }
        return adyacentes;
    }
/**
 * Metodo para imprimir la matriz
 * @param s s indica que tipo de informacion se va a imprimir, si las distancias (s = 0) o las feromonas (s=1)
 */
    public void print(int s) {
        System.out.print("|");

        for (int y = 0; y < verts.length; y++) {
            if (verts[y] != null) {
                System.out.print(verts[y].getNombre());
            }
            if (y != 19) {
                System.out.print("\t");
            }
        }
        System.out.println("|");
        for (int x = 0; x < matAd.length; x++) {
            if (verts[x] != null) {
                System.out.print(verts[x].getNombre());
            }
            System.out.print("|");
            for (int y = 0; y < matAd[x].length; y++) {
                if (s == 0) {
                    System.out.print(matAd[x][y].getDistancia());
                } else {
                    System.out.print(matAd[x][y].getFeromona());
                }
                if (y != matAd[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
/**
 * Metodo para llevar la matriz de distancias a un string
 * @return String de matriz de distancias
 */
    public String grafoDistanciaString() {
        String grafo = "ciudad\n";
        for (int i = 0; i < verts.length; i++) {
            if (verts[i] != null) {
                grafo += (verts[i].getNumVertice()+1) + "\n";
            }
        }
        grafo += "aristas\n";

        for (int i = 0; i < matAd.length; i++) {
            if (verts[i] != null) {
                for (int j = 0; j < matAd[i].length; j++) {
                    if (i < j) {
                        if (matAd[i][j].getDistancia() != 0) {
                            String cadena = (verts[i].getNumVertice()+1) + "," + (verts[j].getNumVertice()+1) + "," + matAd[i][j].getDistancia() + "\n";
                            grafo += cadena;
                        }
                    }
                }

            }

        }
        return grafo;
    }
/**
 * Metodo para llevar la matriz de feromonas a un string
 * @return String de matriz de feromonas
 */
    public String grafoFeromonaString() {
        String grafo = "ciudad\n";
        for (int i = 0; i < verts.length; i++) {
            if (verts[i] != null) {
                grafo += verts[i] + "\n";
            }
        }
        grafo += "arista\n";

        for (int i = 0; i < matAd.length; i++) {
            if (verts[i] != null) {
                for (int j = 0; j < matAd[i].length; j++) {
                    if (i > j) {
                        if (matAd[i][j].getDistancia() != 0) {
                            String cadena = i + "," + j + "," + matAd[i][j].getDistancia() + "," + matAd[i][j].getFeromona() + "\n";
                            grafo += cadena;
                        }
                    }

                }

            }

        }
        return grafo;
    }
/**
 * Metodo para obtener un array de ciudades adyacentes a la ciudad a 
 * @param a nombre de la ciudad de la que se busca esta informacion
 * @return Array de strings con los nombres de las ciudades adyacentes
 * @throws Exception 
 */
    public String[] verticesAd(String a) throws Exception {
        int va,
         counter = 0;
        va  = numVertice(a);

        if (va  < 0) {
            throw new Exception("Vertice no existe");
        }
        for (int i = 0; i < MaxVerts; i++) {
            if (matAd[va][i].getDistancia() != 0) {
                counter++;
            }
        }
        String[] adyacentes = new String[counter];
        counter = 0;
        for (int i = 0; i < MaxVerts; i++) {
            if (matAd[va][i].getDistancia() != 0) {
                adyacentes[counter] = vertName(i);
                counter++;
            }
        }
        return adyacentes;
    }
/**
 * Metodo para obtener el array de vertices de la matriz
 * @return  array de vertices
 */
    public Vertice[] getVerts() {
        return verts;
    }
/**
 * Metodo para obtener la matriz de adyacencia generada
 * @return Matriz de adyacencia con aristas multiponderadas
 */
    public Arista[][] getMatAd() {
        return matAd;
    }
/**
 * Metodo para setear las feromonas iniciales en cada uno de los caminos eistentes, dada por la formula de el ACO algotirhm 
 * @throws Exception 
 */
    public void feromonasIniciales() throws Exception {
        int numVerts = this.getNumVerts();
        double valorInicial = 1 / (double) numVerts;
        for (int x = 0; x < numVerts; x++) {
            String sx = this.vertName(x);
            for (int y = 0; y < numVerts; y++) {
                String sy = this.vertName(y);
                if (this.adyacente(sx, sy)) {
                    this.nuevaFeromona(sx, sy, valorInicial);
                }
            }
        }
    }
/**
 * Metodo para eliminar un arco entre dos ciudades
 * @param a ciudad inciala
 * @param b ciudad final
 * @return distancia eliminada
 * @throws Exception 
 */
    public double eliminarArco(String a, String b) throws Exception {
        int va,
         vb;
        double distance;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            throw new Exception("Vertice no existe");
        }
        distance = matAd[va][vb].getDistancia();
        matAd[va][vb].setDistancia(0);
        matAd[vb][va].setDistancia(0);
        matAd[va][vb].setFeromona(0);
        matAd[vb][va].setFeromona(0);
        return distance;
    }
/**
 * Metodo para obtener el numero de ciudades adyacentes a una ciudad 
 * @param i index de la ciudad en el vertice I
 * @return 
 */
    public int numAdyacentes(int i) {
        int counter = 0;
        for (int j = 0; j < 10; j++) {
            if (matAd[i][j].getDistancia() != 0) {
                counter++;
            }
        }
        return counter;
    }
/**
 * Metodo para realizar un Deep-First-Search Algorithm
 * @param numVert Numero de vertice por el que se empieza
 * @param visited Array de booleanos de ciudades visitadas por su indez
 * @return
 * @throws Exception 
 */
    public boolean[] deepFirstSearch(int numVert, boolean[] visited) throws Exception {
        visited[numVert] = true;
        String va  = vertName(numVert);
        String[] adyacentes = verticesAd(va);
        for (String x : adyacentes) {
            if (!visited[numVertice(x)]) {
                deepFirstSearch(numVertice(x), visited);
            }
        }
        return visited;
    }
/**
 * Metodo para contar las ciudades en cada uno de los DFS realizados
 * @return int de ciudades contadas
 * @throws Exception 
 */
    public int countDFS() throws Exception {
        boolean[] visited = new boolean[getNumVerts()];
        visited = deepFirstSearch(0, visited);
        int count = 0;
        for (boolean t : visited) {
            if (t) {
                count++;
            }
        }
        return count;
    }
/**
 * Metodo apra saber si la ciudad representa un puente para el grafo no ponderado
 * @param i indice de la ciudad en el array de vertices
 * @return booleano, true si es puente, false si no lo es
 * @throws Exception 
 */
    public boolean isBridge(int i) throws Exception {
        String va  = vertName(i);
        String[] adyacentes = verticesAd(va);
        int firstcount = countDFS(), secondcount;
        double distance;
        if (numAdyacentes(i) != 1) {
            for (String ver : adyacentes) {
                distance = eliminarArco(va, ver);
                secondcount = countDFS();
                nuevaDistancia(ver, va, distance);
                if (secondcount < firstcount) {
                    return true;
                }
            }
        }
        return false;

    }
/**
 * Metodo para retornar todas las ciudades de la matriz que no representan un puente
 * @return Array de strings de los nombres de las ciudades
 * @throws Exception 
 */
    public String[] nonBridgeds() throws Exception {
        int counter = 0;
        for (int i = 0; i < getNumVerts(); i++) {
            if (!isBridge(i)) {
                counter++;
            }
        }
        String[] deletable = new String[counter];
        int h = 0;
        for (int i = 0; i < getNumVerts(); i++) {
            if (!isBridge(i)) {
                deletable[h] = vertName(i);
                h++;
            }
        }
        return deletable;
    }
/**
 * Metodo para obtener las ciudades y sus respectivas aristas de conexion
 * @return String con la informacion
 * @throws Exception 
 */
    public String citiesAndPaths() throws Exception {
        String x = "";
        x += "\n\nCiudad      Aristas de conexion\n";
        String va,
        vb;
        for (int i = 0; i < getNumVerts(); i++) {
            va  = vertName(i);
            x += va  + "\n";
            for (int m = 0; m < getNumVerts(); m++) {
                vb = vertName(m);
                if (adyacente(va, vb)) {
                    x += "                    " + vb + "-  " + getMatAd()[i][m].getDistancia() + "m\n";
                }
            }
            x += "\n";

        }
        return x;
    }
/**
 * Metodo para saber si un string es un vertice
 * @param x nombre de la ciudad
 * @return boolean true si si es vertice, false si no lo es 
 */
    public boolean isVert(String x) {
        for (int i = 0; i < getNumVerts(); i++) {
            if (getVerts()[i].getNombre().equalsIgnoreCase(x)) {
                return true;
            }
        }
        return false;
    }

}
