package infiniteSwamp;

import java.util.Random;

public class Treasure {
	static Random rand = new Random();
	static int TreasureX = - 5000 + rand.nextInt(5000);
	static int TreasureY = - 5000 + rand.nextInt(5000);
	public static void TreasureLocation() {

		if ((Move.PlayerX == TreasureX) && (Move.PlayerY == TreasureY)) {
			System.out.println("Congratulations you found the Treasure");
			System.out.println("YOU WIN!!!");
			System.exit(0);
		}
	}
}
