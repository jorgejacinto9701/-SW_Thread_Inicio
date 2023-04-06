package socketsConPoolThread;

import java.util.LinkedList;



public class Pool {
	
	private LinkedList<Runnable> tareas = new LinkedList<Runnable>();

	public Pool(int size) {
		for (int i = 0; i < size; i++) {
			Atencion thread = new Atencion(this);
			thread.start();
		}
	}

	public void run(Runnable task) {
		synchronized (tareas) {
			tareas.addLast(task);
			tareas.notify();
		}
	}

	public Runnable getNext() {
		Runnable returnVal = null;
		synchronized (tareas) {
			while (tareas.isEmpty()) {
				try {
					tareas.wait();
				} catch (InterruptedException ex) {
					System.err.println("Interrupted");
				}
			}
			returnVal = (Runnable) tareas.removeFirst();
		}
		return returnVal;
	}

	class Atencion extends Thread {
		private Pool pool;

		public Atencion(Pool pool) {
			this.pool = pool;
		}

		public void run() {
			while (true) {
				Runnable job = pool.getNext();
				try {
					job.run();
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		}
	}
}
