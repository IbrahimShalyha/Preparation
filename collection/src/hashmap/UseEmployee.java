package hashmap;

import java.util.*;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1230, "RAMU", 25, "MALE", 30000);
		Employee e2 = new Employee(1231, "SOMU", 30, "MALE", 35000);
		Employee e3 = new Employee(1232, "RAJI", 37, "FEMALE", 40000);
		Employee e4 = new Employee(1233, "LATHA", 40, "FEMALE", 30000);
		Employee e5 = new Employee(1234, "RAJA", 23, "MALE", 50000);

		HashMap<Integer, Employee> a = new HashMap<>();

		a.put(e1.getId(), e1);
		a.put(e2.getId(), e2);
		a.put(e3.getId(), e3);
		a.put(e4.getId(), e4);
		a.put(e5.getId(), e5);

		for (int i : a.keySet()) {
			System.out.println(i);
		}
		a.values().forEach(c -> System.out.println(c + " values "));

		Iterator<Integer> itr = a.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		for (Employee i : a.values()) {
			if (i.getGender().equals("MALE")) {
				System.out.println(i.getName() + " " + " GREAT");

			}
		}
		for (Employee l : a.values()) {
			if (l.getGender().equals("FEMALE")) {
				System.out.println(l.getName() + " " + " his Beautiful");
			}
		}

		Employee max = e1;
		for (Employee d : a.values()) {
			if (d.getSalary() > max.getSalary()) {
				max = d;
			}
		}
		System.out.println(max);

		Employee min = e1;
		for (Employee f : a.values()) {
			if (f.getSalary() < min.getSalary()) {
				min = f;
			}
		}
		System.out.println(min);

		for (Employee r : a.values()) {
			if (r.getAge() > 30) {
				System.out.println(r);
			}
		}

		Employee z = a.values().stream().max(Comparator.comparingInt(Employee::getSalary)).get();
//		z.forEach(x->stream().map(y->y.getSalary()== z)).System.out.println(y);
	}
}
