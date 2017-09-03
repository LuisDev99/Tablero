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
    public static int posicion_del_usuario = 0; //Gaurdar la posicion del nombre del usuario del arreglo en una variable
    public static int posicion_de_la_contra = 0; //Guardar la posicion de la contraseña del mismo usuario del arreglo en una variable
    public static ArrayList<String> printer = new ArrayList<String>(); 
    public static ArrayList<String> get_user_from_file = new ArrayList<String>(); //Guardara los datos (en este caso serian los usuarios) que estan en el archivo testing en este arreglo de lista
    public static ArrayList<String> limpiador = new ArrayList<String>(); //Este array es para limpiar el archivo txt para poder hacer otras cosas como cambiar contra y eliminar usuario
    public static ArrayList<String> get_pass_from_file = new ArrayList<String>(); //Guardara los datos (en este caso serian las contraseñas) que estan en el archivo contras en este arreglo de lista
    public static ArrayList<String> temp = new ArrayList<>();
     public static ArrayList<String> temp1 = new ArrayList<>();
    public static String ab = "";
    
    public static void CrearUser(){
        /*Esta funcion lo que hace es crear un archivo de texto con el nombre testing
          y escribira usuarios ya preestablecidos para evitar crear usuarios uno por uno*/
    
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
	
	getfile(); //Se llama esta funcion para almacenar los usuarios en el arraylist dinamicamente

	}
      public static void CrearPassword(){
        /*Esta funcion lo que hace es crear un archivo de texto con el nombre contras
          y escribira contraseñas ya preestablecidos para evitar crear usuarios uno por uno*/ 
        
	File file = new File("contras.txt");
	ArrayList<String> list = new ArrayList<>();
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
			output.write("\n"); //Se hace un salto de linea para poder leer texto en forma ordenada
		}
		output.close();
		
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, "No se guardaron los datos papu");
	}
	get_password(); //Se llama esta funcion para guardar los datos en el arraylist dinamicamente
        
    }
    
      public  Boolean verificar_cuenta(String user, String pass){
        /*Lo que hace esta funcion es verificar si la cuenta esta creada
          y retornara un booleano dependiendo si el usuario existe o no*/
    
        //CrearUser();
        //CrearPassword();
        
        getfile();  //Llamar a la funcion que lee el archivo de texto en el que se encuentran los usuarios y guarda los datos de ese arhivo en el arraylist get_user_from_file
        get_password(); //Llamar a la funcion que lee el archivo de texto en el que se encuentran las contraseñas y guarda los datos de ese arhivo en el arraylist get_pass_from_file
        ArrayList <String> getalluser = new ArrayList<>();
        ArrayList <String> getallpass = new ArrayList<>();
        
        getalluser.addAll(get_user_from_file); //Esto es innecesario
        getallpass.addAll(get_pass_from_file); //Esto es innecesario
        
         Boolean verificador = false; 	
	 Boolean usuario = false;
	 Boolean contraseña = false;
		
		for(int i = 0; i < getalluser.size(); i++ ) //Recorre el primer arreglo (jugadores)
		{
			
			if(getalluser.get(i).equals(user) == true)//Si hay un nombre que coincide con uno del arreglo, entonces entra a este ciclo y recorre las contraseñas
			{
                            posicion_del_usuario = i; //Guardar la posicion en la que se encuentra este usuario dentro del array
                            ab  = getalluser.get(i); //Guardar el nombre del usuario que se encontro 
				for(int j = 0; j < getallpass.size(); j++)//Recorre el segundo arreglo (contraseñas)
				{
					
					
					if(getallpass.get(j).equals(pass) == true && j == i)//Si la contraseña ingresada coincide con una de las contraseñas y esta en la misma posicion en el arreglo que la del usuario, entonces la contra es correcta
					{
                                                posicion_de_la_contra = j;
						contraseña = true; 
					        break; //quebrar el loop que recorre las contraseñas
					}
				}
			
				usuario = true;
				break; //quebrar el loop que recorre los usuarios
			
			}
		
		}
		
		if(usuario == true && contraseña == true){ //Si el nombre y la contra estan en la misma posicion en el arreglo, entonces la cuenta si existe
			verificador = true;
                }
         
      return verificador;  
    }
	
	public static  void getfile(){
		/*Esta funcion lo que hace es leer el archivo testing.txt (es donde estan los usuarios) y los almacena en 
                  un arraylist llamado get_user_from_file para poder usar esos datos en otras funciones*/
                
		String filename = "testing.txt";
		String line;
		ArrayList<String> list = new ArrayList<String>();
		
		try{
			BufferedReader input = new BufferedReader (new FileReader (filename));
			if (!input.ready()){
				throw new IOException();
			}
			
			while((line = input.readLine()) != null){ //Lee cada linea del archivo y los almacena en un arraylist 
			list.add(line);
			
			
			}
			input.close();
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		int size = list.size();
		for(int i = 0; i<size; i++){
			//System.out.println(list.get(i).toString());
		   get_user_from_file.add(list.get(i)); //Ir almacenando todos los usuarios que se encontraron en el archivo y guardarlos en el arraylist
		}
                
               
		
	}
        public static  void get_password(){
		/*Esta funcion lo que hace es leer el archivo contras.txt (es donde estan las contraseñas de los usuarios) y los almacena en 
                  un arraylist llamado get_pass_from_file para poder usar esos datos en otras funciones*/
                
		String filename = "contras.txt";
		String line;
		ArrayList<String> list = new ArrayList<String>();
		
		try{
			BufferedReader input = new BufferedReader (new FileReader (filename));
			if (!input.ready()){
				throw new IOException();
			}
			
			while((line = input.readLine()) != null){
			list.add(line);	//Lee cada linea del archivo y los almacena en un arraylist
			}
                        
			input.close();
			
		}catch(Exception e){
			System.out.println(e);	
		}
		int size = list.size();
		for(int i = 0; i<size; i++){
			//System.out.println(list.get(i).toString());
		   get_pass_from_file.add(list.get(i)); //Ir almacenando todos las contraseñas que se encontraron en el archivo y guardarlos en el arraylist
		}
                
               
		
	}
        
        public void CrearJugador(String username){
            /*Lo que hace esta funcion es crear un usuario y añadirlo a la ultima linea del archivo testing y guardarlo */
            
            String filename = "testing.txt";
            String line;
            ArrayList<String> list = new ArrayList<String>();
		
            try{
                Writer output;
                output = new BufferedWriter(new FileWriter("testing.txt", true)); //Esto lo que hace es ir hasta la ultima linea del archivo
                output.write(username);
                output.write("\n");
                output.close();
			
            }catch(Exception e){
                System.out.println(e);
            } 
            
        }
        public void CrearPassword(String password){
             /*Lo que hace esta funcion es crear una contraseña y añadirlo a la ultima linea del archivo contras y guardarlo */
             
            String filename = "testing.txt";
            String line;
            ArrayList<String> list = new ArrayList<String>();
                
		
            try{
                Writer output;
                output = new BufferedWriter(new FileWriter("contras.txt", true)); //Esto lo que hace es ir hasta la ultima linea del arhivo
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
    
        for(int i = 0; i < get_user_from_file.size(); i++ ) //Recorre el arraylist en donde estan los usuarios
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
        y lo que esta recibiendo de parametro es el nombre del usuario del segundo jugador*/
       
       String usuario;
       usuario = ab;
       boolean vo = true; 
       
       if(usuario.equals(j))
           vo = false;
       
       
       return vo;
   
   }
             
             
public void Eliminar_Usuario()
{
    get_user_from_file.clear();
    get_pass_from_file.clear();
    getfile();
    get_password();
    
    File file = new File("testing.txt");
    File file2 = new File("contras.txt");
     
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
	
    get_pass_from_file.remove(posicion_de_la_contra);
        
        try{
		FileWriter fw1 = new FileWriter(file2);
		Writer output = new BufferedWriter(fw1);
		
		
		for(int i = 0; i< get_pass_from_file.size(); i++)
                {
			output.write( get_pass_from_file.get(i));
			output.write("\n");
		}
		output.close();
		
	}catch(Exception e){
		//JOptionPane.showMessageDialog(null, "Cuenta eliminida. ");
		
	}
        get_user_from_file.clear(); //Lo que hace es limpiar los datos que estan en este arreglo porque si no se sobreescribira
        get_pass_from_file.clear();
       
        //get_user_from_file.removeAll(get_user_from_file);
	getfile();
        get_password();
        
        
}
       
public void Cambiar_Password(String q)
{

    get_pass_from_file.clear();
    get_password();
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
		//
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
    get_pass_from_file.clear();
    get_password();
    
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
