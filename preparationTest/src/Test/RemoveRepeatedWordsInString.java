package Test;

public class RemoveRepeatedWordsInString {
	public static void main(String[] args) {
		String a = "THIS IS MY COUNTRY AND THIS IS MY STATE";

		String[] b = a.split(" ");

		for (int i = 0; i < b.length; i++) {
			int c = 0;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].equalsIgnoreCase(b[j])) {
					c++;
					b[j] = "0";
				}
			}
			if (c >= 0 && b[i] != "0") {
				System.out.println(b[i]);
			}
		}
	}
}
