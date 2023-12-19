import java.util.Scanner;

public class TareaBidimensional {

    public static void main(String[] args) {
       
        int arreglon[][] = new int[5][5];
        
        Scanner entradon = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){

                System.out.println("Ingresa el numero para la fila: "+i+" y la columna: "+j);
                arreglon[i][j] = entradon.nextInt();

            }
        }
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){

                System.out.print(arreglon[i][j]+" ");

            }

            System.out.println(" ");

        }
    }
}
//-------------------SERRANO FABELA HANDRY--------------------------