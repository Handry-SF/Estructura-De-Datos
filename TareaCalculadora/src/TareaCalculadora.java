import java.util.Scanner;

public class TareaCalculadora {

    public static void main(String[] args) {

        int num1;
        int num2;
        int n;
        int resul;

        Scanner numero = new Scanner(System.in);

        System.out.println("Que operacion deseas realizar: 1.Suma 2.Resta 3.Multiplica 4.Divide");
        n = numero.nextInt();

//-------------------SERRANO FABELA HANDRY--------------------------

        switch(n) {

            case 1:

                System.out.println("Ingrese un numero: ");
                num1 = numero.nextInt();
                System.out.println("Ingrese otro numero: ");
                num2 = numero.nextInt();

                resul = num1 + num2;
                System.out.println("El resultado es: "+resul);

            break;

            case 2:

                System.out.println("Ingrese un numero: ");
                num1 = numero.nextInt();
                System.out.println("Ingrese otro numero: ");
                num2 = numero.nextInt();

                resul = num1 - num2;
                System.out.println("El resultado es: "+resul);

            break;

            case 3:

                System.out.println("Ingrese un numero: ");
                num1 = numero.nextInt();
                System.out.println("Ingrese otro numero: ");
                num2 = numero.nextInt();

                resul = num1 * num2;
                System.out.println("El resultado es: "+resul);

            break;

            case 4:

                System.out.println("Ingrese un numero: ");
                num1 = numero.nextInt();
                System.out.println("Ingrese otro numero: ");
                num2 = numero.nextInt();

                resul = num1 / num2;
                System.out.println("El resultado es: "+resul);

            break;

            default: 

                System.out.println("Se selecciona una opcion invalida");

        }
    }
}