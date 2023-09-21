package homework;

public class ReverseString {
	public static void main(String[] args) {
		String word = "JEEVAN";
		char[] value = word.toCharArray();
		for (int i = value.length - 1; i >= 0; i--) {
			System.out.println(value[i]);
		}
	}
}
