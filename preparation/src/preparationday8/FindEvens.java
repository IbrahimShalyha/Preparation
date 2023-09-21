package preparationday8;

import java.util.Arrays;
import java.util.List;

public class FindEvens {

	public void findEven1(List<Integer> a) {
		int min = a.get(0);
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) < min) {
				min = a.get(i);
//				System.out.println(min);
			}
		}
		if (min % 2 == 0) {
			System.out.println(min + " IT IS EVEN NUMBER");
		} else {
			System.out.println(min + " IT IS ODD NUMBER");
		}

	}

}
