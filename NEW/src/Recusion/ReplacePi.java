package Recusion;

public class ReplacePi {
	
	public static String RepPi(String s) {
		if(s.length() <= 1) {
			return s;
		}
		
		if(s.charAt(0) == 'p' && s.charAt(1)=='i') {
			String smallOut = RepPi(s.substring(2));
			return " 3.14 " + smallOut;
		}else {
			return s.charAt(0) + RepPi(s.substring(1));
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(RepPi("pipiapibpicpidpi"));
	}
}
