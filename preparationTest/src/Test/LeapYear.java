package Test;

public class LeapYear {
	public static void main(String[] args) {

		int num = 2000;

		if (num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)) {
			System.out.println("IT IS LEAP YEAR");
		} else {
			System.out.println("IT IS NOT A LEAP YEAR");
		}
	}
}
