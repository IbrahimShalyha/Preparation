package roomwork;

public class StringMax {
	public static void main(String[] args) {
		String[] name = { "BELL", "JAYA", "GUNALAN", "MATHESHWARAN" };
		String max = name[0];
		for (int i = 0; i < name.length; i++) {
			if (name[i].length() > max.length()) {
				max = name[i];
			}
		}
		System.out.println(max);
	}
}
