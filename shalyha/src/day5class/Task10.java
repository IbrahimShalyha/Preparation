package day5class;

public class Task10 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a > 0 && a < 13) {
			System.out.println("Kids");
		} else if (a > 13 && a < 18) {
			System.out.println("Adults");
		} else if (a > 18 && a < 45) {
			System.out.println("Teenagers");
		} else {
			System.out.println("Senior Citizens");

		}
	}
}
