import java.util.Scanner;

public class TareaBidimensional2 {

    public static void main(String[] args) {

	Scanner llenado = new Scanner(System.in);
	Scanner fila = new Scanner(System.in);
	Scanner columna = new Scanner(System.in);

//-------------------SERRANO FABELA HANDRY--------------------------

    int f;
	System.out.println("Cuantas filas desea tener: ");
	f = fila.nextInt();
    int c;
	System.out.println("Cuantas columnas desea tener: ");
	c = columna.nextInt();
   
        int array[][] = new int[f][c];
        
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){

                System.out.println("Ingresa el numero para la fila: "+i+" y la columna: "+j);
                array[i][j] = llenado.nextInt();

            }
        }
        
        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){

                System.out.print(array[i][j]+" ");

            }

            System.out.println(" ");

        }
    }
}