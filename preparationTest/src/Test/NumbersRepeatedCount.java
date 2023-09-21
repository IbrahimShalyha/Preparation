package Test;

public class NumbersRepeatedCount {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			int c = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					c++;
					a[j] = '0';
				}
			}
			if (c > 1 && a[i] != '0') {
				System.out.println(a[i] + "=" + c);
			}
		}
	}
}
