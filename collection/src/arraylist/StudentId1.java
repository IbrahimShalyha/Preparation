package arraylist;

import java.util.*;

public class StudentId1 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();

		a.add("BALA");
		a.add("AMAR");
		a.add("USHA");
		a.add("MUTHU");
		a.add("RAJA");
		a.add("DEVI");
		a.add("MITHU");
		a.add("KALAI");

		System.out.println(a);

		a.set(4, "SELVI");
		a.set(6, "KUTTY");

		System.out.println(a.get(4));
		System.out.println(a.get(6));

		a.remove(7);
		System.out.println(a.size());

		a.forEach(c -> System.out.println(c));

		for (String b : a) {
			System.out.println(b);
		}

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).charAt(0));
		}
		for (String b : a) {
			System.out.println(b.charAt(0));
		}
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).charAt(a.get(i).length() - 1));
		}

		int max = a.get(0).length();
		String temp = null;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).length() >= max) {
				temp = a.get(i);
			}
		}
		System.out.println(temp);
	}
}
