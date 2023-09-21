package interviewprograms;

public class OneTwoThreeFour {
	public static void main(String[] args) {
		String[] names = { "ONE", "TWO", "THREE", "FOUR", "FIVE" };

		for (int i = 0; i < names.length; i++) {
			if (names[i].length() % 2 == 0) {
				System.out.println(names[i].substring(names[i].length() / 2 - 1, names[i].length()));
			} else {
				System.out.println(names[i].charAt(names[i].length() / 2));
			}
		}
	}
}
