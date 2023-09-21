package arraylist;

import java.util.*;

public class Laptop {
	private String brand;
	private String color;
	private int price;
	private int model;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public Laptop(String brand, String color, int price, int model) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.model = model;
	}

	public String toString() {
		return "brand=" + brand + ", color=" + color + ", price=" + price + ", model=" + model;
	}
}
