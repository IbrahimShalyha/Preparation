package homework;

public class FirstLetterCapsOfString {
	public static void main(String[] args) {
		String word = "i love my mom";
		String[] word1 = word.split(" ");
		for (String i : word1) {
			if (!i.isEmpty()) {
				String a = i.substring(0, 1).toUpperCase() + i.substring(1);
				System.out.print(a + " ");
			}
		}

	}
}
