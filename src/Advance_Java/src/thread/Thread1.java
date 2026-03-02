package thread;

public class Thread1 {
	static final Object lock = new Object();
	public static void main(String[] args) throws Exception {
		Thread worker = new Thread(
				()->{
					try {
						System.out.println("Worker has started");
						Thread.sleep(2000);
						synchronized(lock) {
							System.out.println("Worker is going to waiting state");
							lock.wait();
						}
						System.out.println("Worker resumed and finishing");
					}catch(InterruptedException e) {
						throw new RuntimeException(e);
					}
				});
		
		
		System.out.println("State after creation: " + worker.getState());
		Thread.sleep(100);
		System.out.println("State during sleep: "+ worker.getState());
		Thread.sleep(500);
		System.out.println("State during sleep: "+ worker.getState());
		Thread.sleep(2000);
		System.out.println("State during sleep: "+ worker.getState());
		
	synchronized (lock) {
		lock.notify();
	}
	worker.join();
	System.out.println("State after complete: "+ worker.getState());
	}

}


// Life cycle states
// NEW - RUNNABLE - BLOCKED - WAITING - TIMED WAITING - TERMINATED
// Life cycle flow
// NEW - RUNNABLE - (BLOCKED/WAITING/TIMED WAITING) - RUNNABLE - TERMINATED
