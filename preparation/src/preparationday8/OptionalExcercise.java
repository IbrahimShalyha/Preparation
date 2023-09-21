package preparationday8;

import java.util.Optional;

public class OptionalExcercise {
	public static void main(String[] args) {

		String[] name = new String[10];

		Optional<String> a = Optional.ofNullable(name[5]);
		if (a.isPresent()) {
			System.out.println(name[5]);
		} else {
			System.out.println("THE VALUE IS NULL");
		}

		System.out.println(a.orElse("AMAR"));
	}
}
