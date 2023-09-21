package preparationday6;

public class ExampleThread implements Runnable {

	public void run() {
		System.out.println("THREAD IS RUNNIG");
	}

	public static void main(String[] args) {
		ExampleThread e = new ExampleThread();
		Thread t = new Thread(e);
		t.start();
		System.out.println("HELLO");
	}
}
