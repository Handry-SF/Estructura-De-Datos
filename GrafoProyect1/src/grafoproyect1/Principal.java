package grafoproyect1;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class Principal extends GrafoMatrizListaAdy {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        GrafoMatrizListaAdy g = new GrafoMatrizListaAdy();
        int opcion;

        do {
            System.out.println("<==========MENÚ=========>");
            System.out.println("1.Crear lista de adyacencia");
            System.out.println("2.Crear matríz de adyacencia");
            System.out.println("3.Crear lista de aristas");
            System.out.println("4.Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = opc.nextInt();

            if (opcion == 1) {
                do {
                    menuListaAdy();

                    System.out.println("Ingrese una opcion");
                    Scanner in = new Scanner(System.in);
                    opcion = in.nextInt();

                    switch (opcion) {
                        case 1:
                            añadirArista(g);
                            break;
                        case 2:
                            eliminarArista(g);
                            break;
                        case 3:
                            getListaAdy(g); 
                            break;
                        case 4:
                            eliminarGrafo(g);
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("<<<<<<<<OPCION INCORRECTA>>>>>>");
                    }
                } while (opcion != 5);
       
            } else {
                if (opcion == 2) {

                    do {
                        menuMatriz();

                        System.out.println("Ingrese una opcion");
                        Scanner in = new Scanner(System.in);
                        opcion = in.nextInt();

                        switch (opcion) {
                            case 1:
                                añadirArista(g);
                                break;
                            case 2:
                                eliminarArista(g);
                                break;
                            case 3:
                                eliminarGrafo(g);
                                break;
                            case 4:
                                mostrarGrafo(g);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("<<<<<<<<OPCION INCORRECTA>>>>>>");
                        }
                    } while (opcion != 5);
                } else {
                    if (opcion == 3) {
                        do {
                    menuListaArista();

                    System.out.println("Ingrese una opcion");
                    Scanner in = new Scanner(System.in);
                    opcion = in.nextInt();

                    switch (opcion) {
                        case 1:
                            añadirArista(g);
                            break;
                        case 2:
                            eliminarArista(g);
                            break;
                        case 3:
                            getListaAristas(g); 
                            break;
                        case 4:
                            eliminarGrafo(g);
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("<<<<<<<<OPCION INCORRECTA>>>>>>");
                    }
                } while (opcion != 5);

                    } else {
                        if (opcion == 4) {
                            System.out.println("^*****GRAFO EVALUADO*****");
                        } else {

                            System.out.println("<<<<<<INGRESA UN VALOR VALIDO>>>>>>>");
                        }

                    }
                }

            }
        } while (opcion != 4);
    }
}
