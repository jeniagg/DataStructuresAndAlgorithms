package sorting;

public class QuickSort {
	public static int partition(int[] arr, int left, int right) {
		int i = left;
		int j = right;
		int pivot = (left + right) / 2;
		int temp;

		while (i <= pivot) {
			i++;
		}
		while (j >= pivot) {
			j--;
		}
		if (i <= j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return i;
	}

	public static int[] quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1) {
			quickSort(arr, left, index - 1);
		}
		if (index < right) {
			quickSort(arr, index, right);
		}
		return arr;
	}

}
