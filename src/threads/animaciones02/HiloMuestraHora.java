package threads.animaciones02;

import java.applet.Applet;
import java.util.Date;

public class HiloMuestraHora extends Thread {

	private Applet applet; 
	private Date fechaHoraActual;
	
	public  HiloMuestraHora(Applet applet){
		this.applet =applet;
	}

	public Date getFechaHoraActual() {
		return fechaHoraActual;
	}
	
	public void run(){
		
	}



}
