package Homework2;

public class Test1 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1);
		System.out.println(num2);
		int ans = 1;
		for (int i = num1; i <= num2; i++) {
			ans = ans * i;
		}
		System.out.println(ans);

	}
}
