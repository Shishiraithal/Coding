package strctural.proxy;

import java.util.ArrayList;

public class Proxy implements Internet{

	static ArrayList<String> blockedUrls=new ArrayList<>();
	static{
		blockedUrls.add("facebook.com");
		blockedUrls.add("gmail.com");
		blockedUrls.add("pornhub.com");
	}

	@Override
	public void connectTo(String url) {
		if(blockedUrls.contains(url)){
			System.out.println("You can't access "+url);
		}
		else
		{
			RealInternet internet=new RealInternet();
			internet.connectTo(url);
		}
	}
}
