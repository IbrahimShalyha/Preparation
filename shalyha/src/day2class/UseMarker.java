package day2class;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1 = new Marker();
		m1.brand = "camlin";
		m1.price = 25;
		m1.colour = "red";
		System.out.println(m1.brand);
		System.out.println(m1.price);
		System.out.println(m1.colour);

		Marker m2 = new Marker();
		m2.brand = "bril";
		m2.price = 30;
		m2.colour = "blue";
		System.out.println(m2.brand);
		System.out.println(m2.price);
		System.out.println(m2.colour);

	}
}
