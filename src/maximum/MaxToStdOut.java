package maximum;

public class MaxToStdOut<T extends Comparable<T>> {
	public T x, y, z;

	public MaxToStdOut(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <T extends Comparable<T>> T calMax(T... arr) {
		T max = arr[0];
		/**
		 * looping to compare each element of array till array length
		 */
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(max) > 0) {
				max = arr[i]; // high value store in max
			}
			System.out.print("\n " + arr[i]);
		}
		toPrint(max);
		return max;
	}

	/**
	 * method to print max value
	 */
	public static <T> void toPrint(T max) {
		System.out.println("\nMaximum is  " + max);
	}

	public static void main(String[] args) {
		System.out.println("Check maximum value of different data type");

		Integer intArray1[] = { 63, 74, 65, 77, 68, 62, 73 }; // Test Case 1
		Float floatArray2[] = { 4.57f, 4.45f, 4.82f, 4.29f, 4.66f, 4.49f }; // Test Case 2
		String stringArray3[] = { "Bridglabz", "Hcl", "Zoom", "Zest", "Dell" }; // Test case2
		/**
		 * calling generic method
		 */
		calMax(intArray1);
		calMax(floatArray2);
		calMax(stringArray3);
	}
}
