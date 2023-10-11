package Recusion;

import java.util.*;

public class NoDigits {
	
	static int ans = 0;
	
	public static int Numb(int n) {
		
		if(n != 0) {
			ans++;
			return Numb(n/10);
		}
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		System.out.println(Numb(n));
		s.close();
	}
}
