package preparationday8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task1 {
	public static void main(String[] args) {

		Supplier<String> msg = () -> "HELLO EVERYONE";
		System.out.println(msg.get());

		Consumer<Integer> age = x -> {
			if (x > 18) {
				System.out.println("ELIGIBLE FOR VOTE");
			} else {
				System.out.println("NOT ELIGIBLE FOR VOTE");
			}
		};
		age.accept(19);

		Function<String, Integer> name = x -> x.length();
		System.out.println(name.apply("IBRAHIM"));

		Predicate<String> name1 = x -> x.contains("a");
		System.out.println(name1.test("IBRAHIM"));
	}
}