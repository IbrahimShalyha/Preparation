package Test;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String a = "RACE";
		String b = "CARE";

		char[] x = a.toCharArray();
		char[] y = b.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);

		if (Arrays.equals(x, y)) {
			System.out.println("IT IS ANAGRAM");
		} else {
			System.out.println("IT IS NOT ANAGRAM");
		}
	}
}
