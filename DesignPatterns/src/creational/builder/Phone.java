package creational.builder;

public class Phone {

	private String brand;
	private String os;
	private int cost;
	private int year;

	public Phone(String brand, String os, int cost, int year) {
		this.brand = brand;
		this.os = os;
		this.cost = cost;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", os=" + os + ", cost=" + cost + ", year=" + year + "]";
	}
	
}