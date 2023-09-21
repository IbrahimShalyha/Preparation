package Test;

public class a1b2c3 {
	public static void main(String[] args) {
		String a = "a1b2c3";

		String[] b = a.split("");

		for (int i = 0; i < a.length(); i = i + 2) {
			for (int j = 0; j < Integer.parseInt(b[i + 1]); j++) {
				System.out.print(b[i]);
			}
		}
	}
}
