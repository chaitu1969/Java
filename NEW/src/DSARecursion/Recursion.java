package DSARecursion;

import java.util.Scanner;

public class Recursion {
	
	public static void PrintSubsequence(String str, String stringSoFar) {
		
		if(str.length() == 0) {
			System.out.println(stringSoFar);
			return;
		}
		
		String SmallerInput = str.substring(1);
		PrintSubsequence(SmallerInput, stringSoFar);
		PrintSubsequence(SmallerInput, stringSoFar + str.charAt(0));
		
	}
	
	public static String[] subsequences(String input) {
		if(input.length() == 0) {
			
			// Base case
			
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		
		String[] smallOutput = subsequences(input.substring(1));
		String[] output = new String[smallOutput.length * 2];
		
		for(int i=0; i<smallOutput.length; i++) {
			output[i] = smallOutput[i];
		}
		
		for(int i=0; i<smallOutput.length; i++) {
			output[smallOutput.length + i] = input.charAt(0) + output[i];
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = s.next();
		
		System.out.println(input);
		
//		String[] out = subsequences(input);
//		
//		for(String outputString : out) {
//			System.out.println(outputString);
//		}
		PrintSubsequence(input, "");
		
		
	}

}
