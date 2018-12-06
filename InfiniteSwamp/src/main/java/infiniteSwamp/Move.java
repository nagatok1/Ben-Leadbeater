package infiniteSwamp;

public class Move {
	static int PlayerX = 0;
	static int PlayerY = 0;

	public static void PlayerMove() {
		while (true) {
			System.out.println("Which Direction would you like to move?");
			System.out.println("1 - Move North?");
			System.out.println("2 - Move East?");
			System.out.println("3 - Move South?");
			System.out.println("4 - Move West?");
			System.out.println("5 - Move To Specific Location");
			System.out.println("6 - Menu");
			int a = Menu.scan.nextInt();
			if (a == 1) {
				System.out.println("You Move North " + "X: " + (PlayerX) + "Y: " + (++PlayerY));
				Compass.Direction = "North";
				Treasure.TreasureLocation();
			}
			if (a == 2) {
				System.out.println("You Move East " + "X: " + (++PlayerX) + "Y: " + PlayerY);
				Compass.Direction = "East";
				Treasure.TreasureLocation();
			}
			if (a == 3) {
				System.out.println("You Move South " + "X: " + (PlayerX) + "Y: " + (--PlayerY));
				Compass.Direction = "South";
				Treasure.TreasureLocation();
			}
			if (a == 4) {
				System.out.println("You Move West " + "X: " + (--PlayerX) + " Y: " + (PlayerY));
				Compass.Direction = "South";
				Treasure.TreasureLocation();
			}
			if (a == 5) {
				System.out.println("Enter X: ");
				PlayerX = Menu.scan.nextInt();
				System.out.println("Enter Y: ");
				PlayerY = Menu.scan.nextInt();
				Treasure.TreasureLocation();
			}
			if (a == 6) {
				Menu.Menu1();
			}
		}
	}
}
