package Functioncalls;

public class Gmail {
	public void getLogin(String mailName, String mailPassword) {
		if (mailName.equalsIgnoreCase("support@onesofts.in") && mailPassword.equals("onesoftTECHNOLOGY123")) {
			System.out.print("LOGIN SUCCESS");
		} else {
			System.out.print("LOGIN FAILED");
		}
	}
}
