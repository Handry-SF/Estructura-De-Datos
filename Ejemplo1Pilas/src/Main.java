public class Main {
    
    public static void main(String[] args) {

        Pila pila = new Pila();
        
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        
    }

}