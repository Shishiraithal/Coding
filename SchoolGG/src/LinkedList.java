import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class LinkedList {
	public static void main(String[] args) throws Exception {

		/*Node head = null;
		for(int i=0;i<5;i++){
			Node temp=new Node(i);
			temp.next=head;
			head=temp;
		}*/
		Node head = null;
		for(int i=0;i<5;i++){
			Node temp=new Node(i);
			head.next=temp;
			//head=temp;
		}
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
		
		
	}
}
class Node{
	int val;
	Node next;
	Node(int v){
		val=v;
		next=null;
	}
}
