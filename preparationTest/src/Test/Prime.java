package Test;

public class Prime {
	public static void main(String[] args) {
		int num = 12;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("IT IS PRIME");
		} else {
			System.out.println("IT IS NOT PRIME");
		}
	}
}
