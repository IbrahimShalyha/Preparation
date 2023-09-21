package interviewprograms;

import java.util.ArrayList;

public class VowelsStream {
	public static void main(String[] args) {
		String name = "CAMEL";

		char[] names = name.toCharArray();

		ArrayList<Character> c = new ArrayList<>();

		c.add(names[0]);
		c.add(names[1]);
		c.add(names[2]);
		c.add(names[3]);
		c.add(names[4]);

		long d = c.stream().filter(x -> x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U').count();

		System.out.println(d);
	}
}
