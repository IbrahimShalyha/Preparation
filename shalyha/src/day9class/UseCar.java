package day9class;

public class UseCar {
	public static void main(String[] args) {
		Car c = new Car();
		c.brand = "BMW";
		c.price = 10000;
		c.model = "X6";
		c.netPrice = c.findnetPrice(5);
		c.show();
	}
}
