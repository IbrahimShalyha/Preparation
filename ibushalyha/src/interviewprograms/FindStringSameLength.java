package interviewprograms;

public class FindStringSameLength {
	public static void main(String[] args) {
		String a = "Refer and earn money";

		String[] b = a.split("");

		for (int i = 0; i < b.length; i++) {
			if (i > 0 && b[i].length() == b[i - 1].length()) {
				System.out.println(b[i]);
			}
		}
	}
}
