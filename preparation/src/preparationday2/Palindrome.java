package preparationday2;

public class Palindrome {
	public static void main(String[] args) {

		String word = "MALAYALAM";
		String words = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			words = words + word.charAt(i);
		}
		if (word.equals(words)) {
			System.out.println("IT IS PALINDROME");
		} else {
			System.out.println("NOT A PALINDROME");
		}
	}
}
