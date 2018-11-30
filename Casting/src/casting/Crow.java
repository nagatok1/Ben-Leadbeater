package casting;

public class Crow extends Bird {

	////////////////////////////////// Attributes//////////////////////////////////////////
	public boolean Crow;

	//////////////////////////////////// Constructors/////////////////////////////////////
	public Crow(String vSpecies, String vName, boolean vCrow) {
		super(vSpecies, vName);
		this.Crow = vCrow;

	}

	///////////////////////////////////// Methods////////////////////////////////////////

	public void MakeNoise() {
		System.out.println(" Scraw!");
	}

	public String MakeNoise2() {
		return " Scraw!";
	}

	@Override
	public String toString() {
		return "My name is " + name + " and i am a " + Species + MakeNoise2();
	}
}