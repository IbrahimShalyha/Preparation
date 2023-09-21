package day6class;

public class Task10 {
	public static void main(String[] args) {
		String a = "BoTTLe";
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				count = count + 1;
				System.out.println(a.charAt(i));
			}
		}
		System.out.println(count);
	}
}
