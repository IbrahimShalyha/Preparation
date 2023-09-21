package day4class;

public class UseBike {
	public static void main(String[] args) {
		String[] value = args[0].split("&");

		Bike b1 = new Bike();
		b1.brand = value[0];
		b1.price = Integer.parseInt(value[1]);
		b1.colour = value[2];
		b1.model = Integer.parseInt(value[3]);
		b1.tax = Integer.parseInt(value[4]);

		System.out.println(value[2]);
		System.out.println(b1.brand);
		System.out.println(b1.price);
		System.out.println(b1.colour);
		System.out.println(b1.model);
		System.out.println(b1.tax);
	}
}
