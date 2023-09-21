package Homework2;

public class Test2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		int sum;
		for (int i = 1; i <= num - 2; i++) {
			sum = first + second;
			System.out.println(sum);
			first = second;
			second = sum;
		}

	}
}
