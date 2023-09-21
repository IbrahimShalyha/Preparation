package tuesday2908;

public class Prime {
	public static void main(String[] args) {
		int a = 50;
		int b = 100;

		for (int i = a; i <= b; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
//					break;
				}
				}
				if (isPrime == true) {
					System.out.println(i);
				}

			
		}
	}
}
