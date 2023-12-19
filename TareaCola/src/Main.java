import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int n = 0;
        int infonodo = 0;
        Cola salicola = new Cola();

//-------------------SERRANO FABELA HANDRY--------------------------

        do {

            try {

                n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Que desea realizar: \n"+"1.Agregar Venta Total De Productos Del Dia\n"+"2.Quitar La Venta Almacenada Mas Antigua\n"+"3.Ver El Registro De Todas Las Ventas Diarias\n"+"4.Salir.\n\n"));

                switch (n) {

                    case 1:

                        infonodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos vendidos hoy: "));
                        salicola.AgregarElmento(infonodo);

                    break;

                    case 2:

                        if(!salicola.Vacia()) {

                            JOptionPane.showMessageDialog(null, "Se borro el registro para solicitar stock: "+salicola.QuitarElemento());

                        }

                    break;

                    case 3:

                        salicola.ImprimirElementos();

                    break;

                    case 4:

                        n = 4;

                    break;

                    default:

                        JOptionPane.showMessageDialog(null, "Opcion Denegada, Intentar Otra");

                  }

              } catch (NumberFormatException error){

            }

        } while(n!=4);

    }

} 