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

	public void DogNoise() {
		Dog.makenoise();
	}

	public void CatNoise() {
		Cat.makenoise();
	}

	public void CrowNoise() {
		Crow.makenoise();
	}

}
