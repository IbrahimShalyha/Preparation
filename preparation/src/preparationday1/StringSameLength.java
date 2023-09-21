package preparationday1;

public class StringSameLength {
	public static void main(String[] args) {
		String a = "This is Java Program four and what is the lang";

		String[] b = a.split(" ");
		int c = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].length() == b[j].length()) {
					c = b[i].length();
				}
			}
		}
		for (int z = 0; z < b.length; z++) {
			if (b[z].length() == c) {
				System.out.println(b[z]);
			}
		}
	}
}
