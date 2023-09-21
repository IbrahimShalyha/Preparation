package day2class;

public class Laptop1 {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.brand = "HP";
		l1.colour = "GOLD";
		l1.price = 63000;
		l1.taxamount = ((63000 * 13) / 100);
		l1.netprice = (l1.price + l1.taxamount);
		System.out.println("brand = " + l1.brand + "\n" + "colour = " + l1.colour + "\n" + "price = " + l1.price + "\n"
				+ "taxamount = " + l1.taxamount + "\n" + "netprice = " + l1.netprice);
	}
}
