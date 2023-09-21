package hashmap;

import java.util.*;

public class UseEmployees {
	public static void main(String[] args) {
		String[] str = args[0].split(",");
		String str1 = str[0];
		int str2 = Integer.parseInt(str[1]);
		String str3 = str[2];
		Employees emp1 = new Employees(str1, str2, str3);

		String[] btr = args[1].split(",");
		String btr1 = btr[0];
		int btr2 = Integer.parseInt(btr[1]);
		String btr3 = btr[2];
		Employees emp2 = new Employees(btr1, btr2, btr3);

		String[] ctr = args[2].split(",");
		String ctr1 = ctr[0];
		int ctr2 = Integer.parseInt(ctr[1]);
		String ctr3 = ctr[2];
		Employees emp3 = new Employees(ctr1, ctr2, ctr3);

		String[] d = args[3].split(",");
		int a = Integer.parseInt(d[0]);
		int b = Integer.parseInt(d[1]);
		int c = Integer.parseInt(d[2]);

		HashMap<Integer, Employees> empDetail = new HashMap<>();

		empDetail.put(a, emp1);
		empDetail.put(b, emp2);
		empDetail.put(c, emp3);

		for (Integer i : empDetail.keySet()) {
			System.out.println(empDetail.get(i));
		}

		for (Employees i : empDetail.values()) {
			System.out.println(i);
		}

	}
}
