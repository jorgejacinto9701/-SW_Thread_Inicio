package threads.animaciones03;

import java.applet.Applet;
import java.awt.Image;

public class HiloMuestraImagen extends Thread {

	private Applet applet; 
	private Image imagen;
	private Integer x = 0;
	
	public Image getImagen() {
		return imagen;
	}
	
	public  HiloMuestraImagen(Applet applet){
		this.applet =applet;
		
	}
	
	public void run(){
		while(true){
			
		}
		
		
	}


}
