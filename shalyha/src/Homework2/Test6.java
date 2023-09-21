package Homework2;

public class Test6 {
	public static void main(String[] args) {
		String[] value = args[0].split(",");
		for (int i = 0; i < value.length; i++) {
			if (value[i].length() > 4) {
				System.out.println(value[i]);

			}
		}

	}
}
