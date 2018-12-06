package facadePatterm;

public class NoiseMaker {
	private Animal Dog;
	private Animal Cat;
	private Animal Crow;

	public NoiseMaker() {
		Dog = new Dog();
		Cat = new Cat();
		Crow = new Crow();
	}

	public String DogNoise() {
		return Dog.makenoise();
	}

	public String CatNoise() {
		return Cat.makenoise();
	}

	public String CrowNoise() {
		return Crow.makenoise(); 
	}

}
