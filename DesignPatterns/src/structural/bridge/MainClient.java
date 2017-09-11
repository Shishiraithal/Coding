package structural.bridge;

public class MainClient {
	public static void main(String[] args) throws Exception {
		Remote samsungRemote = new SamsungRemote(new SamsungTV());
		samsungRemote.turnOn();
		samsungRemote.turnOff();
		Remote sonyRemote = new SonyRemote(new SonyTV());
		sonyRemote.turnOn();
		sonyRemote.turnOff();
	}
}
