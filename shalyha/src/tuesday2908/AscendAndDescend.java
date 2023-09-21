package tuesday2908;

public class AscendAndDescend {
	public static void main(String[] args) {
		int[] num = { 44, 65, 24, 90, 74, 110, 12 };
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int a : num) {
			System.out.println(a);
		}

	}
}
