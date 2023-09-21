package preparationday1;

import java.util.Arrays;
import java.util.List;

public class ArrayNumberEquals {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4, 4, 5, 3);
		int c = 0;
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i) + nums.get(j) == 8) {
					c++;
				}
			}
		}
		System.out.println(c);
	}
}
