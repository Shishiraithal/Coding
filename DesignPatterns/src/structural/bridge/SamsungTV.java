package structural.bridge;

public class SamsungTV implements TV{

	@Override
	public void turnOn() {
		System.out.println("Turning on ... samsung tv");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off ... samsung tv");		
	}

}
