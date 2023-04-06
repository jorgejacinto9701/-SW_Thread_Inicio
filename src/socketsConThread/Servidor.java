package socketsConThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	private final Integer  PORT = 7;
	
	public Servidor(){
		
		Socket cliente = null;
		
		try {
			ServerSocket servidor = new ServerSocket(PORT);
			while(true){
				cliente = servidor.accept();
				
				Atencion atencion = new Atencion(cliente);
				atencion.start();
				
			}
		} catch (IOException e) {
		e.printStackTrace();
		}
	}

	// Creamos una clase interna
	
	class Atencion extends Thread{
	
		private Socket cliente;
		
		public Atencion(Socket cliente){
			this.cliente = cliente;
		}
		
		public void run(){
			 //Creamos los medios para la comunicacin
			 try {
				BufferedReader entrada =  new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				PrintWriter salida = new PrintWriter(cliente.getOutputStream(),true);

				Thread.sleep(100);
				
				String cadena = entrada.readLine();
				System.out.println(cadena);

				cliente.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Servidor();
	}
	

}
