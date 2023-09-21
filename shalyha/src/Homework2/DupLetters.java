package Homework2;

public class DupLetters {
	public static void main(String[] args) {

		String word = "HELLO WORLD";

		char words[] = word.toCharArray();

		for (int i = 0; i < words.length; i++) {
			int count = 0;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i] == words[j]) {
					count++;
//					words[j] = '0';
				}
			}
			if (count == 1) {
				System.out.println(words[i]);
			}

		}
	}
}
