package facadePatterm;

public class Cat implements Animal {

	@Override
	public String makenoise() {
		System.out.println("I am a Cat MEOW!");
		return ("I am a Cat MEOW!");
	}

}