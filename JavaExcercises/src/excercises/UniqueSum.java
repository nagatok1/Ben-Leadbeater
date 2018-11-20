package excercises;

public class UniqueSum {

	public static void main(String[] args) {
		UniqueSum1(4 , 3 , 4);
	}
	public static void UniqueSum1(int x , int y , int z) {
		if ((x == y) && (x == z)) {
			System.out.println(0);
		}
		else if (x == y) {
			System.out.println(z);
		}
		else if (x == z){
			System.out.println(y);
		}
		else if (y == z) {
			System.out.println(x);
		}
		else {
			System.out.println(x + y + z);
		}
	}
}
