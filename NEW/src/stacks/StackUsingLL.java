package stacks;

public class StackUsingLL {
	
	public static void main(String[] args) throws StackEmptyException {
		
		StackImplimentLL<Integer> stack = new StackImplimentLL<Integer>();
		
		for(int i=0; i<10; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
		
	}
	
