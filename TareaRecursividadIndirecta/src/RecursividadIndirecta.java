import java.util.Scanner;

public class RecursividadIndirecta {

//Determinar si el numero es par o impar, con recursividad

    public static void main(String args[]) {

        int num;
        Scanner numeros = new Scanner(System.in);

        System.out.print("Ingrese el numero que desea evaluar: ");
        num = numeros.nextInt();

        if(numeroPar(num)) {

            System.out.println("El numero "+num+" es par");

        } else {

            System.out.println("El numero "+num+" es impar");

        }

    }
//------------------------------------SERRANO FABELA HANDRY-------------------------------------
    public static boolean numeroPar(int num) {

        if(num==0) {

            return true;

        } else {

            return (numeroImpar(num-1));

        }

    }

    public static boolean numeroImpar(int num) {

        if(num==0) {

            return false;

        } else {

            return (numeroPar(num-1));

        }
    }
}