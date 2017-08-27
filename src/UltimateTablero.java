
import java.awt.Color;


public class UltimateTablero {
    
    
    public static Boolean[][] fantasma_label = new Boolean[6][6]; 
    
    public int[][] verPosiciones(int posicion1, int posicion2)
    {
        int i[][] = new int[1][4];
        int otroValor = 0, otroValor2 = 0;     
        i[0][0] = posicion1;
        i[0][1] = posicion2;
        i[0][2] = otroValor;
        i[0][3] = otroValor2;
        return i;
    }
    
    public Boolean ubicar_fantasma(int fila, int columna)
    {
        Boolean verificador = true;
        
        if(fila==0 && columna == 0 || columna == 6  || columna == 6 && fila == 0)
        {
            verificador = false;                       
        }
       
        
        return verificador;
    }    
   public static Boolean identificar_pos_disponibles(int fila, int columna)
   {
       Tablero tablero = new Tablero();
       boolean disponibilidad = false;
       
       if(fantasma_label[fila-1][columna]==false)
           tablero.arreglo_labels[fila-1][columna].setBackground(Color.red);
       /*
       if(fantasma_label[fila+1][columna]==true)
           tablero.arreglo_labels[fila+1][columna].setBackground(Color.red);
       if(fantasma_label[fila][columna+1]==true)
           tablero.arreglo_labels[fila][columna+1].setBackground(Color.red);
       if(fantasma_label[fila][columna-1]==true)
           tablero.arreglo_labels[fila][columna-1].setBackground(Color.red);
       */
       
       return disponibilidad;
       
   }
}
