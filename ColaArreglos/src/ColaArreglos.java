public class ColaArreglos {
    
    //------------------------------------SERRANO FABELA HANDRY-----------------------------------------
    
        public Nodo inicio;
        public Nodo termino;
     
        public ColaArreglos() {
    
            inicio=null;
            termino=null;
    
        }
      
        public void insertar(int dato) {
    
            Nodo i=new Nodo(dato);
            i.setNext(null);
    
            if(inicio==null & termino==null) {
    
                inicio=i;
                termino=i;
            }
    
            termino.setNext(i);
            termino=termino.getNext();
    
        }
      
        public boolean estaVacia() {
    
            boolean cola=false;
    
            if(inicio==null & termino==null) {
    
                cola=true;
                System.out.println("La cola esta vacia");
            }
            else {
    
                System.out.println("La cola no esta vacia");
                cola=false;
    
            }
    
            return cola;
    
        }
      
        public int contar() {
    
            int contador=0;
            Nodo c=this.inicio;
    
            while(c!=null) {
    
                contador++;
                c=c.getNext();
    
            }
    
            System.out.println("Numero de datos en la cola: "+contador);
            return contador;
    
        }
      
        public String toString() {
    
            Nodo c=this.inicio;
            String s="";
    
            while(c!=null) {
    
                s=s+c.toString();
                c=c.getNext();
    
            }

            System.out.println("EL inicio de la cola es: "+inicio);
            System.out.println("EL fin de la cola es: "+termino);
    
            return s;
    
        } 
    
}
    