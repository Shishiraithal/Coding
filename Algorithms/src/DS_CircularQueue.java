import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class DS_CircularQueue {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		CircularQueue  queue = new CircularQueue(3);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		queue.enqueue(1);
		queue.display();
		pw.flush();
		pw.close();
	}
}

class CircularQueue {
	int size;
	int front = 0, rear = 0;
	int count = 0;
	int queueArray[];

	CircularQueue(int size) {
		this.size = size;
		queueArray = new int[size];

	}

	public void enqueue(int val) {
		if (count < size) {
			queueArray[front] = val;
			front = (front + 1) % size;
			count++;
		} else
			System.out.println("Queue Overflow!!");
	}

	public void dequeue() {
		if (count != 0) {
			System.out.println(queueArray[rear]);
			queueArray[rear] = 0;
			rear=(rear+1)%size;
			count--;
		}
		else
			System.out.println("Queue Underflow!!");
	}
	public void display() {
		System.out.println(Arrays.toString(queueArray)+" count: "+count+" fornt:"+front);
	}
}