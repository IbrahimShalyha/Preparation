package Homework2;

public class Test5 {
	public static void main(String[] args) {
		char[] value = args[0].toCharArray();
		for (int i = 1; i < value.length; i = i + 2) {
			if (value.length > 0) {
				System.out.println(value[i]);
			}
		}
	}
}
