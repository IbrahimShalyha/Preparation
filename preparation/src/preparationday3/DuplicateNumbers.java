package preparationday3;

public class DuplicateNumbers {
	public static void main(String[] args) {

		int[] num = { 1, 2, 2, 3, 4, 5, 3 };

		for (int i = 0; i < num.length; i++) {
			int count = 1;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
					num[j] = '0';
				}
			}
			if (count > 1 && num[i] != '0') {
				System.out.println(num[i]);
			}
		}
	}
}
