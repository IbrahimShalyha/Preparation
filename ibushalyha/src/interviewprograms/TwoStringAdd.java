package interviewprograms;

public class TwoStringAdd {
	public static void main(String[] args) {

		String a = "IBRAHIM";
		String b = "SHALYHA";

		String c = a.concat(b);

		for (int i = c.length() - 1; i >= 0; i--) {
			System.out.print(c.charAt(i));
		}
	}
}
