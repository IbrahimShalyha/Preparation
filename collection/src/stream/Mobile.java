package stream;

public class Mobile {
	private String brand;
	private String color;
	private int price;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public Mobile(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public String toString() {
		return brand + " , " + color + " , " + price;
	}
}
