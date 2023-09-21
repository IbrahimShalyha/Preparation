package roomwork;

public class DuplicateLetters {
	public static void main(String[] args) {
		String name = "IBUSHALYHA";
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					System.out.println(name.charAt(i));
				}
			}
		}
	}
}
