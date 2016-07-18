package sorting;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = {2, -20, 1, 8, 47, 0};
		
		
		System.out.println("Bubble Sort: " + Arrays.toString(BubbleSort.bubbleSort(arr)));
		System.out.println("Selection Sort: " + Arrays.toString(SelectionSort.selectionSort(arr)));
		System.out.println("Quick Sort: " + Arrays.toString(QuickSort.quickSort(arr, 0, arr.length - 1)));
	
	}
	
	
}
