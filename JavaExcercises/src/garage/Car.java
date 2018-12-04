package garage;


public class Car extends Garage {

	/////////////////////////////////////////////// Attributes///////////////////////////////////////

	private String CarName;
	// static Scanner Scan = new Scanner(System.in);

	////////////////////////////////////////////// Constructors/////////////////////////////////////

	public Car(String VCarName, String VMake, int VSpeed) {
		super(VMake, VSpeed);
		this.CarName = VCarName;
	}

	public Car(String VCarName, String VMake) {
		this(VCarName, VMake, 0);
	}

	//////////////////////////////////////////////// Methods///////////////////////////////////////////

	public Car mpg() {
		return this;
	}

	public String GetCarName() {
		return this.CarName;
	}

	@Override
	public String toString() {
		return "This is a " + Make + " " + CarName + " with a top speed of " + Speed + "Mph" + " (CAR)";
	}
}