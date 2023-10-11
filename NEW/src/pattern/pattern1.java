package pattern;

import java.util.*;

public class pattern1 {
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n-i+1; j++) {
				
				System.out.print("*");
			}
			
//			for(int k=n-i+1; k<=n; k++) {
//				
//				System.out.print(" ");
//			}
			System.out.print(" ");
			
		System.out.println();
		}
		
		s.close();
	}
	
}
