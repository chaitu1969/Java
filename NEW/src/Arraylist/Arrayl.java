package Arraylist;

import java.util.ArrayList;

public class Arrayl {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(20);
		
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.remove(1);
		arr.add(4);
		arr.add(6);
		System.out.println(arr.size());
		System.out.println(arr.get(1));
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+ " ");
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
