package creational.singleton;

public class SingletonPattern1Lazy {
	public static void main(String[] args) {
		Singleton1.getInstatnce();
		Singleton1.getInstatnce();
	}
}

class Singleton1 {

	private static Singleton1 obj = null;

	private Singleton1() {
		System.out.println("Singleton Instantiated");
	}

	public static Singleton1 getInstatnce() {
		if (obj == null)
			obj = new Singleton1();
		return obj;
	}
}