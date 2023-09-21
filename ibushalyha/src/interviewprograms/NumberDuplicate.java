package interviewprograms;

public class NumberDuplicate {
	public static void main(String[] args) {

		int[] num = { 10, 12, 13, 10, 10, 15, 15, 18, 19, 15, 10 };

		for (int i = 0; i < num.length; i++) {
			int count = 1;
			for (int j = i+1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
					num[j] = '0';
				}
			}
			if (count > 1 && num[i] != '0') {
				System.out.println(num[i] + "=" + count);
			}
		}
	}
}
