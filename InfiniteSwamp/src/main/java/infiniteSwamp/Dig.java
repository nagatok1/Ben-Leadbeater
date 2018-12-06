package infiniteSwamp;

public class Dig {
	static int clue = 0;

	public static void DigNow() {
		System.out.println("You Dig for Several Hours");
		int chance = Terrain.rand.nextInt((19) + 1);

		if (chance >= 10) {
			clue++;
			if (clue == 20) {
				System.out.println("YOU'VE FOUND 20 CLUES");
				System.out.println("The Teasure is located at X: " + Treasure.TreasureX + "Y: " + Treasure.TreasureY);
				System.out.println("Write it down");
				Menu.Menu1();
			}
		else
			System.out.println("YOU FOUND A CLUE! only " + (20 - clue) + " TO GO!");
			System.out.println("Treasure Clue Collected: " + clue);

		}

	}
}