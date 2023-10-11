package Recusion;

public class SumOfArray {
	
	public static int sumArr(int startIndex, int arr[]){
		if(arr.length == startIndex) {
			return 0;
		}
		
		return arr[startIndex] + sumArr(startIndex + 1, arr);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		System.out.println(sumArr(0,arr));
	}

}
