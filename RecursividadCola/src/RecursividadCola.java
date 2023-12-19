public class RecursividadCola {

//SERRANO FABELA HANDRY
    public static void main(String[] args) {

        int b = 3;
        int e = 3;
        System.out.println(b+" elevado a "+e+" = "+potenciaNumero(b, e));

    }

    public static int potenciaNumero(int b, int e) {

        if(e==0) 
	        return 1;
 
        else if(e==1) 
	        return b;

        else 
	        return b*potenciaNumero(b,e-1);

    }

}