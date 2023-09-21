package day2class;

public class Fridge1 {
	public static void main(String[] args) {
		Fridge f1 = new Fridge();
		f1.brand = "SAMSUNG";
		f1.price = 15000;
		f1.colour = "VIOLET";
		f1.model = 2016;
		f1.discountamount = ((f1.price * 7) / 100);
		f1.netprice = (f1.price - f1.discountamount);

		System.out.println("BRAND = " + f1.brand + "\n" + "PRICE" + f1.price + "\n" + "COLOUR = " + f1.colour + "\n"
				+ "MODEL = " + f1.model + "\n" + "DISCOUNTAMOUNT = " + f1.discountamount + "\n" + "NETPRICE = "
				+ f1.netprice);
	}
}
