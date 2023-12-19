import java.util.Scanner;

public class SumaNumeros {

    //Sumar todos los numeros hasta el dado por el usuario y mostrar el resultado.

    public static void main(String[] args) {
         
        int n1;
        Scanner numnat = new Scanner(System.in);

        System.out.print("Ingrese el numero hasta el que desea realizar la suma: ");
        n1 = numnat.nextInt();

        int resul = sumasRecursividad(n1);
        System.out.println("El resultado de sumar todos los numeros hasta el asignado es: "+resul);
         
    }
//----------------------------------------SERRANO FABELA HANDRY---------------------------------------
    public static int sumasRecursividad(int num) {
         
        int rec;
         
        if(num==1) {

            return 1;

        } else {

            rec = num+sumasRecursividad(num-1);

        }
         
        return rec;

    }
}