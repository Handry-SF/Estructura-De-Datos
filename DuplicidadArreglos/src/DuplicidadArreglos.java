import java.util.Scanner;

/*Determinar si existe duplicidad en los datos asignados por el usuario en teclado a los arreglos de 6 elementos, 
mostrando en pantalla todos los elementos que tienen ambos arreglos asi como el resultado de la existencia o no de 
duplicidad en los arreglos.*/ 

//-------------------------------------------SERRANO FABELA HANDRY------------------------------------------------

public class DuplicidadArreglos {

    public static void  main(String[] args) {

        int[] arre1 = new int[6];
        int[] arre2 = new int[6];
        Scanner busq1 = new Scanner(System.in);
        Scanner busq2 = new Scanner(System.in);

        for(int i=0; i<arre1.length; i++) {

            System.out.print("Ingrese un elemento para el arreglo 1: ");
            arre1[i] = busq1.nextInt();

        }

        for(int i=0; i<arre2.length; i++) {

            System.out.print("Ingrese un elemento para el arreglo 2: ");
            arre2[i] = busq2.nextInt();

        }

        System.out.println("Datos del arreglo 1: ");
        for(int i=0; i<arre1.length; i++) {

            System.out.println(arre1[i]);

        }

        System.out.println("Datos del arreglo 2: ");
        for(int i=0; i<arre2.length; i++) {

            System.out.println(arre2[i]);

        }

        if(arre1.length==arre2.length) {

            System.out.println(arreglosIguales(arre1, arre2, 0));

        } else {

            System.out.println(false);

        }

    }

    public static boolean arreglosIguales(int[] arre1, int[] arre2, int ind) {

        if(ind==arre1.length) {

            System.out.println("EXISTE DUPLICIDAD DE DATOS");
            return true;

        } else if(arre1[ind]!=arre2[ind]) {

            System.out.println("NO EXISTE DUPLICIDAD DE DATOS");
            return false;

        } else {

            return arreglosIguales(arre1, arre2, ind+1);

        }

    }

}