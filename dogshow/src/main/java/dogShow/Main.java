package dogShow;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		DogShow Dogshow = new DogShow();
		System.out.println("What position was your dog");
		Scanner scan = new Scanner(System.in);
		int mydog = scan.nextInt();
		System.out.println("Number of Dogs in show");
		int NumberofDogs = scan.nextInt();
		//Stream<Long> Doggo = Stream.iterate(1L, i -> i + 1).limit(NumberofDogs);
		//Stream<Integer> Doggo = Stream.iterate(mydog -> (DogShow.DogPosition(mydog), ).limit(NumberofDogs);
		DogShow.DogPosition(mydog, NumberofDogs);
		

	}

}
