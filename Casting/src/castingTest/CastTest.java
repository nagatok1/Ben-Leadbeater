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
		Crow CrowTest = new Crow("Black","Edgar",true);
		assertEquals("Crow did not Scraw!", " Scraw!" , CrowTest.MakeNoise2());
	}

	@Test
	public void EagleNoiseTest() {
		Eagle EagleTest = new Eagle("Golden", "Jebus" , true);
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
}
