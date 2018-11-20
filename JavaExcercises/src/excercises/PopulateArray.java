package excercises;

public class PopulateArray {
	
	public static void main(String[] args) {
		int MyArray[] = new int[10];
		for (int i=0; i < 10; i++)
		{
			MyArray[i] = (int)(Math.random() * 100);
			}
		for (int j=0; j < 10; j++) {
			MyArray[j] = (MyArray[j] * 100);
			System.out.println(MyArray[j]);
		}
			
	}
}