import java.util.Stack;
//-----------------------------------------SERRANO FABELA HANDRY--------------------------------------
public class MainPila {
    
    public static void main(String[] args) {
        
        Pila p1 = new Pila(5, 10, 15);
        Stack <Integer> pila1 = new Stack<>();
        
        pila1.push(p1.getNumero1());
        pila1.push(p1.getNumero2());
        pila1.push(p1.getNumero3());

        System.out.println(pila1);

    }

}
