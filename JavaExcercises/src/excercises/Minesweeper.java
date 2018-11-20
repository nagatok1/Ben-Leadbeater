package excercises;

public class Minesweeper {

	public static void main(String[] args) {
		int array1[][] = new int[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
			array1[i][j] = (int)(Math.random() * 2);
			System.out.print(array1[i][j]);
		}
			System.out.println();
	}
}
}