package interviewprograms;

public class ReapeatedAndNonReapeatedCount {
	public static void main(String[] args) {
		String a = "bottle";

		char[] b = a.toCharArray();
		int rep = 0;
		int non = 0;

		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
					count++;
					b[j] = '0';
				}
			}
			if (count == 0 && b[i] != '0') {
				non++;
			} else {
				rep++;
			}
		}
		System.out.println(rep);
		System.out.println(non);
	}

}
