package streamPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrime {

	public static void main(String[] args) {
		Prime();	
	}
	public static void Prime() {
		List<Integer> NonPrime = Arrays.asList(10, 7, 3, 9, 11);
		
		List<Integer> IsPrime = NonPrime.stream().filter
				(number -> ((isPrime(number, true) == true))).collect(Collectors.toList());		
		System.out.println(IsPrime);
	}
	public static boolean isPrime(int x, Boolean Prime) {
		for(int i = 2; i <= (x / 2); i++) {
			if ((x % i) != 0) 
			{
				Prime = true;
			}
			else 
			{
				Prime = false;
				break;
			}
		}
		return Prime;
	}
}

