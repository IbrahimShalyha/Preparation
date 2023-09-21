package review;

import java.util.Arrays;

public class ReverseString {
	public String[] rev(String[] a) {

		String[] b = new String[4];
		for (int i = 0; i < a.length; i++) {
			String c = "";
			for (int j = a[i].length() - 1; j >= 0; j--) {
				c = c + a[i].charAt(j);
			}
			b[i] = c;
		}
		return b;
	}

	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		String[] a = { "KNITE", "NIGHT", "MORNING", "AFTERNOON" };
		System.out.println(Arrays.toString(r.rev(a)));
	}
}
