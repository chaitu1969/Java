package Recusion;

//import java.util.*;

public class SortedArrayCheck {
	
	public static boolean CheckArray(int arr[]) {
		
		if(arr.length == 1 ) {
			return true;
		}
		if(arr[0] > arr[1]) {
			return false;
		}
		
		int smallArr[] = new int[arr.length-1];
		
		for(int i=1; i<smallArr.length; i++) {
			smallArr[i-1] = arr[i];
		}
		
		boolean isArray = CheckArray(smallArr);
		
		return isArray;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,5,4,6,7,63,7,9};
		
		System.out.print(CheckArray(arr));
	}
}
