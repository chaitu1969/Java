package trees;
import java.util.Scanner;
public class BinaryTreeUse {
	
	// Finding the number if leafs
	public static int numOfLeaves(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		return numOfLeaves(root.left) + numOfLeaves(root.right);
	}
	
	
	// Finding the num of nodes with grater than x
	
	public static int numGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return 0;
		}
		
		int count = 0;
		
		if(root.data > x) {
			count++;
		}
		
		int leftRoot = numGreaterThanX(root.left, x);
		int rightRoot = numGreaterThanX(root.right, x);
		
		return count + leftRoot + rightRoot;
	}
	
	// Finding the larget number in tree
	public static int LargeNum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return -1;
		}
		int largeLeft = LargeNum(root.left);
		int largeRight = LargeNum(root.right);
		return Math.max(root.data, Math.max(largeLeft,largeRight));
		
	}
	
	
	// Printing tree traversal in postOrder
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data);
	}
	
	
	// Printing tree traversal in preOrder
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	
	// Sum of all root data
	
	public static int rootSum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int rootData = root.data;
		int leftRoot = rootSum(root.left);
		int rightRoot = rootSum(root.right);
		
		return rootData + leftRoot + rightRoot;
	}
	
	
	// To find the num of nodes
	
	public static int numOfNode(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int leftNodeCount = numOfNode(root.left);
		int rightNodeCount = numOfNode(root.right);
		
		return 1 + leftNodeCount + rightNodeCount;
		
	}
	
	
	// taking input with details of each node i.e take left node data and right node data
	
	public static BinaryTreeNode<Integer> TakeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
		
		if(isRoot) {
		System.out.print("Enter the Root data : ");
		} else if(isLeft) {
			System.out.print("Enter left child of "+ parentData +" : ");
		} else {
			System.out.print("Enter the right child of "+parentData + " : ");
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		BinaryTreeNode<Integer> leftChild = TakeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = TakeInputBetter(false, rootData, false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
		
	}
	
	public static BinaryTreeNode<Integer> TakeInput() {
		System.out.println("Enter the data : ");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		BinaryTreeNode<Integer> leftChild = TakeInput();
		BinaryTreeNode<Integer> rightChild = TakeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root;
		
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		// BaseCase
		if(root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ",");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		printTree(root.left);
		printTree(root.right);
//		if(root.left != null) {
//		printTree(root.left);
//		}
//		if(root.right != null) {
//		printTree(root.right);
//		}
	}
	
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//		root.left = rootLeft;
//		BinaryTreeNode<Integer> rootRight= new BinaryTreeNode<>(3);
//		root.right = rootRight;
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
//		
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft;
		BinaryTreeNode<Integer> root = TakeInputBetter(true,0,true);
		
		printTree(root);
		
		int count = numOfNode(root);
		System.out.println(count);
		

		
	}

}
