package statics;

public class UseAddition {
	public static void main(String[] args) {
		Addition a = (x, y) -> (x + y);
		System.out.println(a.calculation(10, 15));

		Addition a1 = (x, y) -> {
			if (x > y) {
				return x;
			} else {
				return y;

			}
		};

		System.out.println(a1.calculation(10, 5));

	}
}
