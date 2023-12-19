public class Nodo {

	Nodo nodizq;
	int datos;
	Nodo nodder;

	public Nodo(int datosN) {

		datos = datosN;
		nodizq = nodder = null;

	}

	public synchronized void insertarNodo(int valor) {
	
		if (valor < datos) {

			if (nodizq == null)

				nodizq = new Nodo(valor);

			else	
                
                nodizq.insertarNodo(valor);

		}

		else if(valor > datos) {

		if (nodder == null)

			nodder = new Nodo(valor);

		else

			nodder.insertarNodo(valor);

		}

	}

}