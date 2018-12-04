package casting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Animal> Zoo = new ArrayList<Animal>();
		Dog Bingo = new Dog("Dog", "Bingo", 45, "German Shepherd");
		Cat Lingo = new Cat("Cat", "Lingo", 10, "Tabby");
		Crow Dingo = new Crow("Crow", "Dingo", true);
		Eagle Singo = new Eagle("Eagle", "Singo", true);
		Zoo.add(Bingo);
		Zoo.add(Lingo);
		Zoo.add(Dingo);
		Zoo.add(Singo);
		List<String> Mammals = Zoo.stream().map

	}

	/*
	 * public static List<String> Escaped(String Animal1, String Animal2, String
	 * Animal3, String Animal4) {
	 * 
	 * List<String> Escaped = Arrays.asList(Animal1, Animal2, Animal3, Animal4);
	 * 
	 * System.out.println(Escaped); return Escaped;
	 * 
	 * }
	 */
}
