package Functioncalls;

public class UseGPay {
	public static void main(String[] args) {
		GPay gp = new GPay();
		int num = Integer.parseInt(args[0]);

		System.out.println(gp.moneyTransfer(num));
	}
}
