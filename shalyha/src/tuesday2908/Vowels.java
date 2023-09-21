package tuesday2908;

public class Vowels {
	public static void main(String[] args) {
		String word = "SUBHANALLAH";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O'
					|| word.charAt(i) == 'U') {
				System.out.println(word.charAt(i));
			}
		}
	}
}
