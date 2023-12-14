package DP;

import java.util.Scanner;

public class Recusrion {
	
	public static int fibbI(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		int arr[] = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		return arr[n];
	}
	
	
	
	public static int fibb(int n, int[] arr) {
		if(n==0 || n ==1) {
			return n;
		}
		
		int sol1, sol2;
		
		if(arr[n-1] == -1) {
			sol1 = fibb(n-1,arr);
			arr[n-1] = sol1;
		} else {
			sol1 = arr[n-1];
		}
		
		if(arr[n-2] == -1) {
			sol2 = fibb(n-2,arr);
			arr[n-2] = sol2;
		}else {
			sol2 = arr[n-2];
		}
		
		return sol1+sol2;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();		
		int[] arr = new int[n+1];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		int sol = fibb(n,arr);
		arr[n] = sol;
//		System.out.println(sol);
//		for(int pos : arr) {
//			System.out.print(arr[pos]+" ");
//		}
		System.out.println(fibbI(n));
		
	}

}
