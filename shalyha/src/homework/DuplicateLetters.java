package homework;

public class DuplicateLetters {
	public static void main(String[] args) {
		String word = "PARAGRAPH";
		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					System.out.print(word.charAt(i) + " ");
				}

			}
		}
	}

}
