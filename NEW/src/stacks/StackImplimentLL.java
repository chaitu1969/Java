package stacks;

import linkedList.Node;

public class StackImplimentLL<T> {
	
	private Node<T> head;
	
	private int size;
	
	public StackImplimentLL() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void push(T ele) {
		Node<T> newNode = new Node<>(ele);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public T top() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public T pop()throws StackEmptyException{
		if(head == null) {
			throw new StackEmptyException();
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
}
