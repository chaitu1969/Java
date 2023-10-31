package stacks;

public class StackUse {
	
	public static void main(String[] args) throws StackFullException, StackEmptyException {
		stackUsingArray stack = new stackUsingArray();
		
		
		int data[] = null;
		for(int i=0; i<22; i++) {
			stack.push(data[i]=i);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
//		stack.push(10);
//		stack.push(5);
//		System.out.println(stack.top());
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		System.out.println(stack.isEmpty());
	}

}
