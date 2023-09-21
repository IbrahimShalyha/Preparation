package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class UseChair {
	public static void main(String[] args) {
		Chair c1 = new Chair("NILKAMAL", "RED", 350);
		Chair c2 = new Chair("GURU", "BLACK", 450);

		HashMap<Integer, Chair> chairs = new HashMap<>();

		chairs.put(c1.getPrice(), c1);
		chairs.put(c2.getPrice(), c2);

		for (int i : chairs.keySet()) {
			System.out.println(chairs.get(i));
		}

		for (Chair i : chairs.values()) {
			System.out.println(i);
		}

		chairs.keySet().forEach(x -> System.out.println(chairs.get(x)));

		chairs.values().forEach(x -> System.out.println(x));

		Iterator<Chair> itr = chairs.values().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
