package Test;
public class reverseString {
	
	public static String StringRev(String str) {
//		String s = str;
//		String[] strArr = s.split(str," ");
//		for(int i=0; i<strArr.length; i++) {
//			StringBuffer str1 = new StringBuffer(strArr[i]);
//			strArr[i] = str1.reverse().toString();
//		}
//		s = strArr.toString();
//		if(s == str) {
//			return "$"+str+"$";
//		}
//		return s;
		
//		StringBuffer sb = new StringBuffer();
//		for(String word : str.split(" ")) {
//			sb.append(new StringBuffer(word).reverse());
//		}
//		String reversedString = sb.toString();
//		
//		if(reversedString.equals(str)) {
//			return "$"+str+"$";
//		}
//		return reversedString;
		
		String[] strArr = str.split(" ");
		StringBuilder result = new StringBuilder();
		for(int i=0; i<strArr.length; i++) {
			StringBuilder str1 = new StringBuilder(strArr[i]);
			strArr[i] = str1.reverse().toString();
			result.append(strArr[i]);
			if(i < strArr.length - 1) {
			result.append(" ");
			}
		}
		
		String s = result.toString();
		
		if(s.equals(str)) {
			return "$"+str+"$";
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		String str = "nayan";
		
		String sol = StringRev(str);
		System.out.println(sol);
	}

}
