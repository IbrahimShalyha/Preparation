package preparationday7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
	public static void main(String[] args) {

		List<String> a = Arrays.asList("IBU", "SHA");
		List<String> b = Arrays.asList("AMAR", "DAVID");

		List<String> c = Stream.of(a, b).flatMap(x -> x.stream()).toList();

		System.out.println(c);
	}
}
