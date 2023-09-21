package testday3;

public class Q12 {
	public static void main(String[] args) {
		String value = "java&PYTHON&CH+";
		String value1 = "java";
		String value2 = "PYTHON";
		String value3 = "CH+";
		String[] value4 = value.split("[a]");
		int value5 = value1.length();
		int value6 = value2.length();
		int value7 = value3.length();
		String value8 = value2.toLowerCase();
		String value9 = value3.toLowerCase();

		System.out.println("VALUE1 = " + value4[0]);
		System.out.println("VALUE = " + value5);
		System.out.println("VALUE = " + value6);
		System.out.println("VALUE = " + value7);
		System.out.println("VALUE = " + value8);
		System.out.println("VALUE = " + value9);

	}
}
