package preparationday7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
	public static void main(String[] args) {

		List<String> a = Arrays.asList("IBU", "SHA", "AMAR", "DAVID");

		Map<String, Long> c = a.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(c);
	}
}
