package creational.singleton;

public class SingletonPattern5Enum {
	public static void main(String[] args) {
		Singleton5 obj1=Singleton5.INSTANCE;
		obj1.val=1;
		obj1.show();
		
		Singleton5 obj2=Singleton5.INSTANCE;
		obj2.val=2;
		obj1.show();
	}
}


enum Singleton5 {
	INSTANCE;
	public int val;
	public void show() {
		System.out.println("value "+val);
	}
}