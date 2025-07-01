// Binary Search NEED data to be SORTED.
// Time Complexity: 
  // Average & Worst Case: O (log n)
  // Best Case: O (1)

public class BinarySearch {
	public static int RecursiveTechnique(int[] numbers, int target, int low, int high) {
		int mid = low + (high - low) / 2;
		if (target == numbers[mid]) {
			System.out.println("Element found : " + target + " at " + mid); 
			return 0;
		} else if(target > numbers[mid]){
			RecursiveTechnique(numbers, target, mid + 1, high);
		} else 
			RecursiveTechnique(numbers, target, low, mid - 1);
		return 0;
	}

	public static int NonRecursiveTechnique(int[] numbers, int target) {
		int low = 0;
		int high = numbers.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (target == numbers[mid])
				return mid;
			else if (target > mid)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };
		int target = 40;
		int low = 0;
		int high = numbers.length - 1;
		//System.out.println(NonRecursiveTechnique(numbers, target));
		RecursiveTechnique(numbers, target, low, high);
	}
}

