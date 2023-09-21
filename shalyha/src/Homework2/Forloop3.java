package Homework2;

public class Forloop3 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		int sum2 = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
			sum2 = sum2 + sum;

		}
		System.out.println(sum2);
	}
}
