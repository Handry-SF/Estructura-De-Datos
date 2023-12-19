import java.util.Scanner;

/*Sumar todos los elementos ingresados por el usuario que se encuentren en las matrices de 3x3, mostrando
en pantalla todos los elementos que tienen ambas matrices asi como el resultado de la suma.*/ 

//-------------------------------------------SERRANO FABELA HANDRY------------------------------------------------

public class SumaMatrices {

    public static void main(String[] args) {

        int [][] numsuma1 = new int[3][3];
        int [][] numsuma2 = new int[3][3];

        Scanner datos1 = new Scanner(System.in);
        Scanner datos2 = new Scanner(System.in);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){

                System.out.println("Ingrese un elemento para la matriz 1: ");
                numsuma1[i][j] = datos1.nextInt();
                System.out.println("Ingrese un elemento para la matriz 2: ");
                numsuma2[i][j] = datos2.nextInt();

            }
        }

        System.out.println();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){

                System.out.print("Elemento de la matriz 1: ");
                System.out.print(numsuma1[i][j]+"\t");
                System.out.println();

            }
        }

        System.out.println();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){

                System.out.print("Elemento de la matriz 2: ");
                System.out.print(numsuma2[i][j]+"\t");
                System.out.println();

            }
        }

        System.out.println();
        System.out.print("El resultado de la suma de todos los datos es: "+sumaRecursiva(numsuma1, numsuma2, 2, 2));

    }

    public static int sumaRecursiva(int[][] numsuma1, int[][] numsuma2, int fil, int col) {

        if((fil==0) && (col==0))

            return numsuma1[fil][col] + numsuma2[fil][col];

        else {

            if(fil>-1) {

                col--;

            if(col>=-1) 

                return numsuma1[fil][col+1] + numsuma2[fil][col+1] + sumaRecursiva(numsuma1, numsuma2, fil, col);

            else

                return sumaRecursiva(numsuma1, numsuma2, fil-1, 2);

            }

            else return 0;

        }
    }
}