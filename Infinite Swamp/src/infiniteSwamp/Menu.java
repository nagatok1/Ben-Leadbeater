package infiniteSwamp;

import java.util.Scanner;

public class Menu {
	static Scanner scan = new Scanner(System.in);
	static boolean GiveUp = false;

	public static int Menu1() {
		while (true) {
			System.out.println("Test Treasure Location X:" + (Treasure.TreasureX) + " " + "Y:" + (Treasure.TreasureY));
			System.out.println("Test Lava Location X:" + (Terrain.LavaX) + " " + "Y:" + (Terrain.LavaY));
			System.out.println("1 - Look");
			System.out.println("2 - Dig");
			System.out.println("3 - Move");
			System.out.println("4 - Compass");
			System.out.println("5 - Give up");
			int a = scan.nextInt();

			if (a == 1) {
				System.out.println("Look ");
				Terrain.TerrainLook();
			}
			if (a == 2) {
				System.out.println("***Dig Not Implemented***");
				Menu1();
			}
			if (a == 3) {
				System.out.println("Move ");
				Move.PlayerMove();
			}
			if (a == 4) {
				System.out.println("You Check your Compass");
				System.out.println("You are facing " + Compass.Direction);
				Menu1();

			}
			if (a == 5) {
				System.out.println("You Give up and Die. Crows peck your eyes out because Reasons (TBC)");
				System.exit(0);

			}
			else {
				Menu1();
			}
			return a;
		}
	}
}