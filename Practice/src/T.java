import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T {
	public static void main(String[] args) throws Exception {
		T1 thread=new T1();
		thread.setPriority(10);
		thread.start();
		for(int i=0;i<10;i++)
			System.out.println("parent "+i);
	}
}

class T1 extends Thread {
public void run(){
	for(int i=0;i<10;i++){
		System.out.println("child "+i);
		if(i==2)
			Thread.yield();
	}
}
}