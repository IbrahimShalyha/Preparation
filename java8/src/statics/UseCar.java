package statics;

import java.util.ArrayList;

public class UseCar {
public static void main(String[]args) {
	
	Car c1 = new Car();
	c1.brand = "BMW";
	c1.price = 350000;
	c1.model = 2018;
	c1.color = "WHITE";
	
	Car c2 = new Car();
	c2.brand = "BMW";
	c2.price = 350000;
	c2.model = 2018;
	c2.color = "WHITE";
	
	Car c3 = new Car();
	c3.brand = "JAGAUR";
	c3.price = 500000;
	c3.model = 2017;
	c3.color = "BLUE";
	
	Car c4 = new Car();
	c4.brand = "MARUTI";
	c4.price = 450000;
	c4.model = 2019;
	c4.color = "RED";
	
	ArrayList<Car> cars = new ArrayList<>();
	cars.add(c1);
	cars.add(c2);
	cars.add(c3);
	cars.add(c4);
	System.out.println(c1.brand);
	System.out.println(Car.findcostlyCar(cars).getPrice());
}
}
