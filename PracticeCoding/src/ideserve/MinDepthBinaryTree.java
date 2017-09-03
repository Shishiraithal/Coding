package ideserve;

import java.util.LinkedList;
import java.util.Queue;

import ideserve.commons.Node;

public class MinDepthBinaryTree {
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
		getLevelOrderTraversal(binaryTree);
	}
	public static void getLevelOrderTraversal(Node node) {
		if(node == null)
			System.out.println("No nodes are in TREE");
		else{
			Queue<Node> queue = new LinkedList<Node>();
			queue.offer(node);
			queue.offer(null);
			int level=1;
			while(queue.size()!=0){
				Node currentNode=queue.remove();
				if(currentNode==null&&queue.peek()==null)//checking continuous two nodes are null to break
					break;
				if(currentNode==null){
					queue.offer(null);
					System.out.println("Level "+level+" : ");
				}
				else{
					System.out.println(currentNode.val+" ");
					//check left child
					if(currentNode.left!=null){
						queue.offer(currentNode.left);
					}
					//check right child
					if(currentNode.right!=null){
						queue.offer(currentNode.right);
					}
				}
			}
		}
	}
}