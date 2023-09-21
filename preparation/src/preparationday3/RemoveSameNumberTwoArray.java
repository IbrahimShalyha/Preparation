package preparationday3;

public class RemoveSameNumberTwoArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 3, 4 };

		int a1 = a.length;
		int b1 = b.length;
		int c = a1 + b1;

		int[] d = new int[c];
		d[0] = a[0];
		d[1] = a[1];
		d[2] = a[2];
		d[3] = a[3];
		d[4] = b[0];
		d[5] = b[1];
		d[6] = b[2];
		d[7] = b[3];

		for (int i = 0; i < d.length; i++) {
			int count = 0;
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] == d[j]) {
					count++;
					d[j] = '0';
				}
			}
			if (count == 0 && d[i] != '0') {
				System.out.println(d[i]);
			}
		}
	}
}
