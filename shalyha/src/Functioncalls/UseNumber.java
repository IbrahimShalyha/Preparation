package Functioncalls;

public class UseNumber {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		Number number = new Number();
		System.out.println(number.findOddEven(num));

	}
}
