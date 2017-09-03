package Algos;

import java.io.*;
import java.util.*;

public class BinaryTree {
	public static void main(String[] args) {

		Node root = new Node(2);
		root.insert(1);
		root.insert(3);
		System.out.println(root.contains(4));
		System.out.println(root.contains(1));
		root.preOrder();
		System.out.println();
		root.inOrder();
		System.out.println();
		root.postOrder();

		Node root2 = new Node(2);
		root2.insert(1);
		root2.insert(3);

		System.out.println(root.sameTree(root2));
	}
}

class Node {
	int data;
	Node left, right;

	public Node(int val) {
		data = val;
	}

	public void insert(int val) {
		if (val < data) {
			// left
			if (left == null)
				left = new Node(val);
			else
				left.insert(val);
		} else {
			// right
			if (right == null)
				right = new Node(val);
			else
				right.insert(val);
		}
	}

	public boolean contains(int val) {
		if (val == data)
			return true;
		else if (val < data) {
			if (left == null)
				return false;
			else
				return left.contains(val);
		} else {
			if (right == null)
				return false;
			else
				return right.contains(val);
		}
	}

	public void inOrder() {
		if (left != null)
			left.inOrder();

		System.out.println(data);

		if (right != null)
			right.inOrder();
	}

	public void preOrder() {
		System.out.println(data);
		if (left != null)
			left.preOrder();

		if (right != null)
			right.preOrder();
	}

	public void postOrder() {
		if (left != null)
			left.postOrder();

		if (right != null)
			right.postOrder();

		System.out.println(data);
	}

	public boolean sameTree(Node root) {
		System.out.println(data+" "+root.data);
		if (root.data != data)
			return false;
		else {
			if ((left != null && root.left == null) || (right != null && root.right == null)
					|| (left == null && root.left != null) || (right == null && root.right != null))
				return false;
			else if ((left == null && root.left == null) || (right == null && root.right == null))
				return true;
			return left.sameTree(root.left) && right.sameTree(root.right);
		}
	}
}