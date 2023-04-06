package socketsConPoolThread;

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
			Pool pool = new Pool(10);
			while (true) {
				cliente = servidor.accept();
				//AL llegar el cliente se crea un cuerpo de Hilo (Tarea)
				Tarea tarea = new Tarea(cliente);
				//La tarea se le asigna al pool de hilos
				pool.run(tarea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	class Tarea implements Runnable{
		private Socket cliente;
		public Tarea(Socket cliente) {
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
