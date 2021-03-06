import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class Q {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		Queue queue=new Queue(101);
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			// code
			
			if(str[0].equals("E")){
				queue.enqueue(Integer.parseInt(str[1].trim()));
			}
			else
				queue.dequeue();
			//pw.println();
		}

		pw.flush();
		pw.close();
	}
}

class Queue {
	int size;
	int front=0,rear=0;
	int queueArray[];
	Queue(int size) {
		this.size = size;
		queueArray=new int[size];
		
	}

	public void enqueue(int val) {
		if(front<size){
			queueArray[front++]=val;
			System.out.println(front-rear);
		}
		else
			System.out.println("-1");
	}

	public void dequeue() {
		if (rear < front) {
			System.out.println(queueArray[rear]+" "+(front-rear-1));
			queueArray[rear]=0;
			rear++;
		}
		else if(rear == front){
			System.out.println(-1+" "+(0));
			queueArray[rear]=0;
		}
		else
			System.out.println(-1);
	}
}
