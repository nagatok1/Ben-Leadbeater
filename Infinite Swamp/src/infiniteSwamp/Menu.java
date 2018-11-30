package infiniteSwamp;

import java.util.Scanner;

public class Menu {
	static Scanner scan = new Scanner(System.in);
	static boolean GiveUp = false;

	public static int Menu1() {
		while (true) {
			System.out.println("Test Treasure Location X:" + (Treasure.x) + " " + "Y:" + (Treasure.y));
			System.out.println("1 - Look");
			System.out.println("2 - Dig");
			System.out.println("3 - Move");
			System.out.println("4 - Give up");
			int a = scan.nextInt();

			if (a == 1) {
				System.out.println("Look (TBC)");
			}
			if (a == 2) {
				System.out.println("Dig (TBC)");
			}
			if (a == 3) {
				System.out.println("Move (TBC)");
				Move.PlayerMove();
			}
			if (a == 4) {
				System.out.println("You Give up and Die. Crows peck your eyes out because Reasons (TBC)");
				System.exit(0);

			}
			return a;
		}
	}
}