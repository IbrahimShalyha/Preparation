package Test;

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
			System.out.println("IT IS PANGRAM");
		} else {
			System.out.println("IT IS NOT A PANGRAM");
		}
	}
}
