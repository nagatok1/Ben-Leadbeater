package infiniteSwamp;

import java.util.Random;

public class Terrain {
	static Random rand = new Random();
	static int LavaX = - 5000 + rand.nextInt(5000);
	static int LavaY = - 5000 + rand.nextInt(5000);
	static int SwampX = - 5000 + rand.nextInt(5000);
	static int SwampY = - 5000 + rand.nextInt(5000);
	static int CastleX = - 5000 + rand.nextInt(5000);
	static int CastleY = - 5000 + rand.nextInt(5000);
	static int HoleX = - 5000 + rand.nextInt(5000);
	static int HoleY = - 5000 + rand.nextInt(5000);

	public static void TerrainLook() {
		
		if ((Move.PlayerX == LavaX) && (Move.PlayerY == LavaY)){
			System.out.println("You look around and see rivers of lava. You begin sweating due to the immense heat");
		}
		
		if ((Move.PlayerX == SwampX) && (Move.PlayerY == SwampY)){
			System.out.println("You look around to find you are in a giant swamp littered with the remains of those who came before you");
		}
		
		if ((Move.PlayerX == CastleX) && (Move.PlayerY == CastleY)) {
			System.out.println("In front of you towers an enormous castle. Although looking abandoned it still cuts an imposing figure");
		}
		
		if ((Move.PlayerX == HoleX) && (Move.PlayerY == HoleY)){
			System.out.println("You look into the hole but you cannot see the bottom");
			}
		else {
			System.out.println("You look around to see only a barren landscape");
			Menu.Menu1();
		}
	}
}