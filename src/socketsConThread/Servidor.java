package socketsConThread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	private final Integer  PORT = 7;
	
	public Servidor(){
		try {
			ServerSocket servidor = new ServerSocket(PORT);
			Socket cliente = null;
			while (true) {
				cliente = servidor.accept();
				
				//Cuando llega un cliente le asigno un hilo que resuelva la tarea
				Atencion obj = new Atencion(cliente);
				obj.start();
					
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class Atencion extends Thread{
		private Socket cliente;
		public Atencion (Socket cliente) {
			this.cliente = cliente;
		}
		
		@Override
		public void run() {
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				PrintWriter salida = new PrintWriter(cliente.getOutputStream(),true);

				Thread.sleep(30);
				
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
