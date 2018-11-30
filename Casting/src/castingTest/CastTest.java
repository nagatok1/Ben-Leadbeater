package castingTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import casting.Cat;
import casting.Crow;
import casting.Dog;
import casting.Eagle;

public class CastTest {

	@Test
	public void CrowNoiseTest() {
		Crow CrowTest = new Crow("Crow", "Edgar", true);
		assertEquals("Crow did not Scraw!", " Scraw!", CrowTest.MakeNoise2());
	}

	@Test
	public void EagleNoiseTest() {
		Eagle EagleTest = new Eagle("Eagle", "Jebus", true);
		assertEquals("Eagle did not Screee!", " Screee!", EagleTest.MakeNoise2());
	}

	@Test
	public void DogNoiseTest() {
		Dog DogTest = new Dog("Dog", "Dutch", 45, "Golden Retriever");
		assertEquals("Dog did not Woof!", " Woof!", DogTest.MakeNoise2());
	}

	@Test
	public void CatNoise() {
		Cat CatTest = new Cat("Cat", "Judas", 10, "Coleco");
		assertEquals("Cat did not Meow!", " Meow!", CatTest.MakeNoise2());
	}

	@Test
	public void DogToStringTest() {
		Dog DogTest = new Dog("Dog", "Dutch", 45, "Golden Retriever");
		assertEquals("ToString working Incorrectly", "My name is Dutch and i am a Dog Woof!", DogTest.toString());
	}

	@Test
	public void CatToStringTest() {
		Cat CatTest = new Cat("Cat", "Judas", 10, "Coleco");
		assertEquals("ToString working Incorrectly", "My name is Judas and i am a Cat Meow!", CatTest.toString());
	}

	@Test
	public void CrowToStringTest() {
		Crow CrowTest = new Crow("Crow", "Edgar", true);
		assertEquals("ToString working Incorrectly", "My name is Edgar and i am a Crow Scraw!", CrowTest.toString());
	}

}
