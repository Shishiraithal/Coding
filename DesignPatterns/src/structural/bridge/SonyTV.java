package structural.bridge;

public class SonyTV implements TV{

	@Override
	public void turnOn() {
		System.out.println("Turning on ... sony tv");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off ... sony tv");		
	}

}
