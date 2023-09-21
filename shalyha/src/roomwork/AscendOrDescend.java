package roomwork;

public class AscendOrDescend {
	public static void main(String[] args) {
		int[] num = { 54, 76, 23, 82, 12, 2 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int a : num) {
			System.out.println(a);
		}
	}
}
