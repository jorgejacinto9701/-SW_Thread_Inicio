package threads.animaciones02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HiloMuestraImagen extends Thread {

	private JLabel lblImagen; 
	
	public  HiloMuestraImagen(JLabel lblImagen){
		this.lblImagen =lblImagen;
		
	}

	
	public void run(){
		int x = 0;
		while(true){
			x ++;
			lblImagen.setIcon(new ImageIcon(HiloMuestraImagen.class.getResource("/images/T"+ x + ".gif")));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (x == 10 ) {  x = 0; }
			
		}
		
		
	}


}
