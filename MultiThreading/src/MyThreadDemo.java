public class MyThreadDemo {
	public static void main(String[] args) {
		
		MyThread childThread=new MyThread();//instatiation of chil thread in main thread
		childThread.start();// should use start method to start thread.shouldn't use run method
		
		for (int i = 1; i <= 10; i++)
			System.out.println("Main Thread : " + i);
	}
}

class MyThread extends Thread {
	public void run() {
		//Job of thread
		for (int i = 1; i <= 10; i++)
			System.out.println("Child Thread : " + i);
	}
	public void run(int i){
		System.out.println("Overloaded method!!");
	}
}
