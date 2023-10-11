package Recusion;

public class RemoveDublicates {
	
	public static String Remdub(String s) {
		if(s.length() <= 1) {
			return s;
		}
		
		if(s.charAt(0) == s.charAt(1)) {
			String smallOut = Remdub(s.substring(2));
			return ""+smallOut;
		}else {
			return s.charAt(0)+Remdub(s.substring(1));
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Remdub("abbbcddeffss"));
	}

}
