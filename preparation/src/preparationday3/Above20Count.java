package preparationday3;

import java.util.Arrays;
import java.util.List;

public class Above20Count {
	public static void main(String[] args) {

		List<Integer> z = Arrays.asList(45, 35, 12, 75, 6, 4, 87, 3);
		long count = z.stream().filter(x -> x >= 20).count();
		System.out.println(count);
	}
}
