package DSARecursion;

public class PrintFactorial {
	
	public static void fact2(int input, int ans) {
		
		if(input == 0 || input == 1) {
//			System.out.println(ans);
			return;
		}
		
		ans = input * ans;
		
		System.out.println(ans);
		fact2(input - 1, ans);
	}
	
	
	public static void main(String[] args) {
		
		int n = 6;
		
		fact2(n, 1);
		
	}

}
