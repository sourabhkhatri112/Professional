import java.util.Arrays;

public class QuickSort {
	public static void PerformQuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = ImplementPartition(arr, low, high);
			PerformQuickSort(arr, low, pivotIndex - 1);
			PerformQuickSort(arr, pivotIndex + 1, high);
		}
	}

	public static int ImplementPartition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low + 1;
		int j = high;
		while (i <= j) {
			while (arr[i] <= pivot)
				i++;
			while (arr[j]> pivot)
				j--;
			if (i < j)
				swap(i, j, arr);
		}
		swap(low, j, arr);
		return j;
	}

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 35, 50, 15, 25, 80, 20, 90, 45 };
		System.out.println("Array before Sort: " + Arrays.toString(arr));
		PerformQuickSort(arr, 0, arr.length - 1);
		System.out.println("Array before Sort: " + Arrays.toString(arr));
	}
}

