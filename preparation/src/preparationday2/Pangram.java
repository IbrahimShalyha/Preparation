package preparationday2;

public class Pangram {
	public static void main(String[] args) {

		String a = "abcdefghijklmnopqrstuvwxyz";

		boolean c = true;

		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!a.contains(String.valueOf(ch))) {
				c = false;
			}
		}
		if (c == true) {
			System.out.println("PANGRAM");
		} else {
			System.out.println("NOT A PANGRAM");
		}
	}
}
