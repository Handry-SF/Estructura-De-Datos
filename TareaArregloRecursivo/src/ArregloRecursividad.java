import java.util.Scanner;

public class ArregloRecursividad {

//Llenar y recorrer un arreglo de 10 elementos, y mostrar sus elementos en pantalla de manera recursiva

    public static void main(String[] args) {

        int[] recursivo = new int[10];
        Scanner arrerecur = new Scanner(System.in);

        for(int i=0; i<recursivo.length; i++) {

            System.out.print("Ingrese un elemento: ");
            recursivo[i] = arrerecur.nextInt();

        }

        mostrarArreglo(recursivo, 0);
         
    }
//--------------------------------SERRANO FABELA HANDRY---------------------------------------
    public static void mostrarArreglo(int[] recursivo, int ind) {
         
        if(ind==(recursivo.length-1)) {

           System.out.println("El elemento es: "+recursivo[ind]);

        } else {

            System.out.println("El elemento es: "+recursivo[ind]);
            mostrarArreglo(recursivo, ind+1);

        }
    }
}