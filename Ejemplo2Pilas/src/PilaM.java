import java.util.Stack;

public class PilaM {

    public static void main(String[] args) {
   
        Stack pila = new Stack();

        for(int x=5; x<=10; x++) {

            pila.push(Integer.toString(x));

            while(!pila.empty()) {

                System.out.println(pila.pop());

            }
        }
    }
}