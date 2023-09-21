package Test;

public class Armstrong {
	public static void main(String[] args) {

		int a = 153;
		int sum = 0;
		int b = a;

		while (b > 0) {
			int rem = b % 10;
			sum = sum + (rem * rem * rem);
			b = b / 10;
		}
		if (sum == a) {
			System.out.println("IT IS ARMSTRONG NUMBER");
		} else {
			System.out.println("IT IS NOT A ARMSTRONG NUMBER");
		}
	}
}
