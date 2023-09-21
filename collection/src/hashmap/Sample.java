package hashmap;

import java.util.*;

public class Sample {
	public static void main(String[] args) {
		HashMap<String, Long> PhoneBook = new HashMap<>();

		PhoneBook.put("RAJA", 1234567890l);
		PhoneBook.put("RAMESH", 9987654321l);
		PhoneBook.put("AMAR", 65738936484l);
		PhoneBook.put("RAGUL", 53464787391l);

		System.out.println(PhoneBook.get("RAJA"));
		System.out.println(PhoneBook.values());
		System.out.println(PhoneBook.keySet());

		for (String a : PhoneBook.keySet()) {
			System.out.println(a);
		}

		for (String a : PhoneBook.keySet()) {
			System.out.println(PhoneBook.get(a));
		}

		for (Long b : PhoneBook.values()) {
			System.out.println(b);
		}

		PhoneBook.keySet().forEach(x -> System.out.println(x));
		PhoneBook.values().forEach(Y -> System.out.println(Y));

		PhoneBook.forEach((a, b) -> System.out.println(a + " " + b));

		PhoneBook.keySet().forEach((x) -> {
			if (x.startsWith("R")) {
				System.out.println(x);
			}
		});

		Iterator<String> itr = PhoneBook.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
         

		
	}

}
