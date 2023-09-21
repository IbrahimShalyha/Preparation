package preparationday1;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArray2 {
	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		List<Integer> b = new ArrayList<>();
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);

		List<Integer> c = new ArrayList<>();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);

		List<Integer> d = new ArrayList<>();
		d.add(5);
		d.add(6);
		d.add(7);
		d.add(8);

		List<List<Integer>> nums = new ArrayList<>();
		nums.add(a);
		nums.add(b);
		nums.add(c);
		nums.add(d);

		int count = 0;

		for (int i = 0; i < nums.size(); i++) {
			List<Integer> z = nums.get(i);
			if (i < z.size()) {
				count = count + z.get(i);
			}
		}
		System.out.println(count);
	}
}
