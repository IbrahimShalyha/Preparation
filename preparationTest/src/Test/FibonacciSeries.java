package Test;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num = 10;
		int a = 0;
		int b = 1;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = a + b;
			System.out.println(a);
			a = b;
			b = sum;
		}
	}
}
