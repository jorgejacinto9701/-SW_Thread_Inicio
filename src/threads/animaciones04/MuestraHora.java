package threads.animaciones04;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class MuestraHora extends Applet {

	
	private HiloMuestraHora hiloMuestraHora = null;
	private HiloMuestraMensaje hiloMuestraMensaje = null;

	public void init(){
			setSize(700,200);
			
			hiloMuestraHora = new HiloMuestraHora(this);
			hiloMuestraHora.start();
			
			hiloMuestraMensaje = new HiloMuestraMensaje();
			hiloMuestraMensaje.start();
	}
	
	public void paint(Graphics g){
		
		g.setFont(new Font("serif",Font.BOLD,hiloMuestraMensaje.getX()));
		g.drawString(hiloMuestraHora.getFechaHoraActual().toString(),100,100);

	}
}
