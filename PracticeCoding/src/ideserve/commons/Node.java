package ideserve.commons;

import ideserve.commons.Node;

public class Node{
	public int val;
	public Node left,right;
	public Node(int val){
		this.val=val;
		left=right=null;
	}
}