import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.UnsupportedOperationException;
import java.lang.RuntimeException;

public class Grafo {
	private final int MAX_VERTICES;
	private final int MAX_ARISTAS;
	private int nroAristas;
	private int grafo[][];
	
	public Grafo(int nroVertices, int  nroAristas){
		MAX_VERTICES = nroVertices;
		MAX_ARISTAS = nroAristas;
		
		this.nroAristas = 0;
		
		grafo = new int[MAX_VERTICES][MAX_VERTICES];
		
		for(int i = 0; i < getMAX_VERTICES();i++){
			for (int j = 0; j < getMAX_VERTICES(); j++){
				grafo[i][j] = 0;
			}
		}
	}
	
	public Grafo(int nroVertices){
		
		this(nroVertices, nroVertices);
	}
	
	public Grafo(){
		
		this(6,6);
	}

	public int getMAX_VERTICES()
	{
		return MAX_VERTICES;
	}

	public int getMAX_ARISTAS()
	{
		return MAX_ARISTAS;
	}
	
	public void insertaArista(int v1, int v2)
				throws ArrayIndexOutOfBoundsException, UnsupportedOperationException
	{
		if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
			throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
					"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
		}
		else if(nroAristas == MAX_ARISTAS){
			throw new UnsupportedOperationException("No se puede añadir más aristas");
		}		
		else{
			grafo[v1][v2] = 1;
		}
	}
	
	public boolean existeArista(int v1, int v2){
		if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
			throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
					"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
		}
		else if(grafo[v1][v2] == 1){
			return true;
		}		
		return false;
	}

	public void eliminaArista(int v1, int v2){
		if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
			throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
					"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
		}
		else if(grafo[v1][v2] == 0){
			System.err.println("La arista NO existe");
		}
		else{
			grafo[v1][v2] = 0;
		}
	}
	
	public void liberaGrafo(){
		for(int i = 0; i < grafo.length; i++){
			for(int j = 0; j < grafo[i].length; j++){
				grafo[i][j] = 0;
			}
		}
	}
	
	public void mostrarGrafo(){
		System.out.print(" ");
		for(int i = 0; i < MAX_VERTICES; i++)
		{
			System.out.printf("  %3d", i);
		}
		System.out.println();
		for( int i = 0; i < MAX_VERTICES; i++){
			System.out.printf(" %3d", i);
			for(int j = 0; j < MAX_VERTICES; j++){
				System.out.printf(" %3d" ,grafo[i][j]);
			}
			System.out.println();
		}
	}
	
	public boolean ListaAdyVacia(int v)
	{
		int aux  = 0;
		boolean listaVacia = true;
		
		while(aux < MAX_VERTICES && listaVacia){
			if(grafo[v][aux] == 1){
				listaVacia = false;
			}
			else{
				aux = aux + 1;
			}
		}
		
		return listaVacia;
	}
	
	public int primeroListaAdy(int v)
			   throws RuntimeException
	{
		int aux = 0;
		boolean listaVacia = true;
		
		while(aux < MAX_VERTICES && listaVacia){
			if(grafo[v][aux] == 1)
			{
				listaVacia = false;
			}
			else
			{
				aux = aux + 1;
			}
		}
		
		if(aux == MAX_VERTICES) throw new RuntimeException("La lista de Adyacencia esta vacía");
		return aux;
	}
	
	public int proxAdy(int v, int ady){
		int prox = ady + 1;
		while(prox < MAX_VERTICES && grafo[v][prox] == 0){
			prox = prox + 1;
		}
		if(prox == MAX_VERTICES)return -1;
		return prox;
	}	
	
}