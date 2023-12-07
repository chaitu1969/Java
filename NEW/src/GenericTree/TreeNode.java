package GenericTree;

import java.util.ArrayList;

public class TreeNode<T> {
	
	T data;
	ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.children = new ArrayList<TreeNode<T>>();
	}

}
