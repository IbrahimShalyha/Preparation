package review;

public class AddingTwoNumbers {
	public static void main(String[] args) {

		int[] num = { 2, 3, 4, 8, 1, 2, 3, 1, 2, 2 };
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			int count = 0;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == 4) {
					count++;
					temp = num[j];
				}
			}
			if (count == 1) {
				System.out.println(num[i] + " " + temp);
			}
		}
	}
}
