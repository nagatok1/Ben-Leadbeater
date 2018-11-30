package casting;

public class Eagle extends Bird{
	
	//////////////////////////////////Attributes//////////////////////////////////////////
	public boolean Eagle;
	
	
	
	////////////////////////////////////Constructors/////////////////////////////////////
	public Eagle (String vSpecies, String vName, boolean vEagle) {
		super(vSpecies, vName);
		this.Eagle = vEagle;
		
	}
	
	
	
	/////////////////////////////////////Methods////////////////////////////////////////
	
	public String MakeNoise() {
		System.out.println("Screee!");
		return " Screee!";
	}
	
	public String MakeNoise2() {
		return " Screee!";
	}
	
	@Override
	public String toString() {
		return "My name is " + name + " and i am an " + Species + MakeNoise2();
	}
}  