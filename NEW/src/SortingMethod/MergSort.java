// Split the Array and sort the two Arrays
// Compare the smallest in two array and place that element in a new array and continue with next ele in same array and continue the step
// If any element of array is completed copy all the ele of another array in new array



package SortingMethod;

//import java.util.*;

public class MergSort {
	
	
	public static void mergArr(int[] left, int[] right, int[] arr) {
		
		int i = 0, j = 0, k = 0;
		
		while(i < left.length && j < right.length) {
			
			
			//checking which value is less in both arrays and replcing in arr
			if(left[i] < right[j]) {
				arr[k] = left[i];
				k++;
				i++;
//				break;
			}else {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		
		
		// palcing all the remaining left array in arr	
			while(i < left.length) {
				arr[k] = left[i];
				k++;
				i++;
			}
			
		// placing all the remaining right array in arr
			while(j < right.length) {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		
	
	public static void Mergsort(int arr[]) {
		if(arr.length <= 1) {
			return ;
		}
		
		int mid = (arr.length )/2;
		
		// Taking left side of arr 
		int[] left = new int[mid];
		
		//Taking right side of array
		int[] right = new int[arr.length-mid];
		
		
		// palcing left side of array values in new array
		for(int i=0; i<mid; i++) {
			left[i] = arr[i];
		}
		
		int i = 0;
		
		//palcing right idse of array in new array
		for(int k = mid; k<arr.length; k++) {
			right[i] = arr[k];
			i++;
		}
		
		Mergsort(left);
		Mergsort(right);
		mergArr(left, right, arr);
		
		
	}
	
	
	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		
//		int size = s.nextInt();
//		
//		int arr[] = new int[size];
//		
//		for(int i=0; i<size; i++) {
//			
//			arr[i] = s.nextInt();
//			
//		}
		
		int[] arr = {1,3,2,5,4,7,6,8};
		
		Mergsort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
