package rcp;

import java.util.ArrayList;
import java.util.Collections;  

public class Main {

	public static void main(String[] args)
	{
		ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student("bbbb", 13)); 
        ar.add(new Student("cccc", 16)); 
        ar.add(new Student("aaaa", 15));
        ar.add(new Student("dddd", 18));
        Collections.sort(ar, new NameComparator());
        System.out.println(ar);
        Collections.sort(ar, new AgeComparator());
        System.out.println(ar);
		RPS rps = new RPS();
		while(true)
		{
			rps.menu();
		}
	}
}
