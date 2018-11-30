package excercises;

public class Iteration {
	
	public static void main(String[] args) {
		for (int i=0; i < 10; i++)
		Sum1(i , 7, true);
	}
	
	public static void Sum1(int x, int y, boolean z) {
	if (x == 0) {
		System.out.println(y);
	}
	else if (y == 0) {
		System.out.println(x);
	}
	else if (z == true){
		System.out.println(x * y);
	}
	else {
		System.out.println(x + y);
	}
}
}