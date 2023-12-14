package DP;


// Longest common subsequence
public class LCS {
	
	
	// Memorization Approach
	public static int LcsMemorization(String s, String t, int i, int j, int[][] arr) {
		
		if( i == s.length() || j == t.length()) {
			return 0;
		}
		
		int sol ;
		
		if(s.charAt(i) == t.charAt(j)) {
			
			int tempAns;
			
			if(arr[i+1][j+1] == -1) {
				
				 tempAns = LcsMemorization(s, t, i+1, j+1, arr);
				arr[i+1][j+1] = tempAns;
				return sol = tempAns + 1;
				
			}else {
				tempAns = arr[i+1][j+1];
			}
			
			sol = tempAns + 1;
			
		} else {
			
			int IgnoreA, IgnoreB;
			
			if(arr[i+1][j] == -1) {
				IgnoreA = LcsMemorization(s, t, i+1, j, arr);
				arr[i+1][j] = IgnoreA;
			} else {
				IgnoreA = arr[i+1][j];
			}
			
			if(arr[i][j+1] == -1) {
				IgnoreB = LcsMemorization(s, t, i, j+1, arr);
				arr[i][j+1] = IgnoreB;
			}else {
				IgnoreB = arr[i][j+1];
			}
			
			sol = Math.max(IgnoreA, IgnoreB);
			
		}
		
		return sol;
		
	}
	
	
	
	// Recursive approach
	public static int lcsRecursive(String s, String t, int i, int j) {
		
		if( i == s.length() || j == t.length()) {
			return 0;
		}
		int sol;
		
		 if(s.charAt(i) == t.charAt(j)) {
			 int ans = lcsRecursive(s, t, i+1, j+1);
			 return sol = ans + 1;
		 }else {
			int ignoreA = lcsRecursive(s, t, i+1, j);
			int ignoreB = lcsRecursive(s, t, i, j+1);
			
			sol = Math.max(ignoreA, ignoreB);
		}
		 return sol;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
