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
    public static int posicion_del_usuario = 0;
    public static int posicion_de_la_contra = 0;
    public static ArrayList<String> printer = new ArrayList<String>();
    public static ArrayList<String> get_user_from_file = new ArrayList<String>();
    public static ArrayList<String> limpiador = new ArrayList<String>();
    public static ArrayList<String> get_pass_from_file = new ArrayList<String>();
    public static String ab = "";
    
    public static void CrearUser(){

	File file = new File("testing.txt");
	ArrayList<String> list = new ArrayList<String>();
	String jugadores[] = {"luis", "carlos", "michael", "gerardo", "richard", "rafa", "erick", "zidane", "xuxin", "zepeda"}; //10

	for(int i = 0; i <jugadores.length; i++){
		list.add(jugadores[i]);
	}
   	 
	try{
		FileWriter fw = new FileWriter(file);
		Writer output = new BufferedWriter(fw);
		int sz = list.size();
		
		for(int i = 0; i<sz; i++){
			output.write(list.get(i));
			output.write("\n");
		}
		output.close();
		
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, "No se guardaron los datos papu");
		
	}
	
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
	
	get_password();
	
	}
    public  Boolean verificar_cuenta(String user, String pass){
        getfile();
        //CrearUser();
        //CrearPassword();
        get_password();
        ArrayList <String> getalluser = new ArrayList<String>();
        ArrayList <String> getallpass = new ArrayList<String>();
        getalluser.addAll(get_user_from_file);
        getallpass.addAll(get_pass_from_file);
        
         Boolean verificador = false; 
        
        		
		Boolean usuario = false;
		Boolean contraseña = false;
		
		for(int i = 0; i < getalluser.size(); i++ ) //Recorre el primer arreglo (jugadores)
		{
			
			if(getalluser.get(i).equals(user) == true)//Si hay un nombre que coincide con uno del arreglo, entonces entra a este ciclo y recorre las contraseñas
			{
                            posicion_del_usuario = i;
                            ab  = getalluser.get(i);
				for(int j = 0; j < getallpass.size(); j++)//Recorre el segundo arreglo (contraseñas)
				{
					
					
					if(getallpass.get(j).equals(pass) == true && j == i)//Si la contraseña ingresada coincide con una de las contraseñas y esta en la misma posicion en el arreglo que la del usuario, entonces la contra es correcta
					{
                                                posicion_de_la_contra = j;
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
        
        public void CrearJugador(String username){
  String filename = "testing.txt";
		String line;
		ArrayList<String> list = new ArrayList<String>();
		
		try{
			Writer output;
            output = new BufferedWriter(new FileWriter("testing.txt", true));
		output.write(username);
                output.write("\n");
                
			output.close();
			
		}catch(Exception e){
			System.out.println(e);
                }
            
            
            
            
            
        }
        public void CrearPassword(String password){
  String filename = "testing.txt";
		String line;
		ArrayList<String> list = new ArrayList<String>();
                
		
		try{
			Writer output;
            output = new BufferedWriter(new FileWriter("contras.txt", true));
		output.write(password);
                output.write("\n");
	        output.close();
		
		}catch(Exception e){
			System.out.println(e);
                }
            
            
            
            
            
        }
            public Boolean verificar_segundo_jugador(String h){
        /*Esta funcion lo que hace es ver si la cuenta del segundo jugador esta registrada*/
        boolean usuario = false;
        boolean verificador = false;
    
        for(int i = 0; i < get_user_from_file.size(); i++ ) //Recorre el primer arreglo (jugadores)
            
        
		{
			
			if(get_user_from_file.get(i).equals(h) == true)//Si hay un nombre que coincide con uno del arreglo, entonces entra a este ciclo y recorre las contraseñas
			{
                                usuario = true;
				break;
			
			}
                       
                }
        
     if(usuario == true)
        verificador = true;
                        
                        return verificador;
    }
             public Boolean verificador_de_segundo_usuario(String j){
       /*Esta funcion lo que hace es asegurarse que el segundo jugador que jugara, no sea igual al primer usuario logged in
       */
       String usuario;
       usuario = ab;
       boolean vo = true; 
       
       if(usuario.equals(j))
           vo = false;
       
       
       return vo;
   
   }
             
             
public void Eliminar_Usuario()
{
    	File file = new File("testing.txt");
	File file2 = new File("contras.txt");
	
	try{
		FileWriter fw = new FileWriter(file);
		Writer output = new BufferedWriter(fw);
		
		
		for(int i = 0; i<get_user_from_file.size(); i++){
			output.write(limpiador.get(i));
			output.write("\n");
		}
		output.close();
		
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, "Cuenta eliminida. ");
		
	}
        get_user_from_file.remove(posicion_del_usuario);
	
	
        	try{
		FileWriter fw = new FileWriter(file);
		Writer output = new BufferedWriter(fw);
		
		
		for(int i = 0; i<get_user_from_file.size(); i++){
			output.write(get_user_from_file.get(i));
			output.write("\n");
		}
		output.close();
		
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, "Cuenta eliminida. ");
		
        }
	
	
        try{
		FileWriter fw1 = new FileWriter(file2);
		Writer output = new BufferedWriter(fw1);
		
		
		for(int i = 0; i<get_pass_from_file.size(); i++){
			output.write(limpiador.get(i));
			output.write("\n");
		}
		output.close();
		
	}catch(Exception e){
		//JOptionPane.showMessageDialog(null, "Cuenta eliminida. ");
		
	}
    get_pass_from_file.remove(posicion_de_la_contra);
        
        try{
		FileWriter fw1 = new FileWriter(file2);
		Writer output = new BufferedWriter(fw1);
		
		
		for(int i = 0; i<get_pass_from_file.size(); i++)
                {
			output.write(get_pass_from_file.get(i));
			output.write("\n");
		}
		output.close();
		
	}catch(Exception e){
		//JOptionPane.showMessageDialog(null, "Cuenta eliminida. ");
		
	}
	
	getfile();
        
}
       
public void Cambiar_Password(String q)
{
    
    File file2 = new File("contras.txt");
   
    try{
		
		 FileWriter fw1 = new FileWriter(file2);
		Writer output = new BufferedWriter(fw1);
    
		
		for(int i = 0; i<get_pass_from_file.size(); i++){
			output.write(limpiador.get(i));
			output.write("\n");
		}
		output.close();
		
	}catch(Exception e){
		//JOptionPane.showMessageDialog(null, "Cuenta eliminida. ");
		
	}
    
    get_pass_from_file.set(posicion_de_la_contra, q);
    try{
		
		 FileWriter fw1 = new FileWriter(file2);
		Writer output = new BufferedWriter(fw1);
    
		
		for(int i = 0; i<get_pass_from_file.size(); i++)
                {
			output.write(get_pass_from_file.get(i));
			output.write("\n");
		}
		output.close();
		
	}catch(Exception e){
		//JOptionPane.showMessageDialog(null, "Cuenta eliminida. ");
		
	}
    
    getfile();
    
}
    public static void main(String[] args)
    {
       // Cambiar_Password("tepiso");
       //CrearUser();
       //CrearPassword(); 
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
