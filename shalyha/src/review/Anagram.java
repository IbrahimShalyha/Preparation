package review;

import java.util.Arrays;

public class Anagram {
	public void findAnagram(String a, String b) {
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

	public static void main(String[] args) {

		String a = "TEA";
		String b = "EAT";

		Anagram a1 = new Anagram();
		a1.findAnagram(a, b);
	}
}
