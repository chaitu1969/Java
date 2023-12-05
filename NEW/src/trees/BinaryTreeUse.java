package trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTreeUse {
	
	
	// Checking Tree as isBSTreturn better
	public static isBSTreturn isBSTbetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			isBSTreturn BSTreturn = new isBSTreturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return BSTreturn;
		}
		isBSTreturn left = new isBSTbetter(root.left);
		isBSTreturn right = new isBSTbetter(root.right);
		
		int min = Math.min(root.data, Math.min(left.min, right.min));
		int max = Math.max(root.data, Math.max(left.max, right.max));
		boolean isBST = true;
		
		if(left.max >= root.data ) {
			isBST = false;
		}
		if(right.min < root.data ) {
			isBST = false;
		}
		
		if(!left.isBST) {
			isBST = false;
		}
		
		if(!right.isBST) {
			isBST = false;
		}
		
		isBSTreturn ans = new isBSTreturn(min, max, isBST);
		
		return ans;
	}
	
	
	// Checking Tree as isBST
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		
		return Math.min(root.data,Math.min(leftMin, rightMin));
	}
	
	public static int maximum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int leftMax = maximum(root.left);
		int rightMax = maximum(root.right);
		
		return Math.max(root.data, Math.max(leftMax, rightMax));
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int leftMAX = maximum(root.left);
		if(leftMAX >= root.data) {
			return false;
		}
		
		int rightMIN = minimum(root.right);
		if(rightMIN < root.data) {
			return false;
		}
		boolean left = isBST(root.left);
		boolean right = isBST(root.right);
		
		return left && right;
		
		
		
			
		
	}
	
	
	// Taking input in level wise
	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter root Data : ");
		int rootData = s.nextInt();
		
		if(rootData == -1)
			return null;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		
		while(!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			System.out.print("Enter left Child of "+ front.data + " : ");
			int left = s.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> leftChid = new BinaryTreeNode<Integer>(left);
				front.left = leftChid;
				pendingChildren.add(leftChid);
			}
			System.out.print("tner the right child of "+front.data + " : ");
			int right = s.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				pendingChildren.add(rightChild);
			}
		}
		
		return root;
	}
	
	
	// Isbalanced improved version
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return  ans;
		}
		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height , rightOutput.height);
		
		if(Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;
		}
		
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}
	
	// Balanced Tree => Height of left sub tree is <=1 to height of right sub tree
	// TimeComplexity O(n * h)
	public static int Height(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		int leftHeight = Height(root.left);
		int rightHeight = Height(root.right);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null)
			return true;
		
		int leftHeight = Height(root.left);
		int rightHeight = Height(root.right);
		if(Math.abs(leftHeight - rightHeight) > 1)
			return false;
		
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);
		
		return isLeftBalanced && isRightBalanced;
	}
	
	
	// Removing leaves
	public static BinaryTreeNode<Integer> RemoveLeaves(BinaryTreeNode<Integer> root) {
		if(root == null)
			return null;
		if(root.left == null && root.right == null)
			return null;
		
		root.left = RemoveLeaves(root.left);
		root.right = RemoveLeaves(root.right);
		
		return root;
		
	}
	
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
//		BinaryTreeNode<Integer> root = TakeInputBetter(true,0,true);
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printTree(root);
		
		int count = numOfNode(root);
		System.out.println(count);
		

		
	}

}
