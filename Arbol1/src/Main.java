public class Main {

    public static void main(String args[]) {

		Arbol arbol = new Arbol();
		int valor;

		System.out.println( "Los valores del arbol son: ");

		for (int i=1; i<=10; i++) {

			valor = (int) (Math.random() * 50);
			System.out.print(valor + " ");
			arbol.insertarNodoR(valor);

		}

		System.out.println("\n\nRecorrido PreOrden");
		arbol.llamaPreorden();

		System.out.println("\n\nRecorrido InOrden");
		arbol.llamaInorden();

		System.out.println("\n\nRecorrido PostOrden");
		arbol.llamaPostorden();

	}
    
}