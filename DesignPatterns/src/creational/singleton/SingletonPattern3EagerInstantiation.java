package creational.singleton;

public class SingletonPattern3EagerInstantiation {
	public static void main(String[] args) {
		MT thread1=new MT();
		MT thread2=new MT();
		thread1.start();
		thread2.start();
	}
}

class MT extends Thread{
	public void run(){
		Singleton.getInstatnce();
	}
}

class Singleton {

	//static block,will create at most one object, while class loading..thread safe
	private static Singleton obj = new Singleton();

	private Singleton() {
		System.out.println("Singleton Instantiated");
	}

	public static Singleton getInstatnce() {
		return obj;
	}
}