package day7class;

public class Task6 {
	public static void main(String[] args) {
		int[] num = { 75, 65, 84, 54, 86, 90 };
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}

		}
		System.out.println(max);

	}
}
