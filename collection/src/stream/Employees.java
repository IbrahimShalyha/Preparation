package stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employees {
	public static void main(String[] args) {
		Employee emp1 = new Employee("SURESH", 102, 35000, "JAVA", "DEVELOPER");
		Employee emp2 = new Employee("RAMESH", 103, 45000, "PYTHON", "DEVELOPER");
		Employee emp3 = new Employee("DINESH", 104, 55000, "HTML", "DEVELOPER");
		Employee emp4 = new Employee("KAMESH", 105, 85000, "CSS", "DEVELOPER");
		Employee emp5 = new Employee("LOKESH", 106, 35000, "AGILE", "DEVELOPER");
		Employee emp6 = new Employee("GURESH", 107, 65000, "JAVA", "DEVELOPER");

		HashMap<Integer, Employee> a = new HashMap<>();
		a.put(emp1.getId(), emp1);
		a.put(emp2.getId(), emp2);
		a.put(emp3.getId(), emp3);
		a.put(emp4.getId(), emp4);
		a.put(emp5.getId(), emp5);
		a.put(emp6.getId(), emp6);

//		Map<Integer, Employee> z = a.values().stream().filter(x -> x.getCodingLang().equalsIgnoreCase("JAVA"))
//				.collect(Collectors.toMap(x -> x.getId(), y -> y));
//		z.forEach((x, y) -> System.out.println(x + " " + y));
//		z.values().forEach(y -> System.out.println(y));
//
//		Map<Integer, Employee> v = a.keySet().stream().filter(x -> a.get(x).getCodingLang().equalsIgnoreCase("PYTHON"))
//				.collect(Collectors.toMap(x -> x, y -> a.get(y)));
//		v.forEach((x, y) -> System.out.println(x + " " + y));

//		List<String> u = a.values().stream().filter(x -> x.getSalary() > 50000).map(x -> x.getName())
//				.collect(Collectors.toList());
//		u.forEach(x -> System.out.println(x));
//
//		Long temp = a.values().stream().filter(x -> x.getSalary() > 50000).count();
//		System.out.println(temp);
//
		Employee max = a.values().stream().max(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(max);

		Integer maxs = a.values().stream().min(Comparator.comparingInt(Employee::getSalary)).map(y -> y.getSalary())
				.get();
		System.out.println(maxs);

//		Employee 
//		Map<Integer, Employee> z = a.values().stream().filter(x -> x.getCodingLang().equalsIgnoreCase("PYTHON"))
//				.collect(Collectors.toMap(x -> x.getId(), y -> y));
//		z.forEach((x, y) -> System.out.println(x + " " + y));

//		Map<Integer, Employee> l = a.values().stream().sorted(Comparator.comparingInt(Employee::getPrice).reversed()).forEach(x->System.out.println(x));
	}
}