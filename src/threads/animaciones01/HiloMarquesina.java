package threads.animaciones01;

import java.applet.Applet;

public class HiloMarquesina extends Thread {

	private Integer x;
	private Applet applet; 
	
	public  HiloMarquesina(Integer x, Applet applet){
		this.x =x;
		this.applet =applet;
		
	}
	public Integer getX() {
		return x;
	}
	
	public void run(){
		while(true){
			x = x - 5;
			if(x==0)
				x = applet.getSize().width;
			applet.repaint();
			System.out.println("VALORES de X :" + x);
			try {
				HiloMarquesina.sleep(500);
			} catch (Exception e) {
			}
		}
		
		
	}
}
