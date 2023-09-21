package preparationday7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnyMatch {
	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(4);
		a.add(6);
		a.add(12);
		a.add(20);

		// ANYMATCH
		boolean z = a.stream().anyMatch(x -> (x * (x + 1)) / 4 == 5);
		System.out.println(z);

		List<String> b = new ArrayList<>();
		b.add("AMAR");
		b.add("DAVID");
		b.add("IBU");

		boolean c = b.stream().anyMatch(x -> x == "AMAR" && x == "DAVID" && x == "IBU");
		System.out.println(c);

		List<Integer> d = a.stream().sorted().toList();
		System.out.println(a);
		
		

	}
}
