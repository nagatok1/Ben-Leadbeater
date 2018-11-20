package excercises;

public class Conditional1 {
		
		public static void main(String[] args) {
			Sum1(5 , 7, "multiply");
		}
		
		public static void Sum1(int x, int y, String z) {
		if (z == "multiply"){
			System.out.println(x * y);
		}
		else {
			System.out.println(x + y);
		}
	}
}