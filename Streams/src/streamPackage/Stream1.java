package streamPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	
	public static void main(String[] args) {
	StreamUpper("hi" , "im" , "ben");	
	}
	public static List<String> StreamUpper(String x, String y, String z) {
		
		List<String> MyList = Arrays.asList(x , y , z);

		List<String> MyList2 = MyList.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(MyList2);
		
		return MyList2;
	}
}
