package day7class;

public class Task9 {
	public static void main(String[] args) {
		String[] word = new String[6];
		word[0] = "Apples";
		word[1] = "Orange";
		word[2] = "Grapes";
		word[3] = "Strawberry";
		word[4] = "Berry";
		word[5] = "Bananas";
		int count = 0;
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i].length());
		}

		for (int i = 0; i < word.length; i++) {
			if (word[i].startsWith("B")) {
				count++;
			}
		}
			System.out.println(count);
		

	}
}