package preparationday1;

public class abc523def {
	public static void main(String[] args) {

		String a = "abc523def";

		char[] b = a.toCharArray();
		int c = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] >= '0' && b[i] <= '9') {
				c = i;
				break;
			}
		}
		for (int j = b.length - 1; j >= 0; j--) {
			if (j != c) {
				System.out.print(b[j]);
			}
		}
	}
}
