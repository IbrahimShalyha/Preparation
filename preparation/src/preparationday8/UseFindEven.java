package preparationday8;

import java.util.Arrays;
import java.util.List;

public class UseFindEven {
	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(10, 50, 30, 9, 65);

		FindEvens f1 = new FindEvens();

		FindEven f2 = f1::findEven1;

		f2.findEven(a);

	}
}
