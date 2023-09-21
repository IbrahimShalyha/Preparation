package tuesday2908;

public class ReverseString {
	public static void main(String[] args) {
		String name = "SHAKINA IBRAHIM";

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
	}
}
