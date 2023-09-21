package review;

import java.util.Arrays;

public class SortedArray {
	public static void main(String[] args) {
		int[] num = { 10, 10, 11, 12, 13, 14, 15, 11, 13, 6, 12, 66, 6 };
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			int count = 0;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(num[i]);
			}
		}
	}
}
