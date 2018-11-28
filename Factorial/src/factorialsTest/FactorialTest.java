package factorialsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import factorial.Factorials;

public class FactorialTest {

	@Test
	public void FactorialsTest()
	{
		assertEquals("This is not a factorial", 1, Factorials.Factorial(120));
		
	}
/*	@Test
	public void FactorialsTest2()
	{
		assertNotEquals("This is not a factorial", 1 ,Factorials.Factorial(120));
		
	}
*/
}
