package threads.animaciones04;


public class HiloMuestraMensaje extends Thread {

	private Integer x= 18;
	
	public Integer getX() {
		return x;
	}
	
	public void run(){
		while(true){
			x = x + 2;
			if(x>30)
				x = 18;
			System.out.println("VALORES de X :" + x);
			try {
				HiloMuestraMensaje.sleep(500);
			} catch (Exception e) {
			}
		}
		
		
	}
}
