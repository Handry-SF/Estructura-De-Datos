import java.util.Scanner;

public class Factorial {

//Conseguir el factorial de un numero mediante la recursividad

    public static void main(String[] args) {
     
        Scanner facto = new Scanner(System.in);

        System.out.print("Ingrese el numero que desea obtener el factorial: ");
        int numfac = facto.nextInt();
         
        System.out.println("El factorial de es: " + factorialRecursividad(numfac));

    }
//-----------------------------------SERRANO FABELA HANDRY----------------------------------------
    public static int factorialRecursividad(int numfac) {

        if(numfac==0) {

            return 1;

        } else {

            return numfac*factorialRecursividad(numfac-1);

        }
    }
}