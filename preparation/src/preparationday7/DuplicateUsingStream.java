package preparationday7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateUsingStream {
	public static void main(String[] args) {

		List a = new ArrayList<>();

		a.add(23);
		a.add(65);
		a.add(87);
		a.add(65);
		a.add(98);
		a.add(23);

		// Using In-Built method to remove duplicate
		List<Integer> c = a.stream().distinct().toList();
		System.out.println(c);

		// Using set to remove duplicate
		Set<Integer> s = new HashSet<>();
		s.add(23);
		s.add(47);
		s.add(86);
		s.add(74);
		s.add(86);
		s.add(23);

		System.out.println(s);
		
		

	}
}