package DSARecursion;

public class PrintMinInArr {
	
	public static void MinValue(int[] arr, int startIndex, int minValue) {
		
		if(startIndex == arr.length) {
			System.out.println(minValue);
			return;
		}
		
		int newMinValue = minValue;
		
		if(arr[startIndex] < newMinValue) {
			newMinValue = arr[startIndex];
		}
		
		MinValue(arr, startIndex + 1, newMinValue);
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,23,5,2,4,0,7,5,21,1};
		MinValue(arr, 0, Integer.MAX_VALUE);
		
	}

}
