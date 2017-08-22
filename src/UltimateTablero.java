/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class UltimateTablero {
    
    
    public int[][] verPosiciones(int posicion1, int posicion2){
        int i[][] = new int[1][4];
        int otroValor = 0, otroValor2 = 0;
        
        
        
        
        
        i[0][0] = posicion1;
        i[0][1] = posicion2;
        i[0][2] = otroValor;
        i[0][3] = otroValor2;
                
        
        
        return i;
    }
    
    public Boolean ubicar_fantasma(int fila, int columna){
        Boolean verificador = false;
        
        if(fila>=1 && fila<=4 && columna >= 1 && columna <= 4){
            verificador = false;
        }
       
        return verificador;
    }    
   
}
