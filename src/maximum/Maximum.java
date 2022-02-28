package maximum;

public class Maximum {

	public static void main(String[] args) {

		calMax(20, 40, 5); // passing values to calMax method

	}

	/**
	 * method to calculate maximum no.
	 */
	public static Integer calMax(Integer a, Integer b, Integer c) {
		Integer max = a;
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
	private static void displayMax(Integer a, Integer b, Integer c, Integer max) {
		System.out.println("***********To Find Maximum number*********");
		System.out.println("The Given Values are:- \na = " + a + "\nb = " + b + "\nc = " + c);
		System.out.println("Maximum No. is: " + max);
	}

}
