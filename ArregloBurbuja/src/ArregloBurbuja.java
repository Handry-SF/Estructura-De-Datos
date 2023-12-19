import java.util.Scanner;

public class ArregloBurbuja {

	public static int[] burbuja(int[] arreglo) {
      
		int auxiliar;
      	int[] arregloOrdenado;
      
		for(int i = 1; i < arreglo.length; i++) {

        	for(int j = 0;j < arreglo.length-i;j++) {

          		if(arreglo[j] > arreglo[j+1]) {

            		auxiliar = arreglo[j];
            		arreglo[j] = arreglo[j+1];
            		arreglo[j+1] = auxiliar;

          		}   
        
			}

      	}

      	arregloOrdenado = arreglo;
      	return arregloOrdenado;

    }

	public static void main(String[] args) {
       
        int[] arreglo = new int[6];
        Scanner entrada = new Scanner(System.in);
        
            for(int i=0; i<arreglo.length; i++) {
        
            	System.out.println("Ingrese un dato: "+i);
            	arreglo[i] = entrada.nextInt();
            
        	}
        
            System.out.println("ARREGLO DESORDENADO");
        	for(int j=0; j<arreglo.length; j++) {

            	System.out.println("arreglo["+j+"] = "+arreglo[j]);

        	}
        
        int arregloOrdenado[] = burbuja(arreglo);
 
            System.out.println("ARREGLO ORDENADO");
            for(int i = 0; i < arregloOrdenado.length;i++)
              System.out.println("arreglo["+i+"] = "+arregloOrdenado[i]);

    }

}