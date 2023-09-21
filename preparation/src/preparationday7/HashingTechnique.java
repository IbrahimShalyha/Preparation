package preparationday7;

import java.util.HashMap;

public class HashingTechnique {
	public static void main(String[] args) {

		HashMap<Integer, String> a = new HashMap<>(10);

		a.put(101, "IBU");
		a.put(104, "SHA");
		a.put(1001, "IBUSHA");
		a.put(0, "AMAR");

		for (Integer x : a.keySet()) {
			System.out.println(x.hashCode() % 10 + " " + x + " " + a.get(x));
		}

		HashMap<String, String> b = new HashMap<>();
		b.put("SOL", "DAVID");
		b.put("SAL", "KUTTY");
		b.put("SEL", "BALA");
		b.put("SOL", "BALU");

		for (String y : b.keySet()) {
			System.out.println(y.hashCode() % 16 + " " + y + " " + b.get(y));
		}
	}
}