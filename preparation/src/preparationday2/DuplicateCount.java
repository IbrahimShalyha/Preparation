package preparationday2;

public class DuplicateCount {
	public static void main(String[] args) {
		String a = "SELLA";

		char[] b = a.toCharArray();

		for (int i = 0; i < b.length; i++) {
			int count = 1;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
					count++;
//				   b[j] = 0;
				}
			}
			if (count > 1) {
				System.out.println(b[i] + "=" + count);
			}
		}
	}
}
