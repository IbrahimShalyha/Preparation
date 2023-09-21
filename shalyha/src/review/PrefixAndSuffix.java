package review;

public class PrefixAndSuffix {
	public static void main(String[] args) {

		String[] a = { "ANU", "ANUPRIYA", "ANUGRAHA", "ANUPRABA" };

		String pref = a[1];

		for (int i = 0; i < a.length; i++) {
			while (a[i].indexOf(pref) < 0) {
				pref = pref.substring(0, pref.length() - 1);
//				System.out.println(pref);
			}
			System.out.println(pref);
		}
	}
}
