package homework;

public class Palindrome {
	public static void main(String[] args) {
		String word = "MADAM";
		String word1 = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			word1 = word1 + word.charAt(i);
		}
		if (word1.equalsIgnoreCase(word)) {
			System.out.println("GIVEN STRING IS PALINDROME");
		} else {
			System.out.println("GIVEN STRING IS NOT PALINDROME");
		}
        System.out.println(word);
        System.out.println(word1);
	}
}
