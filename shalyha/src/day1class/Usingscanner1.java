package day1class;

import java.util.Scanner;

public class Usingscanner1 {
	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		System.out.println("age");
		int age = data.nextInt();
		System.out.println("phonenumber");
		long phonenumber = data.nextLong();
		System.out.println("adharnumber");
		long adharnumber = data.nextLong();
		System.out.println("height");
		float height = data.nextFloat();
		System.out.println("initial");
		char initial = data.next().charAt(0);
		System.out.println("education");
		String education = data.next();
		System.out.println("name");
		String name = data.next();
		
}
}
