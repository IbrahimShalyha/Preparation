package review;

import java.util.Arrays;

public class StringSort {
	public static void main(String[] args) {

//		String[] words = { "DAVID", "SUMATHI", "XAVIER", "ARUN" };
//
//		Arrays.sort(words);
//
//		System.out.println("Sorted Array: " + Arrays.toString(words));

		String word = "IBRAHIM";
		char[] words = word.toCharArray();
		Arrays.sort(words);
		System.out.println(words);
	}
}
