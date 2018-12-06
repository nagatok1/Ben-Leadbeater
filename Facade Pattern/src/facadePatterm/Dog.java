package facadePatterm;

public class Dog implements Animal {

	@Override
	public String makenoise() {
		System.out.println("I am a Dog WOOF!");
		return ("I am a Dog WOOF!"); 
	}

}
