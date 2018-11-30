package casting;

public abstract class Mammal extends Animal {

	///////////////////////////////// Attributes///////////////////////////////
	protected String Species;

	//////////////////////////////// Constructors///////////////////////////////
	public Mammal(String vSpecies, String vName, int vWeight) {
		super(vName, vWeight);
		this.Species = vSpecies;
	}

	//////////////////////////////// Methods///////////////////////////////////

	public String getSpecies() {
		return this.Species;
	}
}
