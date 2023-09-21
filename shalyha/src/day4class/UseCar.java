package day4class;

public class UseCar {
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.brand = args[0];
		c1.price = Integer.parseInt(args[1]);
		c1.colour = args[2];
		c1.model = Integer.parseInt(args[3]);
		c1.productionyear = Integer.parseInt(args[4]);
		c1.taxamount = Integer.parseInt(args[5]);
		c1.netprice = c1.price + c1.taxamount;

		System.out.println("BRAND = " + c1.brand);
		System.out.println("PRICE = " + c1.price);
		System.out.println("COLOUR = " + c1.colour);
		System.out.println("MODEL = " + c1.model);
		System.out.println("PRODUCTION YEAR = " + c1.productionyear);
		System.out.println("TAXAMOUNT = " + c1.taxamount);
		System.out.println("NETPRICE = " + c1.netprice);
	}
}
