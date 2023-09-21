package roomwork;

public class ReverseString {
	public static void main(String[] args) {
		String name = "SHAKINA PARVEEN";

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
	}
}
