package stream;

import java.util.*;
import java.util.stream.*;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();

		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		a.add(30);
		a.add(30);
		a.add(40);
		a.add(45);

		a.stream().filter(b -> b > 20).forEach(x -> System.out.println(x+"is new value"));
		
		Set<Integer> c = a.stream().filter(b -> b > 20).collect(Collectors.toSet());
		
		c.forEach(x -> System.out.println(x));
		System.out.println(c);
	}

}
