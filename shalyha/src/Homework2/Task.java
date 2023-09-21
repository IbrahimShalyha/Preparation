package Homework2;

public class Task {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a > 1) {
			System.out.println("positive");
		} else if (a > -1) {
			System.out.println("negative");
		} else if (a == 0) {
			System.out.println("zero");

		}

	}
}
