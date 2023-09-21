package day6class;

public class Task9 {
	public static void main(String[] args) {
		String val = "Bottle";
		int count = 0;
		for (int a = 0; a < val.length(); a++) {
			if (val.charAt(a) == 'a' || val.charAt(a) == 'e' || val.charAt(a) == 'i' || val.charAt(a) == 'o'
					|| val.charAt(a) == 'u') {
				count = count + 1;
				System.out.println(val.charAt(a));

			}
		}
		System.out.println(count);
	}
}
