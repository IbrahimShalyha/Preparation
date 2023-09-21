package day2class;

public class Watch1 {
	public static void main(String[] args) {
		Watch w1 = new Watch();
		w1.brand = "SONATA";
		w1.colour = "BLACK";
		w1.price = 600;
		System.out.println(w1.brand + "\n" + w1.colour + "\n" + w1.price);

		Watch w2 = new Watch();
		w2.brand = "FASTRACK";
		w2.colour = "SILVER";
		w2.price = 1200;
		System.out.println(w2.brand + "\n" + w2.colour + "\n" + w2.price);
	}
}
