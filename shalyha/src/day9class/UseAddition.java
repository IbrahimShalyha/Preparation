package day9class;

public class UseAddition {
	public static void main(String[] args) {
		Addition a = new Addition();
		a.num1 = 50;
		a.num2 = 70;

		System.out.println(a.add());
		System.out.println(a.addWithParameter(36, 63));
		a.addWithoutParameter();
		a.addvoidWithParameter(12, 34);
	}
}
