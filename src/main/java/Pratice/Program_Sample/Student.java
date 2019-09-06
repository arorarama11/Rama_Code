package Pratice.Program_Sample;

public class Student {

	int age;
	String loc;
	
	public Student(int age, String loc)
	{
		this.age = age;
		this.loc = loc;
	}
	
	
	@Override
	public String toString()
	{
		return "Student[age=" + age + ",loc =" + loc + "]";
	}
}
