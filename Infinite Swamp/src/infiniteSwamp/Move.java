package infiniteSwamp;

import java.util.Scanner;

public class Move {
	static Scanner scan = new Scanner(System.in);
	static int x = 0;
	static int y = 0;

	public static void PlayerMove() {
		while (true) {
			System.out.println("1 - Move North?");
			System.out.println("2 - Move East?");
			System.out.println("3 - Move South?");
			System.out.println("4 - Move West?");
			System.out.println("5 - Menu");
			int a = scan.nextInt();
			if (a == 1) {
				System.out.println("You Move North " + "X:" + (x) + "Y:" + (++y));
			}
			if (a == 2) {
				System.out.println("You Move East " + "X:" + (++x) + "Y:" + y);
				Treasure.TreasureLocation();
			}
			if (a == 3) {
				System.out.println("You Move South " + "X:" + (x) + "Y:" + (--y));
			}
			if (a == 4) {
				System.out.println("You Move West " + "X:" + (--x) + "Y:" + (y));
			}
			if (a == 5) {
				Menu.Menu1();
			}
		}
	}
}
