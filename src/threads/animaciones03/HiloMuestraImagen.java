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
			x = x + 1;
			if(x>9)
				x=1;
			imagen = applet.getImage(applet.getCodeBase(),"images/T"+ x +".gif");
			
			applet.repaint();
			System.out.println("Cambio de Imagen T" + x + ".gif");
			try {
				HiloMuestraImagen.sleep(500);
			} catch (Exception e) {
			}
		}
		
		
	}


}
