package maximum;

public class FloatMaximum {

	public static void main(String[] args) {

		calMax(45.8f, 40.5f, 50.8f); // passing values to calMax method

	}

	/**
	 * method to calculate maximum no.
	 */
	public static Float calMax(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		displayMax(a, b, c, max);
		return max;

	}

	/*
	 * method to print
	 */
	private static void displayMax(Float a, Float b, Float c, Float max) {
		System.out.println("***********To Find Maximum number*********");
		System.out.println("The Given Values are:- \na = " + a + "\nb = " + b + "\nc = " + c);
		System.out.println("Maximum No. is: " + max);
	}

}
