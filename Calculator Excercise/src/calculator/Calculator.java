package calculator;

public class Calculator {
	
	public static void main(String[] args) {
		calculator(3, 4 , 5, 60);
		
	}
	
	public static int calculator(int numberOne, int numberTwo, int numberThree) {
		
		if ((numberOne / numberTwo) == numberThree) {
			System.out.println(numberOne + " / " + numberTwo + " = " + numberThree);
			System.out.println(numberOne + " / " + numberThree + " = " + numberTwo);
			System.out.println(numberThree + " * " + numberTwo + " = " + numberOne);
			System.out.println(numberTwo + " * " + numberThree + " = " + numberOne);
			return numberThree;
		}
		
		if ((numberOne * numberTwo) == numberThree) { 
			System.out.println(numberOne + " * " + numberTwo + " = " + numberThree);
			System.out.println(numberTwo + " * " + numberOne + " = " + numberThree);
			System.out.println(numberThree + " / " + numberTwo + " = " + numberOne);
			System.out.println(numberThree + " / " + numberOne + " = " + numberTwo);
			return numberThree;
		}
		
		if ((numberOne + numberTwo) == numberThree) {
			System.out.println(numberOne + " + " + numberTwo + " = " + numberThree);
			System.out.println(numberTwo + " + " + numberOne + " = " + numberThree);
			System.out.println(numberThree + " - " + numberTwo + " = " + numberOne);
			System.out.println(numberThree + " - " + numberOne + " = " + numberTwo);
			
			return numberThree;
		} 
		
		if ((numberOne - numberTwo) == numberThree) {
			System.out.println(numberOne + " - " + numberTwo + " = " + numberThree);
			System.out.println(numberTwo + " - " + numberOne + " = " + numberThree);
			System.out.println(numberThree + " + " + numberTwo + " = " + numberOne);
			System.out.println(numberThree + " + " + numberOne + " = " + numberTwo);
			return numberThree;
		}
		
		return 0;
		
				
	}

	public static int calculator(int numberOne, int numberTwo, int numberThree, int numberFour) {
		if ((numberOne * numberTwo * numberThree) == numberFour) {
			System.out.println(numberOne + " * " + numberTwo + " * " + numberThree + " = " + numberFour);
			return numberFour;
		}
		return numberFour;
	}
}
