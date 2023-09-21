package roomwork;

public class Abbcccdddd {
	public static void main(String[] args) {
		String a1 = "abbcccdddd";

		char[] b = a1.toCharArray();
		int a = 0;
		int b1 = 0;
		int c = 0;
		int d = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 'a') {
				a++;
			} else if (b[i] == 'b') {
				b1++;
			} else if (b[i] == 'c') {
				c++;
			} else {
				d++;
			}
		}
		System.out.println(a + " " + b1 + " " + c + " " + d);
	}
}
