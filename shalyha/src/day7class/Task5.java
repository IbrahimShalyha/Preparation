package day7class;

public class Task5 {
	public static void main(String[] args) {
		int[] num = new int[6];
		num[0] = -7;
		num[1] = 8;
		num[2] = 0;
		num[3] = 78;
		num[4] = -86;
		num[5] = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				System.out.println(num[i] + " IS POSITIVE");
			} else if (num[i] < 0) {
				System.out.println(num[i] + " IS NEGATIVE");
			} else {
				System.out.println(num[i] + " IS NEUTRAL");
			}
		}
	}
}
