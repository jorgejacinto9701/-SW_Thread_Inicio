package threads.animaciones03;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class MuestraImagen extends Applet {


	private HiloMuestraImagen hilo = null;
	

	public void init(){
			setSize(400,200);
			//Se agrega la primera Imagen
			getImage(getCodeBase(),"images/T1.gif");
			 
			//El hilo cambiar las imagenes
			hilo = new HiloMuestraImagen(this);
			hilo.start();
	}
	
	
	
	public void paint(Graphics g){
		g.drawImage(hilo.getImagen(),0,0,this);
	}
}
