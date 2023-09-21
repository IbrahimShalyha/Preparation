package Homework2;

public class Test7 {
	public static void main(String[] args) {
		String[] a = args[0].split(",");
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(a[i].toUpperCase())) {
				System.out.println(a[i]);
			}
		}
	}
}
