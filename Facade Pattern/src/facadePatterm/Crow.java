package facadePatterm;

public class Crow implements Animal {

	@Override
	public String makenoise() {
		System.out.println("I am a Crow SCRAW!");
		return ("I am a Crow SCRAW!"); 
	}

}