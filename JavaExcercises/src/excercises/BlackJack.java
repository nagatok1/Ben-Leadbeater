package excercises;

public class BlackJack {

	public static void main(String[] args) {
		int num1 = (int)(1 + (Math.random() * 25));
		int num2 = (int)(1 + (Math.random() * 25));
		Deal(num1,num2);
	}
	public static void Deal(int x , int y) {
		System.out.println("Player One " + x);
		System.out.println("Player Two " + y);
		if ((x > 21) && (y>21)) {
			System.out.println("Bust");
		}
		else if ((x > 21) && (y < 21)) {
			System.out.println("Player Two Wins");
		}
		else if ((x < 21) && (y > 21)) {
			System.out.println("Player One Wins");
		}
		else if ((21 - x) < (21 - y)) {
			System.out.println("Player One Wins");
		}
		else if ((21 - x) > (21 - y)) {
			System.out.println("Player Two Wins");
		}
		else if ((21 - x) == (21 - y)) {
			System.out.println("DRAW");
		}
		else { System.out.println("Invalid Input");
		}
	}
}
