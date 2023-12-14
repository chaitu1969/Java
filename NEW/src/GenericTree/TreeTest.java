package GenericTree;

import java.util.Scanner;

import queues.QueueEmptyException;
import queues.QueueUsingLL;

public class TreeTest {
	
	public static int numOfNode(TreeNode<Integer> root) {
//		if(root == null) {
//			return 0;
//		}
		int count = 1;
		for(int i=0; i<root.children.size(); i++) {
			int childCount = numOfNode(root.children.get(i));
			count+=childCount;
		}
		return count;
	}
	
	public static void printTree(TreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.data+":");
		for(int i=0; i<root.children.size(); i++) {
			System.out.print(root.children.get(i).data+ " ");
		}
		System.out.println();
		for(int i=0; i<root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);

		}
		
	}
	
	public static TreeNode<Integer> TakeInput() throws QueueEmptyException {
		
		Scanner s = new Scanner(System.in);
		
		QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<TreeNode<Integer>>();
		
		System.out.print("Enter the root Data : ");
		
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		queue.enqueue(root);
		
		while(!queue.isEmpty()) {
			TreeNode<Integer> node = queue.dequeue();
			
			System.out.print("Enter num of childern for node "+node.data +" :");
			
			int n = s.nextInt();
			
			for(int i=0; i < n; i++) {
				System.out.print("Enter the " + i + " Child data for" + node.data + " : ");
				int childData = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
				node.children.add(childNode);
				queue.enqueue(childNode);
			}
			
		}
		
		return root;
		
	}
	
	public static void main(String[] args) throws QueueEmptyException {
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(1);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(5);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(6);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(7);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(8);
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		node2.children.add(node5);
//		node2.children.add(node6);
//		node2.children.add(node7);
		
		TreeNode<Integer> root = TakeInput();
		
		printTree(root);
		System.out.println("The num of Nodes in Tree : " + numOfNode(root));

	}

}
