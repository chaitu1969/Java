package oops;

public class DynamicArrayUse {
	
	public static void main(String[] args) {
		
		DynamicArray d = new DynamicArray();
		
		for(int i=0; i<20; i++) {
			d.insert(i+10);
		}
		
		d.nextElement();
		
		System.out.println(d.size());
		
		for(int i=0; i<=d.size(); i++) {
			System.out.print(d.get(i)+ " ");
		}
		
		
	}
	 
}
