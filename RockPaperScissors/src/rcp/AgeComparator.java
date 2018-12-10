package rcp;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	
	public int compare(Student o1, Student o2) 
	{
		return ((Integer)o1.age).compareTo(o2.age);
	}
}