package Arraylist;

import java.util.ArrayList;

public class removeConcecutive {
	
	public static ArrayList<Integer> removeDublicates(int arr[]){
//		int temp = 0;
		ArrayList<Integer> result = new ArrayList<>();
		
//		result.add(arr[0]);
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,3,4,4,5,5,5,5,4,3};
		
		ArrayList<Integer> result = removeDublicates(arr);
		
		for(int i : result) {
			System.out.print(i +" ");
		}
		
	}
}
