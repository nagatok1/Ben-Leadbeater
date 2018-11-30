package animals;

public abstract class Mammal extends Animal{
	
	/////////////////////////////////Attributes///////////////////////////////
	private String species;
	
	
	
	
	
	////////////////////////////////Contructors///////////////////////////////
	public Mammal(String vSpecies, String vName, int vWeight) {
		super(vName,vWeight);			
		this.species = vSpecies;
	}
	
	public Mammal(String vSpecies,String vName) {
		this(vSpecies,vName,0);
	}
	
	
	////////////////////////////////Methods///////////////////////////////////
	public Mammal reproduce() {
		return this;
	}
	
	public String getSpecies() {
		return this.species;
	}
}
