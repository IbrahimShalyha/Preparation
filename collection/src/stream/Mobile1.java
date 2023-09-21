package stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mobile1 {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("REALME", "BLUE", 21000);
		Mobile m2 = new Mobile("REDMI", "WHITE", 20000);
		Mobile m3 = new Mobile("POCO", "GREEN", 16000);

		HashMap<Integer, Mobile> mobiles = new HashMap<>();

		mobiles.put(m1.getPrice(), m1);
		mobiles.put(m2.getPrice(), m2);
		mobiles.put(m3.getPrice(), m3);

		List<Mobile> z = mobiles.values().stream().filter(x -> x.getPrice() >= 20000).collect(Collectors.toList());

		z.forEach(x -> System.out.println(x));

		mobiles.values().stream().filter(x -> x.getBrand().equalsIgnoreCase("REDMI"))
				.forEach(x -> System.out.println(x));

		Map<Integer, Mobile> d = mobiles.values().stream().filter(x -> x.getPrice() >= 20000)
				.collect(Collectors.toMap(x -> x.getPrice(), y -> y));
		d.forEach((x, y) -> System.out.println(x + " " + y));

//		Map<Integer, Mobile> c = mobiles.keySet().stream().filter(x->x.getPrice()> 20000).collect(Collectors.toMap(x->x.getPrice(),y->y));
//		c.forEach((x,y)->System.out.println(x+" "+y));

		Map<Integer, Mobile> f = mobiles.values().stream().filter(x -> x.getColor().equalsIgnoreCase("WHITE"))
				.collect(Collectors.toMap(x -> x.getPrice(), y -> y));
		f.forEach((x, y) -> System.out.println(x + " " + y));

		long temp = mobiles.values().stream().filter(x -> x.getPrice() >= 20000).count();
		System.out.println(temp);

		Mobile max = mobiles.values().stream().max(Comparator.comparingInt(Mobile::getPrice)).get();
		System.out.println(max);
        
	}
}
