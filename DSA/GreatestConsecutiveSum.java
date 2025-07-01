public class SlidingWindow {
	public static void BruteForceMethod() {
		int arr[] = { 3, 8, 2, 5, 7, 6, 12 };
		int k = 3;
		int max = 0;
		for (int i = 0; i < arr.length - k + 1; i++) {
			int current = 0;
			for (int j = i; j < i + k; j++) {
				current = current + arr[j];
			}
			max = Math.max(max, current);
		}
		System.out.println("Maximum value is " + max);
	}

	public static void SlidingWindowPattern() {
		int arr[] = { 3, 8, 2, 5, 7, 6, 12 };
		int k = 3;

		int current = 0;
		for (int i = 0; i < k; i++) {
			current = current + arr[i];
		}
		
		int max = current;
		for (int i = 1; i < arr.length - k + 1; i++) {
			current = current - arr[i-1];
			current = current + arr[i+k-1];
			System.out.println(" Current is " + current);
			if(current > max) {
				max = Math.max(current, max);
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		BruteForceMethod();
		SlidingWindowPattern();
	}
}
