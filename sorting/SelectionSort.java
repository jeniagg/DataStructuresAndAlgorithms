package sorting;

public class SelectionSort {
	public static int[] selectionSort(int[] arr) {
		int min = arr[0];
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < min) {
					min = arr[j];
				}
			}
		}
		return arr;
	}

}
