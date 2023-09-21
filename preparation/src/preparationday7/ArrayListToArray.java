package preparationday7;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();

		a.add(2);
		a.add(5);
		a.add(7);
		a.add(11);

		Integer[] b = a.toArray(new Integer[a.size()]);
		for (Integer y : b) {
			System.out.println(y);
		}

	}

}
