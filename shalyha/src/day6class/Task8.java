package day6class;

public class Task8 {
	public static void main(String[] args) {
		for (int a = 50; a <= 100; a++) {
			if (a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}
	}
}
