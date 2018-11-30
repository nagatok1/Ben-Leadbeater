package casting;

public abstract class Mammal extends Animal {

	///////////////////////////////// Attributes///////////////////////////////
	protected String Species;

	//////////////////////////////// Constructors///////////////////////////////
	public Mammal(String vSpecies, String vName, int vWeight) {
		super(vName, vWeight);
		this.Species = vSpecies;
	}

	public Mammal(String vSpecies, String vName) {
		this(vSpecies, vName, 0);
	}

	//////////////////////////////// Methods///////////////////////////////////

	public String getSpecies() {
		return this.Species;
	}
}
