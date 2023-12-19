public class CalculoDeterminantes {
 
    int [][] nuevaMatriz(int [][] matriz, int ind) {

        int size = matriz.length-1;
        int cont = 0;
        int [][] nuemat = new int [size][size];

        for(int i=1; i<matriz.length; i++) {

            for(int j=0; i<matriz.length; i++) {

                if(j!=ind) {

                    nuemat[i-1][cont] = matriz[i][j];
                    cont++;

                }

            }

        } return nuemat;

    }

    int determinantesMatrices(int [][] matriz) {

        if((matriz.length==1) && (matriz[0].length==1)) {

            return matriz [0][0];

        } else {

            int cont = 0;

            for(int i=0; i<matriz.length; i++) {

                if(i%2==0) {

                    cont = cont+matriz[0][i]*determinantesMatrices(nuevaMatriz(matriz, i));

                } else {

                    cont = cont-matriz[0][i]*determinantesMatrices(nuevaMatriz(matriz, i));

                }

            } return cont;

        }

    }

}