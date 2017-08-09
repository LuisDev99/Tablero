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
    public static String sexo = "";
   
    public static ArrayList<String> printer = new ArrayList<String>();
    public static ArrayList<String> get_user_from_file = new ArrayList<String>();
    public static ArrayList<String> get_pass_from_file = new ArrayList<String>();
    String jugadores[] = {"luis", "carlos", "michael", "gerardo","HEy", "richard", "rafa", "erick", "zidane", "xuxin", "zepeda", "Piso", "TT", "Tu madre", "LKLJ"};
   
    
    public static void Crear(){

	File file = new File("testing.txt");
	ArrayList<String> list = new ArrayList<String>();
	String jugadores[] = {"luis", "carlos", "michael", "gerardo", "richard", "rafa", "erick", "zidane", "xuxin", "zepeda", "sexo"}; //10

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
      public static void CrearPassword(){

	File file = new File("contras.txt");
	ArrayList<String> list = new ArrayList<String>();
	String contras[] = {"tus", "tusn", "tusna", "tusnal", "tusnali", "tusnalit", "tusnalita", "tusnalitas","tusnalotas", "tusnalgas" }; //10
	for(int i = 0; i <contras.length; i++){
		list.add(contras[i]);
               

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
    public  Boolean tepisan(String user, String pass){
        getfile();
        //Crear();
        //CrearPassword();
        get_password();
        ArrayList <String> getalluser = new ArrayList<String>();
        ArrayList <String> getallpass = new ArrayList<String>();
        getalluser.addAll(get_user_from_file);
        getallpass.addAll(get_pass_from_file);
        
        
        
        /*  boolean usuario = false;
        boolean verificador = false;
    
        for(int i = 0; i < getalluser.size(); i++ ) //Recorre el primer arreglo (jugadores)
            
        
		{
			
			if(getalluser.get(i).equals(s) == true)//Si hay un nombre que coincide con uno del arreglo, entonces entra a este ciclo y recorre las contraseñas
			{
                                usuario = true;
				break;
			
			}
                       
                }
        
     if(usuario == true)
        verificador = true;*/
         Boolean verificador = false; 
        
        		
		Boolean usuario = false;
		Boolean contraseña = false;
		
		for(int i = 0; i < getalluser.size(); i++ ) //Recorre el primer arreglo (jugadores)
		{
			
			if(getalluser.get(i).equals(user) == true)//Si hay un nombre que coincide con uno del arreglo, entonces entra a este ciclo y recorre las contraseñas
			{
                           // ab  = jugadores[i];
				for(int j = 0; j < getallpass.size(); j++)//Recorre el segundo arreglo (contraseñas)
				{
					
						
					if(getallpass.get(j).equals(pass) == true && j == i)//Si la contraseña ingresada coincide con una de las contraseñas y esta en la misma posicion en el arreglo que la del usuario, entonces la contra es correcta
					{
						contraseña = true; 
					        break; //quebrar el loop de las contraseñas
					}
				}
			
				usuario = true;
				break; //quebrar el loop de los usuarios
			
			}
		
		}
		
		if(usuario == true && contraseña == true){ //Si el nombre y la contra estan en la misma posicion en el arreglo, entonces la cuenta si existe
			verificador = true;
                }
         
      return verificador;  
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
			//System.out.println(list.get(i).toString());
		   get_user_from_file.add(list.get(i));
		}
                
               
		
	}
        public static  void get_password(){
		
		String filename = "contras.txt";
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
			//System.out.println(list.get(i).toString());
		   get_pass_from_file.add(list.get(i));
		}
                
               
		
	}
    public static void main(String[] args)
    {
        //guardador.add("Te Piso");
   
        //printer = guardador;
        /*for(int i = 0; i <guardador.size(); i++){
          printer.add(guardador.get(i)); 
            
        }*/
        
       /* for(String g: printer){
            System.out.println(g);
        }*/
       
     
        
    
    }
    
    
}