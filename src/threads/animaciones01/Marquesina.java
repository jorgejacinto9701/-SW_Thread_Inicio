package threads.animaciones01;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Marquesina extends Applet {

	
	private String mensaje ="Aprenda y practique Java";
	public Integer x =0;
	private HiloMarquesina hilo = null;
	
	public void init(){
			setSize(400,200);
			
			hilo = new HiloMarquesina(200,this);
			hilo.start();
	}
	
	
	
	public void paint(Graphics g){
		g.setFont(new Font("serif",Font.BOLD,18));
		g.drawString(mensaje,hilo.getX(),100);
	}
}
