package preparationday3;

public class SequencelyThreeDigitsAreEven {
	public static void main(String[] args) {

		int[] a = { 3, 4, 7, 6, 4, 4, 9 };

		int count = 0;
		for (int i = 2; i < a.length; i++) {
			if (a[i - 2] % 2 == 0 && a[i - 1] % 2 == 0 && a[i] % 2 == 0) {
				count++;
			}
		}
		if (count >= 1) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
}
