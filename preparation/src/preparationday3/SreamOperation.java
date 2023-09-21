package preparationday3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SreamOperation {

	public static void main(String[] args) {

		List<Integer> z = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 60);
		List<Integer> l = Arrays.asList(38, 65, 56, 89, 12, 71, 01, 40);

		// max
		Integer max = z.stream().max(Integer::compare).get();
		System.out.println("MAX" + " = " + max);
//		List<Integer> s = z.stream().max(Comparator.comparingInt(sreamOperation::Integer)).get();

		// min
		Integer min = z.stream().min(Integer::compare).get();
		System.out.println("MIN" + " = " + min);

		// secondmax
		Integer secondmax = z.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("SECOND MAX" + " = " + secondmax);

		// Ascending
		List<Integer> ascend = z.stream().sorted().toList();
		System.out.println("ASCENDING" + " = " + ascend);

		// Descending
		List<Integer> descend = z.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("DESCENDING" + " = " + descend);

		// Total Sum
		Integer sum = z.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("TOTAL SUM" + " = " + sum);

		// Count
		long count = z.stream().count();
		System.out.println("COUNT" + " = " + count);

		// Map
		List<Integer> m = z.stream().filter(x -> x >= 50).map(y -> y).toList();
		System.out.println("MAP" + " = " + m);

		// Distinct
		List<Integer> dis = z.stream().distinct().toList();
		System.out.println("DISTINCT" + " = " + dis);

		// First 5 Values
		List<Integer> values = z.stream().limit(5).toList();
		System.out.println("FIRST 5 VALUES" + " = " + values);

		// Flatmap
		List<Integer> flat = Stream.of(z, l).flatMap(List::stream).sorted().distinct().toList();
		System.out.println(flat);

		// Stream Of
		List<String> str = Stream.of("IBRAHIM", "SHAKINA", "PARVEEN").filter(x -> x.startsWith("S")).toList();
		System.out.println(str);

	}
}
