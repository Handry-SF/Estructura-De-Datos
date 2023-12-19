import java.util.Scanner;

/*Calcular el deteminante de una matriz cuadrada con las dimensiones de 5x5 obteniendo los datos de la misma
mediante su entrada en teclado por el usurario, mostrando en pantalla todos los elementos que tiene la matriz asi 
como el resultado de su determinante correspondiente.*/ 

//-------------------------------------------SERRANO FABELA HANDRY------------------------------------------------

public class Determinantes {

    public static void main(String[] args) {

        int [][] matdet = new int[5][5];

        Scanner dat1 = new Scanner(System.in);

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){

                System.out.println("Ingrese un elemento para la matriz: ");
                matdet[i][j] = dat1.nextInt();

            }
        }

        System.out.println();

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){

                System.out.print("Elemento de la matriz: ");
                System.out.print(matdet[i][j]+"\t");
                System.out.println();

            }
        }

        CalculoDeterminantes calcular = new CalculoDeterminantes();
        int determin = calcular.determinantesMatrices(matdet);
        System.out.println("El determinante de la matriz es: "+determin);

    }

}