package dogShow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What position was your dog");
		int mydog = scan.nextInt();
		System.out.println("Number of Dogs in show");
		int NumberofDogs = scan.nextInt();
		
		
		DogShow.DogPosition(mydog, NumberofDogs);
		

	}

}
