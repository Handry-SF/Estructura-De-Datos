import java.util.Scanner;

public class TareaMultidimensional {

    public static void main(String[] args) {

	Scanner llenando = new Scanner(System.in);
	Scanner ancho = new Scanner(System.in);
	Scanner altura = new Scanner(System.in);
	Scanner profundidad = new Scanner(System.in);

//-------------------SERRANO FABELA HANDRY--------------------------

    int an;
	System.out.println("Cuanto sera de ancho: ");
	an = ancho.nextInt();
	int al;
	System.out.println("Cuanto sera de altura: ");
	al = altura.nextInt();
	int pr;
	System.out.println("Cuanto sera de profundidad: ");
	pr = profundidad.nextInt();
   
    int multiarray[][][] = new int[an][al][pr];
        
        for(int i=0; i<an; i++){
            for(int j=0; j<al; j++){
		        for(int h=0; h<pr; h++){

                    System.out.println("Ingresa el numero para la posicion [" + i + "] [" + j + "] [" + h + "]");
                	multiarray[i][j][h] = llenando.nextInt();

		        }
            }
        }
        
	    for(int i=0; i<an; i++){
            for(int j=0; j<al; j++){
		        for(int h=0; h<pr; h++){

			        System.out.print(multiarray[i][j][h]);

		        }

		        System.out.print("      ");

            }

		    System.out.println("      ");

        }        
    }
}