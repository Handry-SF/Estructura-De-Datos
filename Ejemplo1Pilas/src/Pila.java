public class Pila {

    public int[] pila;
    public int top;
    public int tamanioPila;
    
    public Pila() {

     tamanioPila = 1;
     top = -1;
     pila = new int[tamanioPila];
     
    }
    
    public void push(int dato) {

     if (top == (tamanioPila -1))
      redimensionar();

     pila[++top] = dato;

    }
    
    public Integer pop() {

     if(top < 0)
      return null;

     return pila[top--];

    }
    
    private void redimensionar() {

     int[] temp = pila;
     tamanioPila *= 2;
     pila = new int[tamanioPila];
     
     for(int i = 0; i <= top; i++)
      pila[i] = temp[i];

    }

}