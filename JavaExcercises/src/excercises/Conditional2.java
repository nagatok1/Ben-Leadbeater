package excercises;

public class Conditional2 {
	
	public static void main(String[] args) {
		Sum1(5 , 0, "multiply");
	}
	
	public static void Sum1(int x, int y, String z) {
	if (x == 0) {
		System.out.println(y);
	}
	else if (y == 0) {
	System.out.println(x);
	}
	else if (z == "multiply"){
		System.out.println(x * y);
	}
	else {
		System.out.println(x + y);
	}
}
}