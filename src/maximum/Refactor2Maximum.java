package maximum;

public class Refactor2Maximum {

	public static void main(String[] args) {
		Integer a = 20, b = 40, c = 35;
		Float p = 35.15f,q = 35.50f,r = 35.25f;
		String x = "BridgeLabz",y = "Hcl",z = "Accenture";

		CalMaximum.<Integer>calMax(a , b , c);
		CalMaximum.<Float>calMax(p , q , r);
		CalMaximum.<String>calMax(x , y , z);

	}

}
