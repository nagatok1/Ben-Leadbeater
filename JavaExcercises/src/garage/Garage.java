package garage;


public abstract class Garage {
	//////////////////////////////////////// Attributes//////////////////////////////////////////////////
	protected String Make;
	protected int Speed;

	////////////////////////////////////// Constructors//////////////////////////////////////////////////
	public Garage(String VMake) {
		this.Make = VMake;
		this.Speed = 0;
	}

	public Garage(String VMake, int VSpeed) {
		this.Make = VMake;
		this.Speed = VSpeed;
	}

	/////////////////////////////////////////// Methods/////////////////////////////////////////////////////

	public void setSpeed(int VSpeed) {
		this.Speed = VSpeed;
	}

}