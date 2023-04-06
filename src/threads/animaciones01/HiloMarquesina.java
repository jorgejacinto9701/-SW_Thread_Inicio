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
			
		}
		
		
	}
}
