package day9class;

public class Car {
	String brand;
	String model;
	int price;
	int netPrice;

	public int findnetPrice(int tax) {
		return price + (price * tax / 100);
	}

	public void show() {
		System.out.println("BRAND = " + brand + "," + " MODEL = " + model + "," + " PRICE = " + price + ","
				+ " NETPRICE = " + netPrice);
	}
}