package edd;

public class GrafoMatriz {
    private int numVerts;
    private static int MaxVerts = 20;
    private Vertice verts[];
    private double [][] matAd;

    public GrafoMatriz() {
        matAd = new double [MaxVerts][MaxVerts];
        verts = new Vertice [MaxVerts];
        for (int i=0; i< MaxVerts; i++)
            for (int j=0; j< MaxVerts; j++)
                matAd[i][j] = 0;
        numVerts = 0;
    }
    
    public void nuevoVertice (String nom){
        boolean esta = numVertice(nom) >= 0;
        if(!esta)
        {
            Vertice v = new Vertice(nom);
            v.setNumVertice(numVerts);
            verts[numVerts++] = v;
        }
    }
    
    public String vertName(int i){
        return verts[i].getNombre();
    }
    
    public void eliminarVertice (String nom){
        boolean esta = numVertice(nom) >= 0;
        if(esta){
            Vertice v = new Vertice(nom);   
            boolean encontrado = false;
            int i = 0;
            for(; (i < numVerts) && !encontrado;){
                encontrado = verts[i].equals(v);
                if (!encontrado) i++ ;
            }
            for (int j = i; j < (MaxVerts-1); j++) {
                verts[j] = verts[j+1];
                for (int k = 0; k < (MaxVerts-1); k++) {
                    matAd[j][k] = matAd[j+1][k];
                    matAd[k][j] = matAd[k][j+1];
                }                   
            }
            verts[MaxVerts-1] = null;
            for (int j = 0; j < (MaxVerts-1); j++) {
                matAd[j][MaxVerts-1] = 0;
                matAd[MaxVerts-1][j] = 0;
            }
            matAd[MaxVerts-1][MaxVerts-1] = 0;
            numVerts --;
        }
    }
    
    public int numVertice(String vs){
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for(; (i < numVerts) && !encontrado;){
            if(verts[i] != null){            
                encontrado = verts[i].equals(v);
            }
            if (!encontrado) i++ ;
        }
        return (i < numVerts) ? i : -1;
    }
    
    public void nuevoArco(String a, String b, double d)throws Exception{
        int va, vb;
        
        va = numVertice(a);
        vb = numVertice(b);
        if(va < 0 || vb <0)throw new Exception ("Vertice no existe");
        matAd[va][vb] = d;
        matAd[vb][va] = d;
    }

    public int getNumVerts() {
        return numVerts;
    }
    
    public boolean adyacente(String a, String b)throws Exception{
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if(va < 0 || vb <0)throw new Exception ("Vertice no existe");
        return matAd[va][vb] != 0;
    }
    
    public ListaDoble adyacentes(String a)throws Exception{
        int va;
        ListaDoble adyacentes = new ListaDoble();
        va = numVertice(a);     
        if(va < 0)throw new Exception ("Vertice no existe");
        for (int i = 0; i < MaxVerts; i++) {
            if(matAd[va][i] != 0){
                adyacentes.insertFinal(matAd[va][i]);
            }
        }
        return adyacentes;
    }
    
    public void print(){
        System.out.print("|");
        
        for (int y=0; y < verts.length; y++) {
          if (verts[y] != null){
              System.out.print (verts[y].getNombre());          
          }
          if (y!=19) System.out.print("\t");
        }
        System.out.println("|");
        for (int x=0; x < matAd.length; x++) {
            if (verts[x] != null){
                System.out.print (verts[x].getNombre());          
            }
            System.out.print("|");
            for (int y=0; y < matAd[x].length; y++) {
              System.out.print (matAd[x][y]);
              if (y!=matAd[x].length-1) System.out.print("\t");
            }
        System.out.println("|");
}
    }
    
    public String grafoString() {
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
                    if (matAd[i][j] != 0) {
                        String cadena = i + "," + j + "," + matAd[i][j] + "\n";
                        grafo += cadena;
                    }
                }

            }

        }
        return grafo;
    }
}

