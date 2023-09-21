package preparationday2;

public class abbccc {
	public static void main(String[] args) {

		String a = "abbcccdddddd";

		char[] b = a.toCharArray();

		for (int i = 0; i < b.length; i++) {
			int count = 1;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
					count++;
					b[j] = '0';
				}
			}
			if (count > 0 && b[i] != '0') {
				System.out.print(b[i] + "" + count);
			}
		}
	}
}
