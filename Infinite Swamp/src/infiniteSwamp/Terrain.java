package infiniteSwamp;

import java.util.Random;

public class Terrain {
	static Random rand = new Random();
	static int LavaX = - 50 + rand.nextInt((49) + 1);
	static int LavaY = - 50 + rand.nextInt((49) + 1);
	static int SwampX = - 50 + rand.nextInt((49) + 1);
	static int SwampY = - 50 + rand.nextInt((49) + 1);
	static int CastleX = - 50 + rand.nextInt((49) + 1);
	static int CastleY = - 50 + rand.nextInt((49) + 1);
	static int HoleX = - 50 + rand.nextInt((49) + 1);
	static int HoleY = - 50 + rand.nextInt((49) + 1);

	public static void TerrainLook() {
		if (Move.PlayerX == LavaX) {
			if (Move.PlayerY == LavaY) {
				System.out.println("You look around and see rivers of lava. You begin sweating due to the immense heat");
				Menu.Menu1();
			}
		}
		if (Move.PlayerX == SwampX) {
			if (Move.PlayerY == SwampY) {
				System.out.println("You look around to find you are in a giant swamp littered with the remains of those who came before you");
				Menu.Menu1();
			}
		}
		if (Move.PlayerX == CastleX) {
			if (Move.PlayerY == CastleY) {
				System.out.println("In front of you towers an enormous castle. Although looking abandoned it still cuts an imposing figure");
				Menu.Menu1();
			}
		}
		if (Move.PlayerX == HoleX) {
			if (Move.PlayerY == HoleY) {
				System.out.println("You look into the hole but you cannot see the bottom");
				Menu.Menu1();
			}
		}
		else {
			System.out.println("You look around to see only a barren landscape");
			Menu.Menu1();
		}
	}
}