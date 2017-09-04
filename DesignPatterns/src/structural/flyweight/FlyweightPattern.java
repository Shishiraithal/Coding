package structural.flyweight;

import java.util.HashMap;

public class FlyweightPattern {
	private static HashMap<String, Player> cache = new HashMap<String, Player>();

	public static Player getPlayer(String type) {
		Player p = null;

		switch (type) {
		case "terrorist":
			if (cache.containsKey("terrorist")) {
				p = cache.get("terrorist");
			} else {
				System.out.println("Creating object for " + type + " and use this same object for future ref..");
				Player terrorist = new Terrorist();
				cache.put("terrorist", terrorist);
				p = terrorist;
			}
			break;
		case "counterterrorist":
			if (cache.containsKey("counterterrorist")) {
				p = cache.get("counterterrorist");
			} else {
				System.out.println("Creating object for " + type + " and use this same object for future ref..");
				Player counterterrorist = new CounterTerrorist();
				cache.put("counterterrorist", counterterrorist);
				p = counterterrorist;
			}
			break;
		default:
			break;
		}

		return p;
	}

}
