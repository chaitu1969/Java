package Recusion;

public class ReplaceCharacter {
	
	public static String ReplaceChar(String s, char a, char b) {
		if(s.length() == 0) {
			return s;
		}
		
		String SmallOut = ReplaceChar(s.substring(1),a,b);
		
		if(s.charAt(0) == a) {
			return b + SmallOut;
		}else {
			return s.charAt(0) + SmallOut;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		String str = "Chaitanya";
		System.out.println(ReplaceChar(str,'a','b'));
		
	}

}
