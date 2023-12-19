import java.util.Scanner;

public class Fibonacci {

//Conocer la sucesion de fibonacci hasta el numero determinado

    public static void main(String[] args) {

        int numfib;
        Scanner fibon = new Scanner(System.in);

        System.out.print("Ingrese el numero hasta el que desea se haga la sucesion: ");
        numfib = fibon.nextInt();

        for (int i=0; i<=numfib; i++) {

            int numero = printSucesion(i);
            System.out.print(" " + numero);

        }
    }
//----------------------------------SERRANO FABELA HANDRY-------------------------------------
    public static int printSucesion(int n) {

        if (n==0)

            return 0;

        else if (n==1)

            return 1;

        else

            return printSucesion(n-1)+printSucesion(n-2);

    }
}