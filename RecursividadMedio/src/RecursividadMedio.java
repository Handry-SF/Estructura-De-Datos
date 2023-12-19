public class RecursividadMedio {

//SERRANO FABELA HANDRY

    public static void main(String[] args) {

        String pal = "tangamandapio";

        if(ordenAlfabetico(pal)) 
	        System.out.println("La palabra está ordenada alfabéticamente");

        else 
	        System.out.println("La palabra NO está ordenada alfabéticamente");

    }

    public static boolean ordenAlfabetico(String rev) {

        rev = rev.toLowerCase();

        if(rev.length()>1) {

            if(rev.charAt(0)<=rev.charAt(1))
        	    return ordenAlfabetico(rev.substring(1, rev.length()));

        else 
		    return false;

    }

    else 
	    return true;

    }

}