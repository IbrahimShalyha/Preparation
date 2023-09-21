package preparationday3;

import java.util.Arrays;

public class CheckBothIntArrayAreSame {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 4, 3, 2, 1 };

		Arrays.sort(a);
		Arrays.sort(b);

		if (Arrays.equals(a, b)) {
			System.out.println("SAME");
		} else {
			System.out.println("NOT A SAME");
		}
	}
}
