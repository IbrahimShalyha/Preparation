package statics;

import java.util.Comparator;
import java.util.List;

public class Car {
	static String brand;
	int price;
	int model;
	String color;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

//	public Car(int price, int model, String color) {
//		super();
//		this.price = price;
//		this.model = model;
//		this.color = color;
//	}


	public String toString() {
		return "price=" + price + ", model=" + model + ", color=" + color;
	}

	public static Car findcostlyCar(List<Car> cars) {
		return cars.stream().max(Comparator.comparing(Car::getPrice)).get();

	}

}
