package Test;

public class ListPrime {
	public static void main(String[] args) {
		for (int i = 10; i <= 100; i++) {
			boolean c = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					c = false;
				}
			}
			if (c == true) {
				System.out.println(i);
			}
		}
	}
}
