package casting;

public abstract class Bird extends Animal {

	///////////////////////////////// Attributes///////////////////////////////
	protected String Species;
	private int FlightRange;

	//////////////////////////////// Constructors///////////////////////////////
	public Bird(String vSpecies, String vName, int vWeight, int vFlightRange) {
		super(vName, vWeight);
		this.Species = vSpecies;
		this.FlightRange = vFlightRange;
	}

	public Bird(String vSpecies, String vName) {
		this(vSpecies, vName, 0, 0);
	}

	//////////////////////////////// Methods///////////////////////////////////

	public String getSpecies() {
		return this.Species;
	}

	public int getFlightRange() {
		return this.FlightRange;
	}
}