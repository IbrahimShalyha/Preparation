package preparationday8;

public class FindNonVowel1 {
	public static void main(String[] args) {

		String[] a = { "sun", "abc", "xyz", "bfd" };

		FindNonVowel f = x -> {
			for (int i = 0; i < a.length; i++) {
				if (a[i].contains("a") || a[i].contains("e") || a[i].contains("i") || a[i].contains("o")
						|| a[i].contains("u")) {
					continue;
				}
				System.out.println(a[i]);    
			}

		};

		f.findVowel(a);

	}
}
