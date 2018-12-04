package garage;

public class Bus extends Garage {

	/////////////////////////////////////////////// Attributes///////////////////////////////////////

	private String BusName;

	////////////////////////////////////////////// Constructors/////////////////////////////////////

	public Bus(String VBusName, String VMake, int VSpeed) {
		super(VMake, VSpeed);
		this.BusName = VBusName;
	}

	public Bus(String VBusName, String VMake) {
		this(VBusName, VMake, 0);
	}

	//////////////////////////////////////////////// Methods///////////////////////////////////////////

	public Bus mpg() {
		return this;
	}

	public String GetBusName() {
		return this.BusName;
	}

	@Override
	public String toString() {
		return "This is a " + Make + " " + BusName + " with a top speed of " + Speed + "Mph" + (" (BUS)");
	}

}