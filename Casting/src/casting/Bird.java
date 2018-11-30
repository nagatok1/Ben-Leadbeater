package casting;

public abstract class Bird extends Animal {

	///////////////////////////////// Attributes///////////////////////////////
	protected String Species;

	//////////////////////////////// Constructors///////////////////////////////
	public Bird(String vSpecies, String vName, int vWeight) {
		super(vName, vWeight);
		this.Species = vSpecies;
	}

	public Bird(String vSpecies, String vName) {
		this(vSpecies, vName, 0);
	}

	//////////////////////////////// Methods///////////////////////////////////

}