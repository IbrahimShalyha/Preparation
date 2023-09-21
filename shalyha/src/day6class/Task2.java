package day6class;

public class Task2 {
	public static void main(String[] args) {
		String word = "JAVA";
		for (int a = 0; a < word.length(); a++) {
			System.out.println(word.charAt(a));
		}
		for (int a = word.length() - 1; a >= 0; a--) {
			System.out.println(word.charAt(a));
		}
	}
}
