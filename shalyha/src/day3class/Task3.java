package day3class;

public class Task3 {
	public static void main(String[] args) {

		String month = "january is the first month of the year";
		String month1 = "january is the first month of the year";
		boolean month2 = month.equals(month1);
		System.out.println(month2);

		String month3 = "JANUARY IS THE FIRST MONTH OF THE YEAR";
		boolean month4 = month.equalsIgnoreCase(month3);
		System.out.println(month4);

		String month5 = "may is the fifth month of the year";
		boolean month6 = month5.contains("the");
		System.out.println(month6);

		String month7 = "july is the seventh month of the year";
		boolean month8 = month7.startsWith("seventh");
		System.out.println(month8);

		String month9 = "september is the eigth month of the year";
		boolean month10 = month9.endsWith("ar");
		System.out.println(month10);

		String month11 = "november is the ninth month of the year";
		String month12 = month11.substring(8);
		System.out.println(month12);
	}
}
