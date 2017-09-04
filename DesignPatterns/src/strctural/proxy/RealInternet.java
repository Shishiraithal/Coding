package strctural.proxy;

public class RealInternet implements Internet{

	@Override
	public void connectTo(String url) {
		System.out.println("Yes.. connected to "+url);
	}
}
