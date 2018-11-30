package casting;

public class Cat extends Mammal {

	////////////////////////////////// Attributes//////////////////////////////////////////
	public String CatBreed;

	//////////////////////////////////// Constructors/////////////////////////////////////
	public Cat(String vSpecies, String vName, int vWeight, String vCatBreed) {
		super(vSpecies, vName, vWeight);
		this.CatBreed = vCatBreed;

	}

	///////////////////////////////////// Methods////////////////////////////////////////

	public void MakeNoise() {
		System.out.println(" Meow");
	}

	public String MakeNoise2() {
		return " Meow!";
	}

	@Override
	public String toString() {
		return "My name is " + name + " and i am a " + Species + MakeNoise2();
	}
}