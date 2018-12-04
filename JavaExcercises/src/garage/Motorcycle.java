package garage;

public class Motorcycle extends Garage {

	/////////////////////////////////////////////// Attributes///////////////////////////////////////

	private String MotorcycleName;

	////////////////////////////////////////////// Constructors/////////////////////////////////////

	public Motorcycle(String VMotorcycleName, String VMake, int VSpeed) {
		super(VMake, VSpeed);
		this.MotorcycleName = VMotorcycleName;
	}

	public Motorcycle(String VMotorcycleName, String VMake) {
		this(VMotorcycleName, VMake, 0);
	}

	//////////////////////////////////////////////// Methods///////////////////////////////////////////

	public Motorcycle mpg() {
		return this;
	}

	public String GetMotorcycleName() {
		return this.MotorcycleName;
	}

	@Override
	public String toString() {
		return "This is a " + Make + " " + MotorcycleName + " with a top speed of " + Speed + "Mph" + " (MOTORCYCLE)";
	}
}