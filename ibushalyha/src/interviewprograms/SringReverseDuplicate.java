package interviewprograms;

public class SringReverseDuplicate {
	public static void main(String[] args) {
		String a = "IBRAHIM";
//		char[] b = a.toCharArray();
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
//			System.out.println(b[i]);
			if (a.charAt(i) != 'I') {
				b = b + a.charAt(i);
			}               
		}
	  System.out.println(b);
	}
}