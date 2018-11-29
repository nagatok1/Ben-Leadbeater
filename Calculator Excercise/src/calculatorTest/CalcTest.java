package calculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;
import calculator.Calculator;

public class CalcTest {

	@Test 
	public void TestDivide() {
		assertEquals("15/5 != 3",3,Calculator.calculator(15,5,3));
	}
	
	@Test
	public void TestMultiply() {
		assertEquals("6*2 != 12",12,Calculator.calculator(6,2,12));
	}
	
	@Test
	public void TestMultiply2() {
		assertEquals("9*12 != 108",108,Calculator.calculator(9,12,108));
	}
	@Test
	public void TestAdd1() {
		assertEquals("2 + 3 != 5",5,Calculator.calculator(2,3,5));
	}
	@Test
	public void TestMinus() {
		assertEquals("7 - 3 != 4",4,Calculator.calculator(7,3,4));
	}
	@Test
	public void Test4multiply() {
		assertEquals("3 * 4 * 5 != 60",60,Calculator.calculator(3,4,5,60));
	}
}