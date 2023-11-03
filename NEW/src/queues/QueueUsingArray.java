package queues;

public class QueueUsingArray {
	
	private int data[];
	// Front Index
	private int front;
	// rear index
	private int rear;
	private int size;
	
	public QueueUsingArray(){
		data = new int[5];
		
		front = -1;
		rear = -1;
	}
	
	public QueueUsingArray(int capacity){
		data = new int[capacity];
		
		front = -1;
		rear = -1;
	}
	
	public int size() {
		return size;
	}
	
	
	public boolean isEmpty() {
		return size==0;
	}
	
	
	public void enqueue(int ele) throws QueueFullException {
		
		if(size == data.length) {
//			throw new QueueFullException();
			DoubleCapacity();
		}
//		if(front == -1 ) {
//			front++;
//			data[front] = ele;
//			rear++;	
//		}else {
//			rear++;
//			data[rear] = ele;			
//		}
		
		if(size == 0) {
			front++;
		}
		rear++;
		if(rear == data.length) {
			rear = 0;
		}
		data[rear] = ele;
		size++;
	}

	private void DoubleCapacity() {
		// TODO Auto-generated method stub
		int temp[] = data;
		data = new int[2 * temp.length];
		int index = 0;
		for(int i=front; i<temp.length; i++) {
			data[index++] = temp[i];
		}
		for(int i=0; i<front-1; i++) {
			data[index++] = temp[i];
		}
		front = 0;
		rear = temp.length - 1;
	}

	public int front()throws QueueEmptyException {
		if(front == -1) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public int rear() {
		return data[rear];
	}
	
	public int dequeue() throws QueueEmptyException {
		
		if(size == 0) {
			throw new QueueEmptyException();
		}
		int sol = 0;
		if(front == -1 || front > rear) {
			return -1;
			
		}else{
		sol = data[front];
		front++;
		}
		return sol;
	}


	
	
}
