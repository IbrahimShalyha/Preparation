package preparationday3;

import java.util.Arrays;
import java.util.List;

public class SpaceCount {
	public static void main(String[] args) {

		List<String> space = Arrays.asList("RAM", " ", "RAJA", " ");
		long z = space.stream().filter(x -> x.equals(" ")).count();
		System.out.println(z);

	}
}
