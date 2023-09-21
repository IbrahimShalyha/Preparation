package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Task {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<>();
		li.add("MUTHU");
		li.add("RAJA");
		li.add("RAGU");
		li.add("NIRMA");
		li.add("SELVI");

		li.stream().filter(a -> a.startsWith("R")).forEach(x -> System.out.println(x));

		List<String> a = li.stream().filter(x -> x.endsWith("A")).collect(Collectors.toList());
		
		a.forEach(y ->System.out.println(y));
	}
}
