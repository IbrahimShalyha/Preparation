package arraylist;

import java.util.ArrayList;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("HP", "GOLD", 60000, 2023);
		Laptop l2 = new Laptop("LENOVO", "SILVER", 50000, 2022);
		Laptop l3 = new Laptop("DELL", "BLACK", 55000, 2021);

		ArrayList<Laptop> lap = new ArrayList<>();

		lap.add(l1);
		lap.add(l2);
		lap.add(l3);
         
		for (int i = 0; i < lap.size(); i++) {
			System.out.println(lap.get(i));
		}
	
	}
}
