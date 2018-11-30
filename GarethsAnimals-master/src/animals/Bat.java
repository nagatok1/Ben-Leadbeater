package animals;

public class Bat extends Mammal implements Flying{
	///////////////////////////Attributes///////////////////////
	String colour;
	int speed;	
	
	
	///////////////////////////Constructors///////////////////////
	public Bat(String vColour, int vSpeed, String vSpecies, String vName, int vWeight) {	
		super(vSpecies, vName, vWeight);
		this.colour = vColour;
		this.speed = vSpeed;
	}
	
	public Bat(Bat vBat) {
		super(vBat.getSpecies(),vBat.name);
	}
	
	//////////////////////////Methods/////////////////////////////
	public void takeoff() {
		
	}
	
	public void flying() {
		
	}
	
	public void landing() {
		
	}
	
	public void eat() {
		
	}
	public String toString() {
		return "This Bat is a "+this.getSpecies()+" and they are called "+this.name;
	}
}
