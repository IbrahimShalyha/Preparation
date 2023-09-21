package Functioncalls;

public class UseOneSoft {
	public static void main(String[] args) {
		boolean a = Boolean.parseBoolean(args[0]);
		OneSoft oneSoft = new OneSoft();

		System.out.println(oneSoft.lmsTest(a));
	}
}
