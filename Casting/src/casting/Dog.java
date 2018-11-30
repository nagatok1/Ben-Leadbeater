package casting;

public class Dog extends Mammal {

	////////////////////////////////// Attributes//////////////////////////////////////////
	public String DogBreed;

	//////////////////////////////////// Constructors/////////////////////////////////////
	public Dog(String vSpecies, String vName, int vWeight, String vDogBreed) {
		super(vSpecies, vName, vWeight);
		this.DogBreed = vDogBreed;

	}

	///////////////////////////////////// Methods////////////////////////////////////////

	public void MakeNoise() {
		System.out.println("Woof!");
	}

	public String MakeNoise2() {
		return " Woof!";
	}

	@Override
	public String toString() {
		return "My name is " + name + " and i am a " + Species + MakeNoise2();
	}
}
