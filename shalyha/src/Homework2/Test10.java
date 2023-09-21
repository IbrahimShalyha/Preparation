package Homework2;

public class Test10 {
	public static void main(String[] args) {
		String[] a = args[0].split(",");

		int[] g = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			g[i] = Integer.parseInt(a[i]);
		}
		int highest = g[0];
		int factorial = 1;
		for (int i = 1; i < g.length; i++) {
			if (g[i] > highest) {
				highest = g[i];
			}
		}
		for (int i = 1; i <= highest; i++) {
			factorial *= i;
		}

		System.out.println("Factorial of highest number is " + factorial);
	}

}
