package trees;

import javax.swing.text.AbstractDocument.LeafElement;

public class BST {
	
	private BinaryTreeNode<Integer> root;
	private int size;
	
	// Search weather root exist or not
	
	private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
		
		BinaryTreeNode<Integer> root = node;
		
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}
		
		if(x < root.data) {
			return isPresentHelper(node.left, x);
		}
		
		if(x > root.data) {
			return isPresentHelper(node.right, x);
		}
		return false;
		
		
	}
	
	public boolean isPresent(int x) {
		
		return isPresentHelper(root, x);
		
	}
	
	// insert a node in Tree
	
	private static BinaryTreeNode<Integer> InsertHelper(BinaryTreeNode<Integer> root, int x){
		if(root == null) {
			BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
			return newRoot;
		}
		
		if(x >= root.data) {
			root.right = InsertHelper(root.right, x);
		}
		
		if(x < root.data) {
			root.left = InsertHelper(root.left, x);
		}
		
		return root;
	}
	
	public void insert(int x) {
		
		root = InsertHelper(root, x);
		size++;
		
	}
	
	
	
	private static BSTDeleteReturn deleteHelper(BinaryTreeNode<Integer> root, int x){
		if(root == null) {
			return new BSTDeleteReturn(null, false);
		}
		
		if(root.data < x) {
			BSTDeleteReturn newRight = deleteHelper(root.right, x);
			root.right = newRight.root;
			newRight.root = root;
			return newRight;
		}
		
		if(root.data > x) {
			BSTDeleteReturn newLeft = deleteHelper(root.left, x);
			root.left = newLeft.root;
			newLeft.root = root;
			return newLeft;
		}
		
		if(root.data == x) {
			
			// 0 child
			if(root.left == null && root.right == null) {
				return new BSTDeleteReturn(null, true);
			}
			
			//  one left child
			if(root.left != null && root.right == null) {
				return new BSTDeleteReturn(root.left, true);
			}
			// one right child
			if(root.right != null && root.left == null) {
				return new BSTDeleteReturn(root.right, true);
			}
			
			int rightMin = smallest(root.right);
			root.data = rightMin;
			BSTDeleteReturn outputRight = deleteHelper(root.right, rightMin);
			root.right = outputRight.root;
			
			return new BSTDeleteReturn(root.right, true);
			
		}
		
	}
	
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		
		return Math.max(root.data, Math.max(largestLeft, largestRight));
		
	}
	
	public static int smallest(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int smallestLeft = smallest(root.left);
		int smallestRight = smallest(root.right);
		
		return Math.min(root.data, Math.min(smallestLeft, smallestRight));
		
	}
	
	public boolean deleteData(int x) {
		BSTDeleteReturn sol = new deleteHelper(root,x);
		root = sol.root;
		if(sol.deleted) {
			size--;
		}
		return sol.deleted;
		
	}
	
	public int size(BinaryTreeNode<Integer> root) {
		return size;
	}
	
	private static void printTreeHelper(BinaryTreeNode<Integer> node) {
		
		if(node == null) {
			return;
		}
		System.out.print(node.data + ":");
		
		if(node.left != null) {
			System.out.print("L"+node.left.data+",");
		}
		if(node.right != null) {
			System.out.print("R"+node.right.data);
		}
		System.out.println();
		
		printTreeHelper(node.left);
		printTreeHelper(node.right);
	}
	
	public void printTree() {
		printTreeHelper(root);
	}
	

}
