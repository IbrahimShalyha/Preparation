package interviewprograms;

public class StringSentenceReverse {
	public static void main(String[] args) {
		String a = "I AM A DEVELOPER";
//		String[] b = a.split("");

		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
	}
}
