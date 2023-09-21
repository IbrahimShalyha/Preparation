package preparationday2;

public class Armstrong {
	public static void main(String[] args) {

		int a = 1634;
		int sum = 0;
		int b = a;

		while (b > 0) {
			int rem = b % 10;
			sum = sum + (rem * rem * rem * rem);
			b = b / 10;
		}
		if (a == sum) {
			System.out.println("ARMSTRONG");
		} else {
			System.out.println("NOT A ARMSTRONG");
		}
	}
}
