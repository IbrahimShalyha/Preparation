package day7class;

public class Task2 {
	public static void main(String[] args) {
		String[] word = new String[4];
		word[0] = "Arun";
		word[1] = "Arjun";
		word[2] = "Abdul";
		word[3] = "Akash";
		for (int i = 0; i < word.length; i++) {
			//System.out.println("NAME = " + word[i]);
		}
		for (int i = word.length - 1; i >= 0; i--) {
			//System.out.println("NAME = " + word[i]);
			System.out.println("NAME = " + word[i].charAt(0));
			//System.out.println("NAME = " + word[i].charAt(word[i].length() - 1));
			//System.out.println("NAME = " + word[i].charAt(word[i].length() / 2));
		}
		for (int i = 0; i < word.length / 2; i++) {
			System.out.println("NAME = " + word[i]);
		}
	}
}
