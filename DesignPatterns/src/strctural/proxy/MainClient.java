package strctural.proxy;

public class MainClient {
	public static void main(String[] args) throws Exception {
		
		Internet internet=new Proxy();
		internet.connectTo("pornhub.com");

		internet.connectTo("youtube.com");
	}
}
