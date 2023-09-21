package Homework2;

public class Test8 {
	public static void main(String[] args) {
		String[] a = args[0].split(",");
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > 6) {
				a[i] = a[i].toUpperCase();
				System.out.println(a[i]);
			}
		}
	}
}
