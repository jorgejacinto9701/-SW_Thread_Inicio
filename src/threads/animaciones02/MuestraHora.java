package threads.animaciones02;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class MuestraHora extends Applet {

	
	private HiloMuestraHora hilo = null;
	
	public void init(){
			setSize(400,200);
			
			hilo = new HiloMuestraHora(this);
			hilo.start();
	}
	
	
	
	public void paint(Graphics g){
		g.setFont(new Font("serif",Font.BOLD,18));
		g.drawString(hilo.getFechaHoraActual().toString(),100,100);
	}
}
