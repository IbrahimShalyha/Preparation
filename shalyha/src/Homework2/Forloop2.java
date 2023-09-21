package Homework2;

public class Forloop2 {
	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		int a = 0;

		for (int i = 1; i <= num; i++) {
			a = a + i + 6;
		}
		System.out.println(a);
	}
}
