package Test;

public class Prefix {
	public static void main(String[] args) {

		String[] a = { "anu", "anupraba", "anuradha", "anupriya" };

		String b = a[2];

		for (int i = 0; i < a.length; i++) {
			while (a[i].indexOf(b) < 0) {
				b = b.substring(0, b.length() - 1);
			}
		}
		System.out.println(b);
	}
}
