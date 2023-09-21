package day9class;

public class Bike {
	String brand;
	int model;
	int price;

	public Bike findmaxprice(Bike[] bikes) {
		Bike temp = bikes[0];
		for (int i = 0; i < bikes.length; i++) {
			if (bikes[i].price > temp.price) {
				temp = bikes[i];
			}
		}
		return temp;
	}

	public void show() {
		System.out.println("BRAND = " + brand + "," + " PRICE = " + price + "," + " MODEL = " + model);
	}
}
