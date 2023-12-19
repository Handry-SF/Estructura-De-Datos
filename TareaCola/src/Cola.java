import javax.swing.*;

public class Cola {

    public Nodo ini, fin;
    public String salicola = "";

    public Cola() {

        ini = null;
        fin = null;

    }

    public boolean Vacia() {

        if (ini==null) {

            return true;

        } else {

            return false;

        }
    }

    public void AgregarElmento(int info) {

        Nodo otronodo = new Nodo();
        otronodo.info = info;
        otronodo.next = null;

        if (Vacia()) {

            ini = otronodo;
            fin = otronodo;

        } else {

            fin.next = otronodo;
            fin = otronodo;

        }
    }

    public int QuitarElemento(){

        if (!Vacia()) {
            int info = ini.info;

            if (ini==fin) {

                ini = null;
                fin = null;

            } else {

                ini = ini.next;

            }

            return info;

        } else {

            return Integer.MAX_VALUE;

        }
    }

    public void ImprimirElementos(){

        Nodo recorre = ini;
        String invertir = "";

        while(recorre!=null){

            salicola += recorre.info + " ";
            recorre = recorre.next;

        }

        String datos [] = salicola.split(" ");


        for (int i=datos.length-1; i>= 0; i--) {

            invertir += " " +datos[i];

        }

        JOptionPane.showMessageDialog(null, invertir);
        salicola = "";

    }
}