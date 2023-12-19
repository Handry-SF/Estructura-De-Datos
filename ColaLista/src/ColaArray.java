import javax.swing.JOptionPane;

public class ColaArray {

    private int MAX;
    private int[] COLA;
    private int FRENTE;
    private int FINAL;

    public ColaArray()
    {
        this.MAX = 100;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new int[this.MAX+1];
    }

    public ColaArray(int MAX)
    {
        this.MAX = MAX;
        this.FRENTE = 0;
        this.FINAL = 0;  
        this.COLA = new int[this.MAX+1];
    }  
    
    public boolean IsColaLlena()
    {
        if(this.FINAL == this.MAX)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean IsColaVacia()
    {
        if(this.FRENTE == this.FINAL)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void InsertarCola()
    {
        if(this.IsColaLlena())
        {
            JOptionPane.showMessageDialog(null,"LA COLA ESTÁ LLENA");
        }
        else
        {
            int ITEM;

            ITEM = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL ITEM A AGREGAR"));  
            
            this.FINAL++; 
            this.COLA[FINAL] = ITEM;
                       
        }
    }

    public void EliminarCola()
    {
        if(this.FRENTE == this.FINAL)
        {
            JOptionPane.showMessageDialog(null,"LA COLA ESTA VACIA");
        }
        else
        {            
            for(int i=FRENTE;i < FINAL - 1;i++)
            {
                COLA[i] = COLA[i+1];
            }
            
            FINAL--;
        }
    }

    public void MostrarCola() {

        if(this.IsColaVacia())
        {
            JOptionPane.showMessageDialog(null,"LA COLA ESTÁ VACIA\n NO HAY DATOS QUE MOSTRAR","MOSTRAR DATOS",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            String MOSTRAR = "";
            
            for(int i=FRENTE+1;i<=FINAL;i++)
            {
                MOSTRAR = MOSTRAR + COLA[i]+"\n";
            }

            JOptionPane.showMessageDialog(null,"EL INICIO DE LA COLA ES: "+this.COLA[FRENTE]+"\n"+"EL FINAL DE LA COLA ES: \n"+this.COLA[FINAL],"MOSTRAR DATOS DE INICIO Y FIN",JOptionPane.INFORMATION_MESSAGE);
            
            JOptionPane.showMessageDialog(null,"TOTAL ES : "+this.FINAL+"\n"+"LOS DATOS DE LA COLA SON : \n"+MOSTRAR,"MOSTRAR DATOS",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void VaciarCola()
    {
        FRENTE = 0;
        FINAL = 0;
    }       
}