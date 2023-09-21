package day7class;

public class Task8 {
	public static void main(String[] args) {
		String[] word = { "Apples", "Orange", "Grapes", "Strawberry", "Banana" };
		String max = word[0];
		String min = word[0];
		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > max.length()) {
				max = word[i];
			}
		}
		System.out.println(max);

		for (int i = 0; i < word.length; i++) {
			if (word[i].length() < min.length()) {
				min = word[i];
			}
		}
		System.out.println(min);
	}
}
