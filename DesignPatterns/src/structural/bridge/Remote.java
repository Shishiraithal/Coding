package structural.bridge;

public abstract class Remote{
	TV tv;
	public Remote(TV tv) {
		this.tv = tv;
	}
	abstract void turnOn();
	abstract void turnOff();
}
