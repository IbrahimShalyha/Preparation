package review;

public class AscendAndDescend {
	public static void main(String[] args) {
		int[] num = { 43, 23, 98, 65, 123, 9 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.println(num[i]);
		}
	}
}
