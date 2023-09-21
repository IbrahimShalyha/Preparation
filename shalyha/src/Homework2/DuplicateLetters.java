package Homework2;

public class DuplicateLetters {
	public static void main(String[] args) {
		String a = "HELLOWORLD";

		String[] x = a.split("");

		for (int i = 0; i < x.length; i++) {
			int count = 1;
			for (int j = i + 1; j < x.length; j++) {
				if (x[i].equals(x[j])) {
					count++;

					x[j] = "0";
				}
			}

			if (count > 1 && x[i] != "0") {
				System.out.println(x[i]);
			}
		}
	}
}
