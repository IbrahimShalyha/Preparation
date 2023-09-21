package homework;

public class PrimeorNotPrime {
	public static void main(String[] args) {
		int num1 = 11;
		int count = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("GIVEN NUMBER IS PRIME");
		} else {
			System.out.println("GIVEN NUMBER IS NOT PRIME");
		}
	}
}
