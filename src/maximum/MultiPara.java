package maximum;

public class MultiPara<T extends Comparable<T>> {
		public T x, y, z;

		public MultiPara(T x, T y, T z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		public static <T extends Comparable<T>> void TestCase5(T... arr) { // constructor
			T max = arr[0];
			/**
			 * looping to compare each element 
			 * till array length to find max value
			 */
			for (int i = 1; i < arr.length; i++) { 
				if (arr[i].compareTo(max) > 0) {
					max = arr[i]; // high value store in max
				}
				System.out.print(" " + arr[i]);
			}

			System.out.println("\nMaximum value is :" + max + "\n");
		}
		public static void main(String[] args) {
			
				System.out.println("Check maximum of three");

				Integer intArray1[] = { 33, 34, 53, 47, 68, 27, 53 }; // Test Case 1
				Float floatArray2[] = { 5.56f, 5.47f, 5.89f, 5.27f, 5.23f, 5.48f }; // Test Case 2
				String stringArray3[] = { "Hcl", "Google", "Bridgelabz", "Amazon", "Zoom" }; // Test case2

				TestCase5(intArray1); // calling generic method
				TestCase5(floatArray2);
				TestCase5(stringArray3);
		}
}
