import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class ParanthesisCheck {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		String par="()(())())";
		Stack stack=new Stack(100);
		boolean fail=false;
		for(int i=0;i<par.length();i++){
			if(par.charAt(i)=='('){
				stack.push(1);
			}
			else{
				if(stack.peek()==1)
					stack.pop();
				else
					fail=true;
			}
		}
		if(fail||!stack.isEmpty()){
			System.out.println("Invalid");
		}
		else {
			System.out.println("Valid");
		}
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

	public int pop() {
		if (top > 0) {
			int tempTop=top-1;
			System.out.println(stackArray[tempTop]);
			int ret=stackArray[tempTop];
			stackArray[tempTop--] = 0;
			top--;
			return ret;
		} else
			System.out.println("Stack Underflow!!");
		return -1;
	}

	public int peek() {
		if(top-1>=0)
		return stackArray[top-1];
		else return -1;
	}
	
	public boolean isEmpty() {
		if(top<=0)
			return true;
		else
			return false;
	}
}
