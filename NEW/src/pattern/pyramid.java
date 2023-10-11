package pattern;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		
		// For no of lines
		
		for(int i=1; i<=N; i++) {
			
			
			// For printing spacess
			
			for(int j=0; j<= N-i; j++) {
				
				System.out.print(" ");
				
			}
			
			
			// For printing stars
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
		
		
	}

}
