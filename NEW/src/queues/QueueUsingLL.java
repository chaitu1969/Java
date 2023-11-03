package queues;

import linkedList.Node;

public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	
	int size;
	
	public QueueUsingLL() {
		// TODO Auto-generated constructor stub
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(T ele) {
		Node<T> newNode = new Node<>(ele);
		
		if(front == null ) {
			front = newNode;
			rear = newNode;
		}else {
		rear.next = newNode;
		rear = rear.next;
		}
		size++;
	}
	
	public T front() throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
//	public T rear() {
//		return 
//	}
	
	public T dequeue()throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		T data = front.data;
		front = front.next;
		size--;
		return data;
	}

}
