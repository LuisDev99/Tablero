import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Arrays_Test {
    
   static ArrayList<String> myArray;
     public static String jugadores[] = {"luis", "carlos", "michael", "gerardo", "richard", "rafa", "erick", "zidane", "xuxin", "zepeda"};
    public static String contras[] = {"tus", "tusn", "tusna", "tusnal", "tusnali", "tusnalit", "tusnalita", "tusnalitas","tusnalotas", "tusnalgas" };    
public static String ab;
    public Arrays_Test() {
        
       
        this.myArray = new ArrayList<String>();
        
       
    }
    
    
    public Boolean verificador(String buscador1, String contrra){
        /*Lo que hace esta funcion es recibir dos parametros los cuales serian el nombre del usuario y la contra del form login
        y verificar si el nombre usuario y la contra son correctas, como?, pues si estan en la misma posicion en el arreglo entonces la cuenta si existe*/
        
        Boolean verificador = false; 
        
        		
		Boolean usuario = false;
		Boolean contraseña = false;
		
		for(int i = 0; i < jugadores.length; i++ ) //Recorre el primer arreglo (jugadores)
		{
			
			if(jugadores[i].equals(buscador1) == true)//Si hay un nombre que coincide con uno del arreglo, entonces entra a este ciclo y recorre las contraseñas
			{
                            ab  = jugadores[i];
				for(int j = 0; j < contras.length; j++)//Recorre el segundo arreglo (contraseñas)
				{
					
						
					if(contras[j].equals(contrra) == true && j == i)//Si encontro pues hace la variable contraseña true
					{
						contraseña = true;
					break;
					}
				}
			
				usuario = true;
				break;
			
			}
		
		}
		
		if(usuario == true && contraseña == true){ //Si el nombre y la contra estan en la misma posicion en el arreglo, entonces la cuenta si existe
			verificador = true;
                }
                    
		 return verificador;
		}
    public Boolean verificar_segundo_jugador(String h){
        boolean usuario = false;
        boolean verificador = false;
    
        for(int i = 0; i < jugadores.length; i++ ) //Recorre el primer arreglo (jugadores)
            
        
		{
			
			if(jugadores[i].equals(h) == true)//Si hay un nombre que coincide con uno del arreglo, entonces entra a este ciclo y recorre las contraseñas
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
       String usuario;
       usuario = ab;
       boolean vo = true;
       
       if(usuario.equals(j))
           vo = false;
       
       
       return vo;
   
   }
}
    
    



