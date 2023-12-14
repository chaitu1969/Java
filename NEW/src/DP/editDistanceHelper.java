package DP;

public class editDistanceHelper {
	
	public static int editDistanceHelperMethod(String s, String t, int min, int m, int n){

		if(s.length() == 0){
			return t.length();
		}
		if(t.length() == 0){
			return s.length();
		}

		if(s.charAt(m) == t.charAt(n)){
			min = editDistance(s.substring(m+1), t.substring(n+1));
		}else{
			int del = editDistance(s.substring(m+1), t);
			int add = editDistance(s, t.substring(n+1));
			int mod = editDistance(s.substring(1), t.substring(1));

			min = 1 + Math.min(del, Math.min(add, mod));
		}

		return min;

	}

	public static int editDistance(String s, String t) {
		//Your code goes here

		return editDistanceHelperMethod(s, t, 0, 0, 0);
		
    }

}
