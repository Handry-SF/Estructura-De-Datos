import java.util.Scanner;

public class TareaUnidimensional {

    public static void main(String[] args) {
       
        int[] arreglo = new int[30];
        
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0; i<arreglo.length; i++){
        
            System.out.println("Ingrese un dato: "+i);
            arreglo[i] = entrada.nextInt();
            
        }
        
        for(int j=0; j<arreglo.length; j++) {

            System.out.println("arreglo["+j+"] = "+arreglo[j]);

        }
    }
}
//-------------------SERRANO FABELA HANDRY--------------------------