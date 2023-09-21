package preparationday1;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArray1 {
	public static void main(String[] args) {

		List<List<Integer>> a = new ArrayList<>();

		a.add(new ArrayList<>(List.of(1, 2, 3, 4)));
		a.add(new ArrayList<>(List.of(5, 6, 7, 8)));
		a.add(new ArrayList<>(List.of(1, 2, 3, 4)));
		a.add(new ArrayList<>(List.of(5, 6, 7, 8)));

		int sum = 0;

		for (int i = 0; i < a.size(); i++) {
			List<Integer> nums = a.get(i);
			if (i < nums.size()) {
				sum = sum + nums.get(i);
			}
		}

		System.out.println("Sum of diagonal elements: " + sum);
	}
}
