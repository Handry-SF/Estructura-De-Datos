package grafoproyect1;

import java.util.Scanner;


public class GrafoMatrizListaAdy {

    private final int NUM_VERTICES;
    private int grafo[][];

    //Crea un grafo de numVertices
    //La matriz de adyacencia es inicializada con ceros.
    public GrafoMatrizListaAdy(int numVertices) {
        this.NUM_VERTICES = numVertices;
        grafo = new int[NUM_VERTICES][NUM_VERTICES];

        for (int i = 0; i < grafo.length; i++) {
            for (int j = 0; j < grafo[i].length; j++) {
                grafo[i][j] = 0;
            }
        }
    }

    //Crea un grafo de 6 vertices
    public GrafoMatrizListaAdy() {
        this(7);
    }

    public void insertarArista(int v1, int v2, int pesoArista)
            throws ArrayIndexOutOfBoundsException,
            IllegalArgumentException {
        if (pesoArista == 0) {
            throw new IllegalArgumentException();
        }
        this.grafo[v1][v2] = pesoArista;
        this.grafo[v2][v1] = pesoArista;
    }

    public boolean existeArista(int v1, int v2)
            throws ArrayIndexOutOfBoundsException {

        return (grafo[v1][v2] != 0);
    }

    public int obtenerPesoArista(int v1, int v2)
            throws ArrayIndexOutOfBoundsException {
        return grafo[v1][v2];
    }

    public int eliminarArista(int v1, int v2)
            throws ArrayIndexOutOfBoundsException,
            IllegalArgumentException {
        if (grafo[v1][v2] == 0) {
            throw new IllegalArgumentException("La arista No existe");
        }
        int peso = grafo[v1][v2];
        grafo[v1][v2] = 0;
        grafo[v2][v1] = 0;
        return peso;
    }

    public void liberarGrafo() {
        for (int i = 0; i < grafo.length; i++) {
            for (int j = 0; j < grafo[i].length; j++) {
                grafo[i][j] = 0;
            }
        }
    }

    public void imprimirGrafo() {
        System.out.printf("  %d ", 1);
        int aux = 1;
        for (int i = 2; i < grafo.length; i++) {
            if (i >= 0) {
                System.out.printf("%d ", i );
            } else {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();

        for (int i = 1; i < grafo.length; i++) {

            if (i >= 0) {
                System.out.printf("%d ", i );
            } else {
                System.out.printf("%d ", i);
            }
            for (int j = 1; j < grafo[i].length; j++) {
                System.out.printf("%d ", grafo[i][j]);
            }
            System.out.println();
        }
    }

    public boolean tieneAdyacentes(int v)
            throws ArrayIndexOutOfBoundsException {
        int vActual = 0;
        boolean existeLista = false;

        while (vActual < this.NUM_VERTICES && !existeLista) {
            if (grafo[v][vActual] != 0) {
                existeLista = true;
            } else {
                vActual = vActual + 1;
            }
        }

        return existeLista;
    }

    public int obtenerPrimerAdy(int v)
            throws ArrayIndexOutOfBoundsException,
            UnsupportedOperationException {
        int adyacente = -1;
        int vActual = 0;
        boolean existeLista = false;

        while (vActual < this.NUM_VERTICES && !existeLista) {
            if (grafo[v][vActual] == 0) {
                vActual = vActual + 1;
            } else {
                adyacente = vActual;
                existeLista = true;
            }
        }

        if (!existeLista) {
            throw new UnsupportedOperationException("No existe Lista");
        }

        return adyacente;
    }

    public int sgteAdyacente(int v, int anteriorAd)
            throws ArrayIndexOutOfBoundsException,
            UnsupportedOperationException {
        int adyacente = 0;
        int vActual = anteriorAd + 1;
        boolean existeLista = false;

        while (vActual < this.NUM_VERTICES && !existeLista) {
            if (grafo[v][vActual] == 0) {
                vActual = vActual + 1;
            } else {
                adyacente = vActual;
                existeLista = true;
            }
        }

        if (!existeLista) {
            adyacente = -1;
        }
        return adyacente;
    }
    
    public static void menuMatriz(){
		System.out.println("1. Añadir arista");
		System.out.println("2. Eliminar arista");
		System.out.println("3. Eliminar grafo");
		System.out.println("4. Mostrar grafo");
		System.out.println("5. Salir");
	}
    public static void menuListaAdy(){
		System.out.println("1. Añadir arista");
		System.out.println("2. Eliminar arista");
		System.out.println("3. Mostrar lista adyacente");
		System.out.println("4. Eliminar grafo");
		System.out.println("5. Salir");
	}
       public static void menuListaArista(){
		System.out.println("1. Añadir arista");
		System.out.println("2. Eliminar arista");
		System.out.println("3. Mostrar lista arista");
		System.out.println("4. Eliminar grafo");
		System.out.println("5. Salir");
	}
	
	public static void añadirArista(GrafoMatrizListaAdy g){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese La adyacencia entre 2 vertices");
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		System.out.println("Ingrese el peso de la arista");
		int pesoArista = in.nextInt();
		g.insertarArista(v1, v2, pesoArista);
	}
	
	public static void eliminarArista(GrafoMatrizListaAdy g){
		Scanner in = new Scanner(System.in);
		System.out.println("Elimine la adyacencia entre 2 vertices");
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		if(g.existeArista(v1, v2))g.eliminarArista(v1, v2);
		else System.out.println("Arista buscada no existe");
	}
	
	public static void eliminarGrafo(GrafoMatrizListaAdy g){
		System.out.println("Borrando grafo");
		g.liberarGrafo();
	}
	
	public static void mostrarGrafo(GrafoMatrizListaAdy g){
		g.imprimirGrafo();
	}
	
	public static void getListaAdy(GrafoMatrizListaAdy g){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserte vertice");
		int v = in.nextInt();
		if(!g.tieneAdyacentes(v)){
			System.out.println("La lista esta vacia");
		}
		else{
			int aux = g.obtenerPrimerAdy(v);
			System.out.println("Lista: ");
			while(aux != -1){
				System.out.print("=(" +aux+")=");
				aux = g.sgteAdyacente(v, aux);
			}
			System.out.println();
		}
	}
        public static void getListaAristas(GrafoMatrizListaAdy g){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserte vertice");
		int v = in.nextInt();
		if(!g.tieneAdyacentes(v)){
			System.out.println("La lista esta vacia");
		}
		else{
			int aux = g.obtenerPrimerAdy(v);
			System.out.println("Lista: ");
			while(aux != -1){
				System.out.print("=(" +(g.obtenerPrimerAdy(v)-1)+","+(aux)+")=");
				aux = g.sgteAdyacente(v, aux);
			}
			System.out.println();
		}
	}

}
