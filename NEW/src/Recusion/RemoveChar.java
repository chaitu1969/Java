package Recusion;

public class RemoveChar {
	
	public static String removeChar(String s, char c) {
		
		if(s.length() == 0) {
			return s;
		}
		
		String smallOut = removeChar(s.substring(1),c);
		
		if(s.charAt(0) == c) {
			return ""+smallOut;
		}else {
			return s.charAt(0) + smallOut;
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(removeChar("chaitanya",'a'));
		
	}

}
