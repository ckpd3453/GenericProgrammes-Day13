package maximum;

public class StringsMaximum {

	public static void main(String[] args) {

		calMax("Bittu","John","Priya"); // passing values to calMax method

	}

	/**
	 * method to calculate maximum no.
	 */
	public static String calMax(String a, String b, String c) {
		String max = a;
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
	private static void displayMax(String a, String b, String c, String max) {
		System.out.println("***********To Find Maximum number*********");
		System.out.println("The Given Values are:- \na = " + a + "\nb = " + b + "\nc = " + c);
		System.out.println("Maximum No. is: " + max);
	}

}
