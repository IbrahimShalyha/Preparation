package hashmap;

import java.util.*;

public class UseMobile {
	public static void main(String[] args) {
		String[] str = args[0].split(",");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int d = Integer.parseInt(str[3]);
		int e = Integer.parseInt(str[4]);

		String[] z = args[1].split(",");
		Mobile m1 = new Mobile(z[0]);
		Mobile m2 = new Mobile(z[1]);
		Mobile m3 = new Mobile(z[2]);
		Mobile m4 = new Mobile(z[3]);
		Mobile m5 = new Mobile(z[4]);

		HashMap<Integer, Mobile> mobiles = new HashMap<>();
		mobiles.put(a, m1);
		mobiles.put(b, m2);
		mobiles.put(c, m3);
		mobiles.put(d, m4);
		mobiles.put(e, m5);

		for (Mobile i : mobiles.values()) {
			System.out.println(i);
		}

	}
}
