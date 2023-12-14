package DP;

import java.util.Scanner;

public class minSquareIteration {
	
	public static int minsquare(int n) {
		
		
		int[] arr = new int[n+1];
		
		 arr[0] = 0;
		
		
		for(int i=1; i<=n; i++) {
			
			int min = Integer.MAX_VALUE;
			
			for(int j=1; j*j <= i; j++) {
				
				int currAns = arr[i-(j*j)];
				
				if(min > currAns) {
					min = currAns;
				}
			}
			
			arr[i] = 1 + min;
			
		}
		
		return arr[n];
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int sol = minsquare(n);
		
		System.out.println(sol);
		s.close();
	}

}
