package preparationday1;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int n = 4;
		int[][] b = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					count = count + b[i][j];
				}
			}
		}
		System.out.println(count);

		int count1 = 0;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (i == j) {
					count1 = count1 + b[i][j];
					System.out.println(b[i][j]);
				}
			}
		}
		System.out.println(count1);
	}
}
