package dogShow;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DogShow {

	public  static void DogPosition(int mydog, int NumberofDogs) {
		IntStream.range(1, NumberofDogs + 1).forEach(
			i -> {
			if (i == mydog) {
				return;
			}
			if(i % 10 == 1) {
				System.out.print(i + "st ");
				return;
			}
			if(i % 10 == 2) {
				System.out.print(i + "nd ");
				return;
			}
			if(i % 10 == 3) {
				System.out.print(i + "rd ");
				return;
			}
			if(i % 10 == 0) {
				System.out.println(i + "th ");
				return;
			}
			else {
				System.out.print(i + "th ");
				return;
			}
		});
	}
}