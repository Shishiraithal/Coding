package ideserve;

import ideserve.commons.Node;

public class LevelOrderTraversalBT {
	public static void main(String[] args) {
		Node binaryTree=new Node(1);
		binaryTree.left=new Node(2);
		binaryTree.right=new Node(3);
		binaryTree.right.left=new Node(4);
		binaryTree.right.left.left=new Node(6);
		binaryTree.right.right=new Node(5);
		/*
			1
		2			3
				4		5
			6
		*/		
		System.out.println(minDepth(binaryTree));
	}
	public static int minDepth(Node node) {
		if(node==null)
			return 0;
		if(node.left==null||node.right==null)
			return 1;
		if(node.left!=null && node.right!=null)
		{
			return 1+Math.min(minDepth(node.left),minDepth(node.right));
		}
		return Integer.MAX_VALUE;
	}
}