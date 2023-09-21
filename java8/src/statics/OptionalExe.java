package statics;

import java.util.Optional;

public class OptionalExe {
	public static void main(String[] args) {
		Optional<String> value = Optional.of("IBRAHIM");
		System.out.println(value);
		System.out.println(value.get());

		Optional<String> values = Optional.ofNullable("IBRAHIM");
		System.out.println(values);
		System.out.println(values.isPresent());
		System.out.println(value.isEmpty());
		
		String val = value.orElse("RAM");
		System.out.println(val.isEmpty());
		System.out.println(value.isPresent());
	}
}
