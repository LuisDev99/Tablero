
import java.awt.Color;


public class UltimateTablero {
    
    
    public Boolean[][] fantasma_label = new Boolean[6][6]; 
    
   
    
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
    public void arreglo_falsear()
    {
        Tablero tablero = new Tablero();
        for (int i = 0; i <tablero.fantasma_label.length ; i++) 
        {
            for (int j = 0; j < tablero.fantasma_label.length; j++) 
            {
                tablero.fantasma_label[i][j]=false;
            }
        }
    }
    
}
