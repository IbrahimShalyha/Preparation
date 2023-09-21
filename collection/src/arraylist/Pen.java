package arraylist;

public class Pen {

	private String brand;
	private int price;
	private boolean isBallPoint;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setIsBallPoint(boolean isBallPoint) {
		this.isBallPoint = isBallPoint;
	}

	public boolean getIsBallPoint() {
		return isBallPoint;
	}

	public Pen(String brand, int price, boolean isBallPoint) {
		this.brand = brand;
		this.price = price;
		this.isBallPoint = isBallPoint;
	}

	public String toString() {
		return brand + " " + price + " " + isBallPoint;
	}
}
