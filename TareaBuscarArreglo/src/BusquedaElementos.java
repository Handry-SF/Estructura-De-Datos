import java.util.Scanner;

public class BusquedaElementos {

/*Llenar y recorrer el arreglo de 10 elementos, hacer la busqueda de un elemento para mostrar la posicion
del mismo con recursividad*/

    public static void main(String[] args) {

        int[] arregloBusqueda = new int[10];
        Scanner arrebus = new Scanner(System.in);

        for(int i=0; i<arregloBusqueda.length; i++) {

            System.out.print("Ingrese un elemento: ");
            arregloBusqueda[i] = arrebus.nextInt();

        }

        int elembus;
        Scanner elementobusq = new Scanner(System.in);
        System.out.println("Ingresa el elemento que deseas buscar: ");
        elembus = elementobusq.nextInt();

        int posicionEle = posicionRecur(arregloBusqueda, elembus,0);

        System.out.println("La posicion del elemento es: "+posicionEle);
         
    }
//------------------------------------SERRANO FABELA HANDRY--------------------------------------
    public static int posicionRecur(int[] arregloBusqueda, int elembus ,int ind) {
         
       if(ind==arregloBusqueda.length || arregloBusqueda[ind]==elembus) {
             
            if(ind==arregloBusqueda.length) {

               return -1; 

            } else {

                return ind;

            }
             
        } else {

            return posicionRecur(arregloBusqueda, elembus, ind+1);

        } 
    }
}