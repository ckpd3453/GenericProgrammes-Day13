package maximum;

public class RefactorIntegerMaximum {
		
	public static void main(String[] args) {
		/**
		 * took different data types variable as input
		 */
		Integer a = 20, b = 40, c = 35;
		Float p = 35.15f,q = 35.50f,r = 35.25f;
		String x = "BridgeLabz",y = "Hcl",z = "Accenture";
		
		//Calling method
		toCal(a,b,c);
		toCal(p,q,r);
		toCal(x,y,z);
	}

	/**
	 * Method to calculate maimum value
	*/
	public static <S extends Comparable<S>> S toCal(S a,S b,S c)
	{
		S max = a;
		if(b.compareTo(max)>0)
		{
			max=b;
		}
		if(c.compareTo(max)>0)
		{
			max = c;
		}
		toPrints(max);
	}
	
	//Method to print output
	public static <S> void toPrints(S a,S b,S c,S max) {
		System.out.printf("\nGiven values are: %s %s %s", a, b, c")"
				System.out.println("\nMaximum Value: "+max);
	}
}
