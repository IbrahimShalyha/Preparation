package preparationday6;

//import java.util.ArrayList;
//import java.util.List;

public class SampleSynchronizedThread implements Runnable {
	public void run() {

		synchronized (SampleSynchronizedThread.class) {
			System.out.println("HELLO");

			try {
				SampleSynchronizedThread.class.wait(5000);
				System.out.println("THREAD IS AWAITED");
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SampleSynchronizedThread s = new SampleSynchronizedThread();
		Thread t = new Thread(s);
		t.start();
		Thread.sleep(2000);
		System.out.println("HI WORLD");

//		ArrayList<Integer> a = new ArrayList<>();
//		a.add(10);
//		List<String> b = new ArrayList<>();
//		b.add(null);
	}

}
