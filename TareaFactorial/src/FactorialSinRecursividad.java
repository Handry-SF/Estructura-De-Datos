import java.util.Scanner;

public class FactorialSinRecursividad {

//Conocer el factorial de un numero de manera iterativa sin recursividad

   public static void main(String args[]) {

      int num;
      Scanner fact = new Scanner(System.in);

      System.out.print("Ingrese el numero del que desea conocer su factorial: ");
      num = fact.nextInt();

      System.out.println("El factorial es: "+sacarFactorial(num));

   } 
//-------------------------------SERRANO FABELA HANDRY-------------------------------
   public static int sacarFactorial(int num) {

      int resul = 1;
         
         while(num>0) {

            resul = resul*num;
            num--;

         }

         return resul;
         
   }

}