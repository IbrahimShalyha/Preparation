package day3class;

public class Task4 {
	public static void main(String[] args) {
		String value = "december is the last month of the year";
		int value1 = value.indexOf("year");
		System.out.println(value1);

		char value2 = value.charAt(21);
		System.out.println(value2);

		char value3 = value.charAt(value.length() / 2);
		System.out.println(value3);

		int[] num = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		System.out.println(num[5]);
		System.out.println(num[6]);
		System.out.println(num[7]);
		System.out.println(num[8]);

	}
}
