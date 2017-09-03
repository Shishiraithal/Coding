import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintLeftViewBinaryTree {
	public static void main(String[] args) throws Exception {
		Nod root=new Nod(12);
		root.left=new Nod(10);
		root.right=new Nod(30);
		root.right.left=new Nod(25);
		root.right.right=new Nod(40);
		leftsideview(root,1);
		System.out.println();
		rightsideview(root,1);
	}
	static int left_max_level=0;
	public static void leftsideview(Nod node,int level){
		if(node==null)
			return;
		if(left_max_level<level){
			System.out.print(node.val+" ");
			left_max_level++;
		}
		leftsideview(node.left,level+1);
		leftsideview(node.right,level+1);
	}
	static int right_max_level=0;
	public static void rightsideview(Nod node,int level){
		if(node==null)
			return;
		if(right_max_level<level){
			System.out.print(node.val+" ");
			right_max_level++;
		}
		rightsideview(node.right,level+1);
		rightsideview(node.left,level+1);
	}
}
class Nod{
	int val;
	Nod left,right;
	public Nod(int v){
		this.val=v;
		left=right=null;
	}
}
