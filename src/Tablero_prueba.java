import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;




public class Tablero_prueba extends JFrame
{
    Container contenedor;
    JPanel panel;
    JLabel label[]; 
    
    Tablero_prueba()
    {
            contenedor = getContentPane();   
            panel = new JPanel();
            label = new JLabel[64];      
            
            for (int i=0; i<label.length;i++)
            {
                label[i]= new JLabel();
                panel.add(label[i] );
                contenedor.add(panel);
            }
            setVisible(true);
            setSize(400,400);
            setLocation(300,300);
    }
    
    public static void main(String[] args){
        int x = 0;
        int g = 0;
        
        try{
            int h = x/g;
            
        }catch(ArithmeticException e){
            System.out.println("Hay un error en la linea 39"+ e.toString());
            
        }
        
        
    }
}
