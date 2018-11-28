package factorial;

public class Factorials {

	public static void main (String[] args) {
		Factorial(120);
	}
	public static int Factorial(int x) {
	for(int i = 1; x >= 1; i++ ) {
		
		if (x > 1) {
		System.out.println(x / i);
		x = (x / i);
		}
		else {
			break;
		}
		
	}
	return x;
	}
}
