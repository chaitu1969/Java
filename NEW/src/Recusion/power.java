package Recusion;

import java.util.*;

public class power {
	
	public static int pow(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int Sout = x * pow(x,n-1);
		return Sout;
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		System.out.println();
		int n = s.nextInt();
	
		System.out.println(pow(x,n));
		s.close();

	}
	
}
