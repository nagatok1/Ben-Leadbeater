package excercisesTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import excercises.HelloWorldReturn;

public class HelloWorldTest {
	@Test
	public void testHelloWorld() { 
		assertEquals("Does not say Hello World", "Hello World!", HelloWorldReturn.ReturnHelloWorld());
	 
	}

}
