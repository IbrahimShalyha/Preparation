package tuesday2908;

public class ArrayMax {
	public static void main(String[] args) {
		int[] num = { 35, 865, 65, 83, 903 };
		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max);
	}
}
