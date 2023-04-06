package thread.porImplementacion;

public class EjecutaHilo {

	public static void main(String[] args) {
		
		CuerpoHilo cuerpo = new CuerpoHilo();
		Thread hilo = new Thread(cuerpo);
		hilo.start();
		
	}
}
