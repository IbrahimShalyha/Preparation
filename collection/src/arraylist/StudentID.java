package arraylist;

import java.util.*;

public class StudentID {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(10);
		li.add(25);
		li.add(30);
		li.set(1, 40);
		li.remove(3);
//		System.out.println(li);
//		System.out.println(li.get(2));
//		System.out.println(li.get(1));
//		System.out.println(li.size());

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		for (int a : li) {
//			System.out.println(a);
		}

//		li.forEach(c -> System.out.println(c));
	}
}
