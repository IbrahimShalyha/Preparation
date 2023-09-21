package interviewprograms;

public class NonDuplicate {
	public static void main(String[] args) {

		String name = "MOHAN KUMAR";

		char[] names = name.toCharArray();
		int non = 0;
		int rep = 0;
		for (int i = 0; i < names.length; i++) {
			int count = 0;
			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j]) {
					count++;
					names[j] = '0';
				}
			}
			if (count == 0 && names[i] != '0') {
				non++;
			System.out.println(names[i]);
			}
		}
	}
}
