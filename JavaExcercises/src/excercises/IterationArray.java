package excercises;

public class IterationArray {
	
	public static void main(String[] args) {
		int a[] = {33,45,65,12,23,14,67,43,12,34};
		for (int i=0; i <= 10; i++)
		{
			Sum1(a[i] , a[i+1], false);
			if (i > 9) {
				break;
			}
		}
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