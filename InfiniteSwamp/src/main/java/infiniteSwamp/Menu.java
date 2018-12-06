package infiniteSwamp;

import java.util.Scanner;

public class Menu {
	static Scanner scan = new Scanner(System.in);

	public static void Menu1() {
		while (true) {
			System.out.println("1 - Look");
			System.out.println("2 - Dig");
			System.out.println("3 - Move");
			System.out.println("4 - Compass");
			System.out.println("5 - Give up");
			int a = scan.nextInt();

			if (a == 1) {
				Terrain.TerrainLook();
				Menu1();
			}
			if (a == 2) {
				Dig.DigNow();
				Menu1();
			}
			if (a == 3) {
				Move.PlayerMove();
			}
			if (a == 4) {
				Compass.CompassDirection();
				Menu1();

			}
			if (a == 5) {
				System.out.println("You Give up and Die. Crows peck your eyes out because Reasons (TBC)");
				System.exit(0);

			}
			// Test Option Enable to know locations for testing
			/*if (a == 6) {
				System.out.println("Showing all Locations");
				System.out.println("Test Lava Location X:" + (Treasure.TreasureX) + " " + "Y:" + (Treasure.TreasureX));
				System.out.println("Test Lava Location X:" + (Terrain.LavaX) + " " + "Y:" + (Terrain.LavaY));
				System.out.println("Test Lava Location X:" + (Terrain.SwampX) + " " + "Y:" + (Terrain.SwampY));
				System.out.println("Test Lava Location X:" + (Terrain.CastleX) + " " + "Y:" + (Terrain.CastleY));
				System.out.println("Test Lava Location X:" + (Terrain.HoleX) + " " + "Y:" + (Terrain.HoleY));
				
			
			}*/
			else {
				System.out.println("******INVALID INPUT*******");
				Menu1();
			}
		}
	}
}