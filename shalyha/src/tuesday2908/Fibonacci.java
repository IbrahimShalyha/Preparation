package tuesday2908;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 10;
		int a = 0;
		int b = 1;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}
	}
}
