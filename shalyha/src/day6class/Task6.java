package day6class;

public class Task6 {
	public static void main(String[] args) {
		String a = "JAVA";
		String b = " ";
		for (int c = a.length() - 1; c >= 0; c--) {
			b = b + a.charAt(c);
		}
		System.out.println(b);
	}
}
