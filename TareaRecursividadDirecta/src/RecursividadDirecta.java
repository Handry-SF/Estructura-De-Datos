import java.util.Scanner;

public class RecursividadDirecta {

//Conseguir la cantidad de numeros impares que el usuario pida

    public static void main(String[] args) {

        int num;
        Scanner recdic = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de terminos impares que desea obtener: ");
        num = recdic.nextInt();

        serieImpares(1,num);

    }
//-----------------------------------SERRANO FABELA HANDRY----------------------------------
    public static void serieImpares(int a, int num) {

        if(num>0) {

            System.out.print(a*2-1+" ");
            serieImpares(a+1, num-1);

        }
    }

}