package review;

public class RepeatedNumbers {
	public static void main(String[] args) {
		int[] num = { 1, 1, 5, 5, 5, 6, 7, 8, 8, 8, 8 };

		for (int i = 0; i < num.length; i++) {
			int count = 0;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(num[i]);
			}
		}
	}
}
