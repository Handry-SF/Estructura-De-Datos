public class TareaMemoria {

    public int preciototal; //VARIABLE DINAMICA
    public final int asientos = 60; //VARIABLE FINAL
    public static int totboletos = 48; //VARIABLE STATIC GLOBAL

    public TareaMemoria(int precioboletos) { //ESPACIO AUTOMATICO
                //VARIABLE LOCAL DE TAREAMEMORIA 
        preciototal = precioboletos*asientos/totboletos;

    }

//-------------------SERRANO FABELA HANDRY--------------------------

    public int getPreciototal() { //METODO INT GET

        return preciototal;

    }

    public static int getTotboletos() { //METODO STATIC INT

        return totboletos;

    }

    public static void main(String[] args) { //METODO STATIC VOID

        //ESTA ACCEDIENDO A VARIABLES SIN INSTANCIARLAS
        System.out.println("No. Boletos Vendidos: "+totboletos);
        //ESTA ACCEDIENDO AL METODO STATIC
        System.out.println("No. Boletos Vendidos: "+getTotboletos());

        TareaMemoria sala = new TareaMemoria(65);

        //SE TOMA EL VALOR DE LA VARIBLE ASIENTOS
        System.out.println("No. Asientos Disponibles: "+sala.asientos);
        //LLAMA AL METODO INT GET
        System.out.println("Precio Total: "+sala.getPreciototal());

    }
}