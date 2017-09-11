package structural.bridge;

public class SamsungRemote extends Remote {

	public SamsungRemote(TV tv) {
		super(tv);
	}

	@Override
	void turnOn() {
		tv.turnOn();
	}

	@Override
	void turnOff() {
		tv.turnOff();
	}

}
