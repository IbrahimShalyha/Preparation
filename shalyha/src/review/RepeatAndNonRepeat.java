package review;

public class RepeatAndNonRepeat {
	public static void main(String[] args) {
		String word = "PROGRAMMER";
		char[] words = word.toCharArray();
		int rep = 0;
		int non = 0;
		for (int i = 0; i < words.length; i++) {
			int count2 = 0;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i] == words[j]) {
					count2++;
					words[j] = '0';
				}
			}

			if (count2 == 0 && words[i] != '0') {
				non++;
			} else {
				rep++;
			}
		}
		System.out.println(non);
		System.out.println(rep);
	}
}
