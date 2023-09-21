package Functioncalls;

public class car {
	int price;
	int taxPercentage;

	public int findTaxAmount(int price, int taxPercentage) {
		return (price * taxPercentage / 100);
	}
}
