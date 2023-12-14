package DP;

import java.util.Arrays;

public class MinCostPath {
	
	
	public static int minCostIterative(int[][] input) {
		
		int m = input.length;
		int n = input[0].length;
		
		int[][] dp = new int[m+1][n+1];
		
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input.length; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i=m-1; i>=0; i--) {
			
			for(int j = n-1; j>=0; j--) {
				
				if(i == m-1 && j == n-1) {
					dp[i][j] = input[i][j];
					continue;
				}
				
				int ans1 = dp[i][j+1];
				int ans2 = dp[i+1][j];
				int ans3 = dp[i+1][j+1];
				
				dp[i][j] = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
			}
			
		}
		return dp[0][0];
	}
	
	
	public static int minCostPath(int[][] input, int row, int col) {
		
		if(row >= input.length || col >= input[0].length) {
			return Integer.MAX_VALUE;
		}
		
		if(row == input.length-1 && col == input[0].length-1) {
			return input[row][col];
		}
		
		int right = minCostPath(input, row, col+1);
		int down = minCostPath(input, row+1, col);
		int diagnol = minCostPath(input, row+1, col+1);
		
		return input[row][col] + Math.min(right, Math.min(down, diagnol));
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[][] input = {{1,2,3},{1,2,3},{1,2,3}};
		
		int sol = minCostIterative(input);
		
		System.out.println(sol);
		
	}

}
