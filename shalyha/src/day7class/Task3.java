package day7class;

public class Task3 {
	public static void main(String[] args) {
		int[] num = new int[6];
		num[0] = 95;
		num[1] = 85;
		num[2] = 75;
		num[3] = 65;
		num[4] = 55;
		num[5] = 45;
		int total = 0;
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			total = total + num[i];
			count++;
		}
		System.out.println(total);
		System.out.println(count);
	}
}
