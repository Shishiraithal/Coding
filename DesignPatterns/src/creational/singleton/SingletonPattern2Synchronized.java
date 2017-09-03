package creational.singleton;

public class SingletonPattern2Synchronized {
	public static void main(String[] args) {
		MThread thread1=new MThread();
		MThread thread2=new MThread();
		thread1.start();
		thread2.start();
	}
}

class MThread extends Thread{
	public void run(){
		Singleton2.getInstatnce();
	}
}

class Singleton2 {

	private static Singleton2 obj = null;

	private Singleton2() {
		System.out.println("Singleton2 Instantiated");
	}
	//thread safe..with out synchronize then obj will create multiple times..cause of parallel calls..that's why should provide lock.
	/*synchronized*/ public static Singleton2 getInstatnce() {
		if (obj == null)
			obj = new Singleton2();
		return obj;
	}
}