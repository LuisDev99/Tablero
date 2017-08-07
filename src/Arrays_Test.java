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
    public static String ab; //Esta variable guardara al primer usuario que haga login, para que no se pueda ingresar este mismo usuario como el segundo jugador que jugara la partida
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
					
						
					if(contras[j].equals(contrra) == true && j == i)//Si la contraseña ingresada coincide con una de las contraseñas y esta en la misma posicion en el arreglo que la del usuario, entonces la contra es correcta
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
    public Boolean verificar_segundo_jugador(String h){
        /*Esta funcion lo que hace es ver si la cuenta del segundo jugador esta registrada*/
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
       /*Esta funcion lo que hace es asegurarse que el segundo jugador que jugara, no sea igual al primer usuario logged in
       */
       String usuario;
       usuario = ab;
       boolean vo = true; 
       
       if(usuario.equals(j))
           vo = false;
       
       
       return vo;
   
   }
}
    
    



