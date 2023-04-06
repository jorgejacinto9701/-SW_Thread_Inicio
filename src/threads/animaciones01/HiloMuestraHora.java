package threads.animaciones01;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class HiloMuestraHora extends Thread {

	private JLabel lblHora; 
	private Date fechaHoraActual;
	
	public  HiloMuestraHora(JLabel lblHora){
		this.lblHora =lblHora;
	}

	public Date getFechaHoraActual() {
		return fechaHoraActual;
	}
	
	public void run(){

		
	}



}
