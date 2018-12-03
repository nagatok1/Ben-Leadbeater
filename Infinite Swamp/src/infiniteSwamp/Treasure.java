package infiniteSwamp;

import java.util.Random;

public class Treasure {
	static Random rand = new Random();
	static int TreasureX = rand.nextInt((9) + 1);
	static int TreasureY = rand.nextInt((9) + 1);

	public static void TreasureLocation() {

		if (Move.PlayerX == TreasureX) {
			if (Move.PlayerY == TreasureY) {
				System.out.println("Congratulations you found the Treasure");
				System.out.println("YOU WIN!!!");
				System.exit(0);
			}
		}
	}
}
