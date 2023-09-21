package Homework2;

public class SubStringAndConcat {
	public static void main(String[] args) {

		String a = "TIGER";
		String b = "LION";

		String c = a.substring(0, a.length() / 2);
		String d = a.substring(a.length() / 2, a.length());

		String e = c.concat(b);
		String f = e.concat(d);

		System.out.println(f);

		System.out.println(a.indexOf(6));
	}
}
