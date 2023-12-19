import java.util.Scanner;
import java.util.Stack;

public class TareaPila {

    public static void main(String[] args) {

	Scanner totpil = new Scanner(System.in);
    Scanner palabra = new Scanner(System.in);
	Stack<String> pilanum= new Stack<String>();

//-------------------SERRANO FABELA HANDRY--------------------------

    String pal;
    int pi;
	System.out.println("Cuantos datos desea ingresar a la pila: ");
	pi = totpil.nextInt();
        
        for(int i=0; i<pi; i++){
            
            System.out.println("Ingresa una letra: ");
            pal = palabra.nextLine();
	        pilanum.push(pal);

        }
        
	    System.out.println("Pila Completa...");
	    System.out.println(pilanum);

	    System.out.println("Quitando un dato...");
        pilanum.pop();	
	    System.out.println(pilanum);

	    pilanum.empty();
        System.out.println("Pila Vacia...");

    }
}