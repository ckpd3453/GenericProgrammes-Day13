package maximum;

public class Refactor2Maximum {

	public static void main(String[] args) {
		Integer a = 20, b = 40, c = 35;
		Float p = 35.15f,q = 35.50f,r = 35.25f;
		String x = "BridgeLabz",y = "Hcl",z = "Accenture";

		Cal2Maximum.<Integer>calMax(a , b , c);
		Cal2Maximum.<Float>calMax(p , q , r);
		Cal2Maximum.<String>calMax(x , y , z);

	}

}
