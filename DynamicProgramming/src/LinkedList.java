public class LinkedList {
	public static void main(String[] args){
		System.out.println("Hello World!!");
		
		Node a=new Node(10);
		System.out.println(a+" "+a.data+" "+a.link);
		
		Node b=new Node(12);
		System.out.println(b+" "+b.data+" "+b.link);
		
		a.link=b;
		System.out.println(a.link+" "+a.link.data);
		
		Node c=new Node(14);
		System.out.println(c+" "+c.data+" "+c.link);
		
		a.link.link=c;
		
		Node d=new Node(18);
		System.out.println(d+" "+d.data+" "+d.link);
		
		a.link.link.link=d;
		
		System.out.println(a);
		
		Node print=a;
		System.out.println(print);
		while(print!=null){
			System.out.println(print.data);
			print=print.link;
		}
		
		
		
		
	}
}
class Node{
	int data;
	Node link;
	public Node(int val){
		data=val;
	}
}