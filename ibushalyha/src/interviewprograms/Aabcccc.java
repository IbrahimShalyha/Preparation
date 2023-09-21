package interviewprograms;

public class Aabcccc {
	public static void main(String[] args) {
		String a = "aabcccc";

		char[] b = a.toCharArray();
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;

		for (int i = 0; i < b.length; i++) {
			if (b[i] == 'a') {
				c1++;
			} else if (b[i] == 'b') {
				c2++;
			} else {
				c3++;
			}
		}
		System.out.println("a = " + c1);
		System.out.println("b = " + c2);
		System.out.println("c = " + c3);
	}
}
