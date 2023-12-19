public class RecursividadCabeza {

//SERRANO FABELA HANDRY

    public static void main(String[] args) {

        int num = 15;
        vernum(num);

    }

    public static void vernum(int num) {
    
        if(num>0) {

            System.out.print(num+"-");
            vernum(num-1);

        }

        else

            System.out.println();

    }

}