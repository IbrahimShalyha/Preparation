package roomwork;

public class ListOfPrime {
	public static void main(String[] args) {

		for (int i = 15; i <= 115; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				System.out.println(i);
			}
		}
	}
}
