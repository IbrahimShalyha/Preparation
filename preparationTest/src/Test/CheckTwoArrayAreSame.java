package Test;

import java.util.Arrays;

public class CheckTwoArrayAreSame {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 1, 2, 3, 4 };

		Arrays.sort(a);
		Arrays.sort(b);

		if (Arrays.equals(a, b)) {
			System.out.println("SAME");
		} else {
			System.out.println("NOT SAME");
		}
	}
}
