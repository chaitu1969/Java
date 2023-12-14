package DSARecursion;

import java.util.Scanner;

public class Keypad {
	
	static String getString(int n) {
		if(n == 2) {
			return "abc";
		}
		if(n == 3) {
			return "def";
		}
		if(n == 4){
			return "ghi";
		}
		if(n == 5){
			return "kjl";
		}
		if(n == 6){
			return "mno";
		}
		if(n == 7){
			return "pqrs";
		}
		if(n == 8){
			return "tuv";
		}
		if(n == 9){
			return "wxyz";
		}
		
		return "";
	}
	
	public static String[] keypadCombinations(int input) {
		
		if(input == 0 || input == 1) {
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		String[] smallOut = keypadCombinations(input/10);
		int lastDigit = input % 10;
		String Helper = getString(lastDigit);
		String[] output = new String[smallOut.length * Helper.length()];
		
		int index = 0;
		
		for(int i=0; i<smallOut.length; i++) {
			
			for(int k=0; k<Helper.length(); k++) {
				
				output[index] = smallOut[i] + Helper.charAt(k);
				index++;
				
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = s.nextInt();
		
		String[] str = keypadCombinations(num);
		
		for(String sol : str) {
			System.out.println(sol);
		}
		s.close();
		
	}
	
}
