package infiniteSwamp;

import java.util.Random;

public class Treasure {
	static Random rand = new Random();
	static int x = rand.nextInt((9)+1);
	static int y = rand.nextInt((9)+1);

	public static void TreasureLocation() {

		if (Move.x == x) {
			if (Move.y == y) {
				System.out.println("Congratulations you found the Treasure");
				System.out.println("YOU WIN!!!");
				System.exit(0);
			}
		}
	}
}
