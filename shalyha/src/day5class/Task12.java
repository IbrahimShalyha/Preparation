package day5class;

public class Task12 {
	public static void main(String[] args) {
		float a = Float.parseFloat(args[0]);
		if (a > 0 && a < 1.6) {
			System.out.println("BAD");
		} else if (a > 1.6 && a < 2.9) {
			System.out.println("AVERAGE");
		} else if (a > 3.0 && a < 3.9) {
			System.out.println("GOOD");
		} else {
			System.out.println("VERY GOOD");
		}
	}
}
