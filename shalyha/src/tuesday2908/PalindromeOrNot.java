package tuesday2908;

public class PalindromeOrNot {
	public static void main(String[] args) {
		String word = "LIRIL";
		String words = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			words = words + word.charAt(i);
		}
		if (word.equalsIgnoreCase(words)) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT A PALINDROME");
		}
	}
}