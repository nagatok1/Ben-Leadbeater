package facadeTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import facadePatterm.Cat;
import facadePatterm.Crow;
import facadePatterm.Dog;
import facadePatterm.NoiseMaker;

public class FacadeTest {

	@Test
	public void DogTest() {
		Dog Dog = new Dog();
		assertEquals("Dog did not WOOF!", "I am a Dog WOOF!", Dog.makenoise());
	}

	@Test
	public void CatTest() {
		Cat Cat = new Cat();
		assertEquals("Cat did not MEOW!", "I am a Cat MEOW!", Cat.makenoise());
	}

	@Test
	public void CrowTest() {
		Crow Crow = new Crow();
		assertEquals("Crow did not SCRAW!", "I am a Crow SCRAW!", Crow.makenoise());
	}

	@Test
	public void NoiseMakerTest1() {
		NoiseMaker NoiseMaker = new NoiseMaker();
		Dog Dog = new Dog();
		assertEquals("Method Output does not Match (DogNoise)", Dog.makenoise(), NoiseMaker.DogNoise());
	}

	@Test
	public void NoiseMakerTest2() {
		NoiseMaker NoiseMaker = new NoiseMaker();
		Cat Cat = new Cat();
		assertEquals("Method Output does not Match (CatNoise)", Cat.makenoise(), NoiseMaker.CatNoise());
	}

	@Test
	public void NoiseMakerTest3() {
		NoiseMaker NoiseMaker = new NoiseMaker();
		Crow Crow = new Crow();
		assertEquals("Method Output does not Match (CrowNoise)", Crow.makenoise(), NoiseMaker.CrowNoise());
	}

}
