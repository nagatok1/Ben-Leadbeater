package garage;

public abstract class Car extends Garage{
	
	///////////////////////////////////////////////Attributes///////////////////////////////////////
	
	private String CarName;
	
	
	//////////////////////////////////////////////Constructors/////////////////////////////////////
	
	public Car(String VCarName, String VMake, int VSpeed) {
		super(VMake,VSpeed);
		this.CarName = VCarName;
}
	public Car (String VCarName, String VMake) {
		this(VCarName, VMake, 0);
	}
	
	
	
	////////////////////////////////////////////////Methods///////////////////////////////////////////
	
	public Car mpg() {
		return this;
	}
	public String GetCarName() {
		return this.CarName;
	}
}