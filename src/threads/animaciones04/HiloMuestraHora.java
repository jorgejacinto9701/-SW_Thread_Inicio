package threads.animaciones04;

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
		while(true){
			fechaHoraActual = new Date();
			applet.repaint();
			System.out.println("Se crea nueva Hora" + fechaHoraActual);
			try {
				HiloMuestraHora.sleep(500);
			} catch (Exception e) {
			}
		}
	}



}
