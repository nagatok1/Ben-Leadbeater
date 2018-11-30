package animals;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat batty = new Bat("Black",13,"Pippastrel","Batty",2);
		Bat batty2 = new Bat("Purple",17,"Vampire","Barney",2);
		Bat batty3 = new Bat(batty2);
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		zoo.add(batty);
		zoo.add(batty2);
		zoo.add(batty3);
		
		for(Animal a : zoo) {
		System.out.println(a);
		}
		System.out.println(batty2==batty3);
		System.out.print(batty2.name.equals(batty3.name));
	}

}
