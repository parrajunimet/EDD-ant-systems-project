/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author juan-parra
 */
public class Matriz {

    private int numVerts;
    private static final int MaxVerts = 20;
    private Vertice verts[];
    private Arista[][] matAd;

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
    }

    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.setNumVertice(numVerts);
            verts[numVerts++] = v;
        }

    }

    public String vertName(int i) {
        return verts[i].getNombre();
    }

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

    public int getNumVerts() {
        return numVerts;
    }

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

    public Vertice[] getVerts() {
        return verts;
    }

    public Arista[][] getMatAd() {
        return matAd;
    }

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

    public int numAdyacentes(int i) {
        int counter = 0;
        for (int j = 0; j < 10; j++) {
            if (matAd[i][j].getDistancia() != 0) {
                counter++;
            }
        }
        return counter;
    }

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

    public boolean isVert(String x) {
        for (int i = 0; i < getNumVerts(); i++) {
            if (getVerts()[i].getNombre().equalsIgnoreCase(x)) {
                return true;
            }
        }
        return false;
    }

}
