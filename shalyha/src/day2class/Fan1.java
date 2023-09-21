package day2class;

public class Fan1 {
	public static void main(String[] args) {
		Fan f1 = new Fan();
		f1.brand = "USHA";
		f1.colour = "BROWN";
		f1.price = 2000;
		f1.discountamount = ((f1.price * 5) / 100);
		f1.netprice = (f1.price - f1.discountamount);

		System.out.println("BRAND = " + f1.brand + "\n" + "COLOUR = " + f1.colour + "\n" + "PRICE = " + f1.price + "\n"
				+ "DISCOUNTAMOUNT = " + f1.discountamount + "\n" + "NETPRICE = " + f1.netprice);

	}
}
