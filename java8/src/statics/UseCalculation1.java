package statics;

public class UseCalculation1 implements Calculation {
	public static void main(String[] args) {
		Calculation c1 = new UseCalculation1();

		System.out.println(c1.divide(10, 2));
		System.out.println(c1.multiply(7, 8));
	}

	public int multiply(int b, int c) {

		return b*c;
	}
}
