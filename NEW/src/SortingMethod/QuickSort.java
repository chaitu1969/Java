// Take a Unsorted array and make any element as pivot in this case i have taken pivot as last element
// let take a pos as 0th pos - 1; 
// run loop across the array and compare the ith index element with pivot if the element is less than the pivot then swap the 
// ith element with the pos element and after completion of loop swap the pivot element with pos + 1 element

// For refernce go though the below link

// https://www.youtube.com/watch?v=PgBzjlCcFvc




package SortingMethod;

class QuickSort{
	
	public static void swap(int arr[], int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
	
	public static int partition(int arr[], int low, int high) {
		
		int pivot = arr[high];
		int pos = (low-1);
		
		for(int i=low; i<=high-1; i++) {
			if(arr[i] < pivot ) {
				pos++;
				swap(arr,pos,i);
			}
		}
		swap(arr,pos+1,high);
		return (pos+1);
		
	}
	
	
	public static void quicksort(int arr[], int low, int high) {
		
//		if(low > high) {
//			return;
//		}
		
		if(low < high) {
			int pivot = partition(arr, low, high);
			quicksort(arr,pivot+1,high);
			quicksort(arr,low,pivot-1);
			
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,8,3,9,4};
		
		quicksort(arr, 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}