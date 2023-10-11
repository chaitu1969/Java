package Recusion;

public class FirstNnaturalNum {
	
	public static void sol(int n){
		if(n >1 ) {
			sol(n-1);
		}
		System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		sol(5);
	}

}
