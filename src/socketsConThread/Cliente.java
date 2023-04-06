package socketsConThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	private final Integer PORT =7;
	private final String IP ="localhost";
	
	public Cliente(Integer numero){
		
		try {
			Socket cliente = new Socket(IP,PORT);

			 //Creamos los medios para la comunicacin
			 BufferedReader entrada =  new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			 PrintWriter salida = new PrintWriter(cliente.getOutputStream(),true);
			 
			 salida.println("HOLA SOY EL CLIENTE" + numero);
			 
			 
			 cliente.close();
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Long tiempoAntes = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			new Cliente(i);
		}
		
		Long tiempoDespues = System.currentTimeMillis();
		System.out.println("SE DEMORO >> " + (tiempoDespues - tiempoAntes));
	}
}
