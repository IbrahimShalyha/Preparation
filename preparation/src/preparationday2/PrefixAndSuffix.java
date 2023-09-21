package preparationday2;

public class PrefixAndSuffix {
	public static void main(String[] args) {

		String[] a = { "ANU", "ANUPRABA", "ANURADHA", "ANUPRIYA" };

		String b = a[2];

		for (int i = 0; i < a.length; i++) {
			while (a[i].indexOf(b) < 0) {
				b = b.substring(0, b.length() - 1);
			}
		}
		System.out.println(b);
	}
}
