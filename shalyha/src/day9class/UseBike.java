package day9class;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.brand = "Honda";
		b1.price = 80000;
		b1.model = 2018;

		Bike b2 = new Bike();
		b2.brand = "Hero";
		b2.price = 85000;
		b2.model = 2020;

		Bike b3 = new Bike();
		b3.brand = "Suzuki";
		b3.price = 90000;
		b3.model = 2021;

		Bike[] b = { b1, b2, b3 };
		Bike max = b1.findmaxprice(b);
		max.show();
	}
}
