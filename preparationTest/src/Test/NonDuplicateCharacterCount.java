package Test;

public class NonDuplicateCharacterCount {
	public static void main(String[] args) {

		String a = "SHAKINAIBRAHIM";

		char[] b = a.toCharArray();

		for (int i = 0; i < b.length; i++) {
			int c = 1;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
					c++;
					b[j] = '0';
				}
			}
			if (c == 1 && b[i] != '0') {
				System.out.println(b[i] + "=" + c);
			}
		}
	}
}
