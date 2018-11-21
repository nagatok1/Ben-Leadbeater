package streamPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcat {

	public static void main(String[] args) {
	Concat("hi","im","ben");	
	}
	public static void Concat(String x, String y, String z) {
		List<String> MyList = Arrays.asList(x , y , z);
		String Concat = MyList.stream().map(Object::toString).collect(Collectors.joining(" "));
		System.out.println(Concat);
	}
}
