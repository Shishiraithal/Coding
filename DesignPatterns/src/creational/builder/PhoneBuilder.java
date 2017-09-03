package creational.builder;

public class PhoneBuilder {

	private String brand;
	private String os;
	private int cost;
	private int year;

	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setCost(int cost) {
		this.cost = cost;
		return this;
	}

	public PhoneBuilder setYear(int year) {
		this.year = year;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(this.brand, this.os, this.cost, this.year);
	}
}