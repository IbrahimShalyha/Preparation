package preparationday7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedMethod {
	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(12, 14, 57, 83, 12, 34, 52);

		List<Integer> v = a.stream().sorted().toList();
		System.out.println(v);

		List<Integer> c = a.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(c);
	}
}
