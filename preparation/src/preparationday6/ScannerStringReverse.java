package preparationday6;

import java.util.Scanner;

public class ScannerStringReverse {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("name");
		String name = data.nextLine();
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}
}