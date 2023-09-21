package Functioncalls;

public class UseGmail {
	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];

		Gmail gmail = new Gmail();
		gmail.getLogin(a, b);
	}
}
