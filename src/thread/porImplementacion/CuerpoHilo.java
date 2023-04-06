package thread.porImplementacion;

import java.util.Random;

public class CuerpoHilo implements Runnable{

	@Override
	public void run() {
		String[] x = {"Sonia", "Luciana", "Elba"};
		Random r = new Random();
		while(true) {
			String nombre = x[r.nextInt(3)];
			System.out.println(nombre);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	
}
