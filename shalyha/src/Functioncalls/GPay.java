package Functioncalls;

public class GPay {
	public String moneyTransfer(int num) {
		if (num < 100000) {
			return "TRANSACTION SUCCESSFUL";
		} else {
			return "TODAY LIMIT REACHED";
		}
	}
}
