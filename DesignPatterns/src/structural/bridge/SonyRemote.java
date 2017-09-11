package structural.bridge;

public class SonyRemote extends Remote {

	public SonyRemote(TV tv) {
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
