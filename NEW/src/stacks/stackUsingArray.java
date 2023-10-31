package stacks;

public class stackUsingArray {
	
	private int data[];
	private int topIndex;
	
	public stackUsingArray() {
		data = new int[10];
		 topIndex = -1;
	}
	
	public void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * data.length];
		
		for(int i=1; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
	
	public void push(int ele)  {
		if(topIndex == data.length-1) {
//			StackFullException e = new StackFullException();
//			System.out.println("Stack is full");
//			throw e;
			doubleCapacity();
		}
		data[topIndex+1] = ele;
		topIndex++;
	}
	
	public int size() {
		return topIndex++;
	}
	
	public boolean isEmpty() {
		return (topIndex == -1);
	}
	
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
	
	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		int ele = data[topIndex];
		topIndex--;
		return ele;
	}

}
