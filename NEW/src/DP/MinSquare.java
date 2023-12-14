package DP;

import java.util.Arrays;
import java.util.Scanner;

public class MinSquare {
	
	public static int minSquare(int n, int[] arr) {
		
		if(n == 0) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i=1; i*i <= n; i++) {
			
			int currAns;
			
			if(arr[n-(i*i)] == -1) {
			
			 currAns = minSquare(n-(i*i),arr);
			 arr[n-(i*i)] = currAns;
			}else {
			 currAns = arr[n-(i*i)];
			}
			if(min > currAns) {
				min = currAns;
			}
		}
		
		int ans = 1 + min;
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] arr = new int[n+1];
		
		Arrays.fill(arr, -1);
		
		int sol = minSquare(n,arr);
		
		System.out.println(sol);
		
		for(int i : arr) {
			System.out.print(arr[i]+" ");
		}
		s.close();
	}

}
