package preparationday7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {

		Integer[] a = { 1, 5, 4, 6, 7 };

		List b = Arrays.asList(a);

//		ArrayList<Integer> c = new ArrayList<>(b);

		System.out.println(b);
	}
}