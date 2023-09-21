package day2class;

public class Pencil1 {
	public static void main(String[] args) {
		Pencil p1 = new Pencil();
		p1.brand = "NATARAJ";
		p1.price = 5;
		p1.ledsize = 0.7f;
		p1.led = true;
		System.out.println("brand = " + p1.brand + "\n" + "price = " + p1.price + "\n" + "ledsize = " + p1.ledsize
				+ "\n" + "led = " + p1.led);
	}
}
