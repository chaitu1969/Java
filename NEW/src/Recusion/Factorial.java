package Recusion;

public class Factorial {
	
	public static int fact(int n) {
		
		if(n == 0) {
			return 1;
		}
		int smallout = fact(n-1);
		int sol = n * smallout;
		
		return sol;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(fact(5));
	}

}
