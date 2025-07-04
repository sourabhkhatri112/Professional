public class EucleidAlgorithm {
	public static void RecursiveTechnique(int num1, int num2) {
		if (num1 % num2 == 0) {
			System.out.println(num2 + " is the GCD");
			return;
		}
		RecursiveTechnique(num2, num1 % num2);
	}

	public static void LoopTechnique(int num1, int num2) {
		int div = 0;
		while (num1 % num2 != 0) {
			div = num1 % num2;
			num1 = num2;
			num2 = div;
		}
		System.out.println(num2 + " is the GCD");
	}

	public static void main(String[] args) {
		// LoopTechnique(98, 56);
		RecursiveTechnique(98, 56);

	}
}

