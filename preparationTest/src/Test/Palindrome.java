package Test;

public class Palindrome {
	public static void main(String[] args) {
		String word = "MADAM";
		String words = "";

		for (int i = 0; i < word.length(); i++) {
			words = words + word.charAt(i);
		}
		if (word.equalsIgnoreCase(words)) {
			System.out.println("IT IS PALINDROME");
		} else {
			System.out.println("IT IS NOT A PALINDROME");
		}
	}
}
