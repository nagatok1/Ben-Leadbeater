package casting;

public abstract class Animal {

	/////////////////////// Attributes///////////////////////
	protected int weight;
	protected String name;
	protected int Age;
	protected String Colour;

	/////////////////////// Constructors//////////////////////

	public Animal(String vName) {
		this.name = vName;
	}

	public Animal(String vName, int vWeight) {
		this.name = vName;
		this.weight = vWeight;
	}

	public Animal(String vName, int vWeight, int vAge, String vColour) {
		this.name = vName;
		this.weight = vWeight;
		this.Age = vAge;
		this.Colour = vColour;
	}

	@Override
	public String toString() {
		return "My name is " + name + "!";
	}

	/////////////////////// Methods//////////////////////////

}