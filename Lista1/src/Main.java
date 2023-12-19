public class Main {

    public static void main(String[] args) throws Exception {

        Lista lista = new Lista();
        System.out.println("----LISTA----\n");
        
        //Agrega Por El Final De La Lista
        lista.agregarAlFinal(12);
        lista.agregarAlFinal(15);
        lista.agregarAlFinal(9);

        //Agrega Por Al Inicio De La Lista
        lista.agregarAlInicio(41);
        lista.agregarAlInicio(6);
        
        System.out.println("----Datos----");
        lista.listar();
        
        System.out.println("\n\n----Tamaño----");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n----Obtener el dato del nodo 3----");
        System.out.println(lista.getValor(3));
        
        System.out.println("\n----Insertar el dato 16 despues del 15----");
        lista.insertarPorReferencia(15, 16);

        lista.listar();

        System.out.println("\n\n----Tamaño----");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n\n----Inserta el dato 44 en la posición del nodo 3----");
        lista.insrtarPorPosicion(3, 44);

        lista.listar();

        System.out.println("\n\n----Tamaño----");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n----Cambia el dato 12 del nodo posición 3 por 13----");
        lista.editarPorReferencia(12, 13);

        lista.listar();

        System.out.println("\n\n----Tamaño----");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n----Cambia el dato en el nodo posición 0 por 17----");
        lista.editarPorPosicion(0, 17);

        lista.listar();

        System.out.println("\n\n----Tamaño----");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n----Elimina el nodo con el dato 41----");
        lista.removerPorReferencia(41);        

        lista.listar();

        System.out.println("\n\n----Tamaño----");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n----Elimina el nodo en la posición 4----");
        lista.removerPorPosicion(4);        

        lista.listar();

        System.out.println("\n\n----Tamaño----");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n----Verificar si el dato 30 existe----");
        System.out.println(lista.buscar(30));
        
        System.out.println("\n----Verificar la posición del dato 9----");
        System.out.println(lista.getPosicion(9));
        
        System.out.println("\n----Eliminar la lista----");
        lista.eliminar();
        
        System.out.println("\n----Verificar si la lista esta vacia----");
        System.out.println(lista.esVacia());
        
        System.out.println("\n\n----FINAL LISTA----");

    }   

}