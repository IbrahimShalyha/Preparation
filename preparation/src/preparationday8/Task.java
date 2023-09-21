package preparationday8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task {
	public static void main(String[] args) {

		Supplier<String> message = () -> "HELLO WORLD";
		System.out.println(message.get());

		Predicate<String> checkLength = (String s) -> s.length() == 8;
		System.out.println("FUNCTIONAL INTERFACE HAVING LENGTH 8 ARE = ");
		List<String> FunctionalInterfaces = Arrays.asList("Predicate", "Function", "Consumer", "Supplier", "nibrahim");
		FunctionalInterfaces.forEach(x -> {
			if (checkLength.test(x)) {
				System.out.println(x);
			}
		});

		Function<String, Integer> function = (x) -> x.length();
		System.out.println("LENGTH OF THE STRING = " + function.apply("IBRAHIM"));
		
		Predicate<String> name = x -> x.contains("a");
		System.out.println(name.test("IBRAHIM"));

	}
}
