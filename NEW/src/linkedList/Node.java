package linkedList;

public class Node<T> {
	
	Node<T> next;
	T data;
	
	 Node(T data) {
		this.data = data;
		next = null;
	}

}
