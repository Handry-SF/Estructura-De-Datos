import java.util.Scanner;

public class TareaBidimensional3 {

    public static void main(String[] args) {
       
        int Hola[][] = new int[10][15];
        
        Scanner entradin = new Scanner(System.in);
        
        for(int i=0; i<10; i++){
            for(int j=0; j<15; j++){

                System.out.println("Ingresa el numero para la fila: "+i+" y la columna: "+j);
                Hola[i][j] = entradin.nextInt();

            }
        }
        
        for(int i=0; i<10; i++){
            for(int j=0; j<15; j++){

                System.out.print(Hola[i][j]+" ");

            }

            System.out.println(" ");

        }
    }
}
//-------------------SERRANO FABELA HANDRY--------------------------