package creational.singleton;

public class SingletonPattern4DoubleCheckLocks {
	public static void main(String[] args) {
		MT1 thread1=new MT1();
		MT1 thread2=new MT1();
		thread1.start();
		thread2.start();
	}
}

class MT1 extends Thread{
	public void run(){
		Singleton4.getInstatnce();
	}
}

class Singleton4 {

	private static Singleton4 obj = null;

	private Singleton4() {
		System.out.println("Singleton Instantiated");
	}
	//thread safe..double check is good performence wise..campared to synchronized method.
	public static Singleton4 getInstatnce() {
		if(obj==null){
			synchronized (Singleton4.class) {
				if(obj==null){
					obj=new Singleton4();
				}
			}
		}
		return obj;
	}
}