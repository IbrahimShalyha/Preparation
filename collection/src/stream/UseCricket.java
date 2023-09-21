package stream;

import java.util.*;
import java.util.stream.*;

public class UseCricket {
	public static void main(String[] args) {
		Cricket c1 = new Cricket(7, "DHONI", 85, "BATSMAN");
		Cricket c2 = new Cricket(10, "SACHIN", 100, "BATSMAN");
		Cricket c3 = new Cricket(18, "VIRAT", 90, "BATSMAN");
		Cricket c4 = new Cricket(48, "ADAM GILCHRIST", 76, "BATSMAN");
		Cricket c5 = new Cricket(88, "BUMRAH", 48, "BOWLER");
		Cricket c6 = new Cricket(12, "ASHWIN", 40, "BOWLER");
		Cricket c7 = new Cricket(19, "SIRAJ", 30, "BOWLER");

		ArrayList<Cricket> li = new ArrayList<>();
		li.add(c1);
		li.add(c2);
		li.add(c3);
		li.add(c4);
		li.add(c5);
		li.add(c6);
		li.add(c7);

//		Set<Cricket> z = li.stream()
//				.filter(x -> x.getPlayerScore() > 50 && x.getPlayerRoll().equalsIgnoreCase("BATING"))
//				.collect(Collectors.toSet());
//		z.forEach(x -> System.out.println(x));
//
//		li.stream().filter(x -> x.getJerseyNo() > 40).forEach(x -> System.out.println(x));

//		li.stream().sorted(Comparator.comparingInt(Cricket::getPlayerScore).reversed())
//				.forEach(x -> System.out.println(x));

		Cricket z = li.stream().max(Comparator.comparingInt(Cricket::getPlayerScore)).get();
		System.out.println(z);

//		Integer z = li.stream().max(Integer::compare).get();
	}
}