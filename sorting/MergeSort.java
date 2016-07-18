package sorting;

import java.util.Arrays;

public class MergeSort {
	public static void merge(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			} else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < left.length) {
			arr[k] = left[i];
			k++;
			i++;
		}
		while (j < right.length) {
			arr[k] = right[j];
			k++;
			j++;
		}
	}

	public static int[] mergeSort(int[] arr) {
		int mid = arr.length / 2;
		int left = mid;
		int right = arr.length - mid;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[right];

		for (int i = 0; i < mid; i++) {
			leftArr[i] = arr[i];
		}
		for (int j = mid; j < arr.length; j++) {
			rightArr[j - mid] = arr[j];
		}
		if (arr.length == 1) {
			return arr;
		}
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(arr, leftArr, rightArr);
		return arr;

	}

}
