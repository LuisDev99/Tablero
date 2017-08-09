import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class UltimateClass {
   
    public static ArrayList<String> printer = new ArrayList<String>();
    public static ArrayList<String> guardador = new ArrayList<String>();
    public static void Crear(){
		
		
		File file = new File("testing.txt");
	ArrayList<String> list = new ArrayList<String>();
	String jugadores[] = {"luis", "carlos", "michael", "gerardo","HEy", "richard", "rafa", "erick", "zidane", "xuxin", "zepeda", "Piso", "TT", "Tu madre", "LKLJ"};
	for(int i = 0; i <jugadores.length; i++){
		list.add(jugadores[i]);
               

	}
   	 
	try{
		FileWriter fw = new FileWriter(file);
		Writer output = new BufferedWriter(fw);
		int sz = list.size();
		
		for(int i = 0; i<sz; i++){
			output.write(list.get(i).toString());
			output.write("\n");
		}
		output.close();
		
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, "No se guardaron los datos papu");
		
	}
	
	System.out.println("Hi xd");
	getfile();
	
	}
    public void tepisan(String s){
        
        System.out.println("");
        
        
        
        
    }
	
	public static  void getfile(){
		
		String filename = "testing.txt";
		String line;
		ArrayList<String> list = new ArrayList<String>();
		
		try{
			BufferedReader input = new BufferedReader (new FileReader (filename));
			if (!input.ready()){
				throw new IOException();
			}
			
			while((line = input.readLine()) != null){
			list.add(line);
			
			
			}
			input.close();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		int size = list.size();
		for(int i = 0; i<size; i++){
			System.out.println(list.get(i).toString());
		   guardador.add(list.get(i).toString());
		}
		
	}
    public static void main(String[] args)
    {
        //guardador.add("Te Piso");
        getfile();
        Crear();
        printer = guardador;
        /*for(int i = 0; i <guardador.size(); i++){
          printer.add(guardador.get(i)); 
            
        }*/
        
        for(String g: printer){
            System.out.println(g);
        }
       
        
        
    
    }
    
    
}