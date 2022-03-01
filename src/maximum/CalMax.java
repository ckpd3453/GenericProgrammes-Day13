package maximum;

public class CalMaximum<e extends Comparable<e>> {
	e x,y,z;

	public CalMaximum(e x, e y, e z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static <e extends Comparable<e>> e calMax(e a,e b,e c)
	{
		e max = a;
		if(b.compareTo(max)>0)
		{
			max=b;
		}
		if(c.compareTo(max)>0)
		{
			max = c;
		}
		toPrint(a,b,c,max);
		return max;
	}
	public static <e>void toPrint(e a, e b, e c, e max)
	{
		System.out.printf("\nGiven values are: %s %s %s", a, b, c);
		System.out.println("\nMaximum Value: "+max);
	}
}
