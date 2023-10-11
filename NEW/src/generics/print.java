package generics;

public class print {

	public class Motor {

	}

	public static <T> void printArray(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		Integer arr[] = new Integer[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 10;
		}
		printArray(arr);
		System.out.println();

		demo arr2[] = new demo[5];

		// String values of demo object in each index of arr2
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = new demo();
		}

		printArray(arr2);
		System.out.println();

		String arr1[] = new String[5];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = "a" + i;
		}
		printArray(arr1);

	}

}
