package Test;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 7, 8, 9 };

		for (int i = 1; i <= 9; i++) {
			int c = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					c++;
				}
			}
			if (c == 0) {
				System.out.println(i);
			}
		}
	}
}
