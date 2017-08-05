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
}
