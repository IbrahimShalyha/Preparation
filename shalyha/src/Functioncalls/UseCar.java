package Functioncalls;

public class UseCar {
	public static void main(String[] args) {
		car cars = new car();
		cars.price = Integer.parseInt(args[0]);
		cars.taxPercentage = Integer.parseInt(args[1]);

		System.out.println(cars.findTaxAmount(cars.price, cars.taxPercentage));
	}
}
