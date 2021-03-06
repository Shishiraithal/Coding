import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class DS_Stack {
	public static void main(String[] args) throws Exception {
		Stack stack=new Stack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.peek();
		stack.pop();
		stack.peek();
	}
}

class Stack {
	int size;
	int top = 0;
	int stackArray[];

	Stack(int size) {
		this.size = size;
		stackArray = new int[size];

	}

	public void push(int val) {
		if (top < size) {
			stackArray[top++] = val;
		} else
			System.out.println("Stack Overflow!!");
	}

	public void pop() {
		if (top > 0) {
			int tempTop=top-1;
			System.out.println(stackArray[tempTop]);
			stackArray[tempTop--] = 0;
			top--;
		} else
			System.out.println("Stack Underflow!!");
	}

	public void peek() {
		System.out.println(stackArray[top-1]);
	}
}