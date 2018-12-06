package infiniteSwamp;

import java.util.Random;

public class Treasure {
	static Random rand = new Random();
	static int TreasureX = - 50 + rand.nextInt((49) + 1);
	static int TreasureY = - 50 + rand.nextInt((49) + 1);

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
