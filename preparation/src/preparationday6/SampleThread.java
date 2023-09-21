package preparationday6;

public class SampleThread extends Thread {

	public void run() {
		System.out.println("THREAD IS RUNNING");
	}

	public static void main(String[] args) {
		SampleThread s1 = new SampleThread();
		s1.start();
		System.out.println("HELLO");
	}
}
