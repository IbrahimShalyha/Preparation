package day3class;

public class Laptop1 {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.brand = "hp";
		l1.price = 63000;
		l1.colour = "GOLD";
		l1.iswarranty = true;

		String value = l1.brand.toUpperCase();
		int value1 = l1.brand.length();
		boolean value2 = l1.brand.startsWith("D");
		char value3 = l1.brand.charAt(1);
		String value4 = l1.brand.toLowerCase();

		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

	}
}
