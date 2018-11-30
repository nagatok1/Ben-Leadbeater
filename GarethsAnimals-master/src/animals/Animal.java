package animals;

public abstract class Animal {
	///////////////////////Attributes///////////////////////
	protected int weight;
	protected String name;
	
	
	
	///////////////////////Constructors//////////////////////
	
	public Animal(String vName) {
		this.name = vName;
		this.weight = 0;
	}
	
	public Animal(String vName, int vWeight) {
		this.name = vName;
		this.weight = vWeight;
	}
	
	
	
	///////////////////////Methods//////////////////////////
	
	public void setWeight(int vWeight) {
		this.weight = vWeight;
	}
	
	public abstract Animal reproduce();
	
	public abstract void eat();
}
