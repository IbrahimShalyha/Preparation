package homework;

public class New {
	public static void main(String[] args) {
		String name = "GUNALAN";
		String names = "";
		int a = 24;
		int count = 0;
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}

		for (int i = name.length() - 1; i >= 0; i--) {
			names = names + name.charAt(i);
		}
		if (names.equals(name)) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT A PALINDROME");
		}

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT A PRIME");
		}
	}
}
