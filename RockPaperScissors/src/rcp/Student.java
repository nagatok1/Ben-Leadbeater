package rcp;

public class Student {
	public String name;
	public int age;

	public Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return (name + " " + age);
	}
}