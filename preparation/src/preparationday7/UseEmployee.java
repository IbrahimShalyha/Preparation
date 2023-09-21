package preparationday7;

import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "IBRAHIM", 18000, "MALE");

		Employee e2 = new Employee(2, "SHALYHA", 25000, "FEMALE");

		Employee e3 = new Employee(1, "IBRAHIM", 18000, "MALE");

		Employee e4 = new Employee(4, "SELVI", 28000, "FEMALE");

		HashMap<Integer, Employee> h = new HashMap<>();
		h.put(e1.getId(), e1);
		h.put(e2.getId(), e2);
		h.put(e3.getId(), e3);
		h.put(e4.getId(), e4);

//		h.keySet().forEach(x -> System.out.println(x));

		System.out.println(e1.equals(e3));

		System.out.println(e1.getName().equals(e3.getName()));
	}
}
