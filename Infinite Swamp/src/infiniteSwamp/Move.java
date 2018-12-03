package infiniteSwamp;

import java.util.Scanner;

public class Move {
	static Scanner scan = new Scanner(System.in);
	static int PlayerX = 0;
	static int PlayerY = 0;

	public static void PlayerMove() {
		while (true) {
			System.out.println("1 - Move North?");
			System.out.println("2 - Move East?");
			System.out.println("3 - Move South?");
			System.out.println("4 - Move West?");
			System.out.println("5 - Menu");
			int a = scan.nextInt();
			if (a == 1) {
				System.out.println("You Move North " + "X:" + (PlayerX) + "Y:" + (++PlayerY));
				Treasure.TreasureLocation();
			}
			if (a == 2) {
				System.out.println("You Move East " + "X:" + (++PlayerX) + "Y:" + PlayerY);
				Treasure.TreasureLocation();
			}
			if (a == 3) {
				System.out.println("You Move South " + "X:" + (PlayerX) + "Y:" + (--PlayerY));
				Treasure.TreasureLocation();
			}
			if (a == 4) {
				System.out.println("You Move West " + "X:" + (--PlayerX) + "Y:" + (PlayerY));
				Treasure.TreasureLocation();
			}
			if (a == 5) {
				Menu.Menu1();
			}
		}
	}
}
