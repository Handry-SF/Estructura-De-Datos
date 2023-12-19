public class Arbol {

	private Nodo raiz;

	public Arbol() {

		raiz = null;

	}

	public synchronized void insertarNodoR(int valor) {

		if(raiz == null)

			raiz = new Nodo(valor);

		else

			raiz.insertarNodo(valor);

	}

	public synchronized void llamaPreorden() {

		recorridoPreorden(raiz);
	
    }

	private void recorridoPreorden(Nodo nodo) {

		if (nodo == null)
			return;

		System.out.print(nodo.datos + " "); 
		recorridoPreorden(nodo.nodizq); 
		recorridoPreorden(nodo.nodder); 

	}

	public synchronized void llamaInorden() {

		recorridoInorden(raiz);
	
    }

	private void recorridoInorden(Nodo nodo) {

		if (nodo == null)
			return;

		recorridoInorden(nodo.nodizq);
		System.out.print(nodo.datos + " ");
		recorridoInorden(nodo.nodder);

	}

	public synchronized void llamaPostorden() {

		recorridoPostorden(raiz);

	}

	private void recorridoPostorden(Nodo nodo) {

		if (nodo == null)
			return;

		recorridoPostorden(nodo.nodizq);
		recorridoPostorden(nodo.nodder);
		System.out.print(nodo.datos + " ");

	}

}