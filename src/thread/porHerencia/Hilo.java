package thread.porHerencia;

public class Hilo extends Thread{
	
	@Override
	public void run() {
		int x = 0;
		while(true) {
			x = x +2;
			System.out.println(x);
			
			try {
				Thread.sleep(2000); //milisegundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

}
