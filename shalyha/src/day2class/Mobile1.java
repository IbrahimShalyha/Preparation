package day2class;

public class Mobile1 {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "REALME";
		m1.price = 21000;
		m1.colour = "blue";
		m1.productionyear = 2020;
		m1.discountamount = ((m1.price * 17) / 100);
		m1.netprice = (m1.price - m1.discountamount);
		System.out.println("brand = " + m1.brand + "\n" + "price = " + m1.price + "\n" + "colour = " + m1.colour + "\n"
				+ "productionyear = " + m1.productionyear + "\n" + "discountamount = " + m1.discountamount + "\n"
				+ "netprice = " + m1.netprice);
	}
}
