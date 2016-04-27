package tutorial;

class NewThread implements Runnable{
	Thread t;
	public NewThread() {
		// TODO Auto-generated constructor stub
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread:" + t);
		t.start();
	}
	
	public void run() {
		try {
			for (int i=5; i>0; i--) {
				System.out.println("Child thread: " + i);
				
				Thread.sleep(50);
			}
		}catch (InterruptedException e) {
			System.out.println("Exiting child thread.");
		}
	}
}	
public class ThreadDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread();
		try {
			for (int i=5; i>0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		
		System.out.println("Main thread exiting.");;

	}
}

