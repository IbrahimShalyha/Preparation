package day5class;

public class Task9 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = 2;
		int c = 3;
		if (a % b == 0 && a % c == 0) {
			System.out.println("7 is divisible by 2 and 3");
		} else if (a % b == 0) {
			System.out.println("7 is divisible by 2");
		} else if (a % c == 0) {
			System.out.println("7 is divisible by 3");
		} else {
			System.out.println("7 is not divisible by 2 and 3");
		}
	}
}
