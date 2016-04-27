package tutorial;

class NewThread2 extends Thread {
	public NewThread2() {
		// TODO Auto-generated constructor stub
		super("Demo thread.");
		System.out.println("Child thread: " + this);
		start();
	}
	
	public void run() {
		for(int i=5; i>0; i--) {
			System.out.println("Child Thread: " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Child interrupted.");
			}
		}
		System.out.println("Exiting child thread.");
	}
}

public class ThreadDemo2 extends Thread {

	public static void main(String[] args) {
		new NewThread();
		
		for (int i=5; i>0; i--) {
			System.out.println("Main Thread: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Main interrupted.");
			}
		}
		System.out.println("Exiting Mian thread.");
	}
}
