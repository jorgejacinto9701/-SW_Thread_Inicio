package socketsConThread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	private final Integer  PORT = 7;
	
	public Servidor(){
		
	}

	class Atencion extends Thread{
	
	}
	
	
	public static void main(String[] args) {
		new Servidor();
	}
	

}
