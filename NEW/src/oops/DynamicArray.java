package oops;

public class DynamicArray {
	
	private int data[];
	private int nextElement;
	
	public DynamicArray() {
		data = new int[5];
		nextElement = 0;
	}
	
	void nextElement() {
		System.out.println(nextElement);
	}
	
	
	public void DoubleCapacity() {
		int temp[] = data;
		data = new int[2 * data.length];
		
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
	public void insert(int i) {
		if(nextElement == data.length) {
			
			DoubleCapacity();
			
		}
		
		data[nextElement] = i;
		nextElement++;
	}
	 
	public int size() {
		 return nextElement;
	 }
	
	public boolean isEmpty() {
		return nextElement == 0;
	}
	
	public int get(int i) {
		if(i >= nextElement) {
			return -1;
		}
		return data[i];
	}
	
}
