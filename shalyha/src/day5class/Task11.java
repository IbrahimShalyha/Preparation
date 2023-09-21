package day5class;

public class Task11 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a > 13 && a < 18) {
			System.out.println("VERY COLD");
		} else if (a > 18 && a < 25) {
			System.out.println("COLD");
		} else {
			System.out.println("HOT");
		}

	}
}
