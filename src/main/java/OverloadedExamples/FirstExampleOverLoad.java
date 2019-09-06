package OverloadedExamples;

public class FirstExampleOverLoad{

	public static void main(String[] args)
	{
		
		Sample s = new Sample();
		s.add(20, 10.2);
		s.add(10, 20.1, 30);
	}
}

class Sample
{
	public void add(int a, double b)
	{
		System.out.println("add 2 numbers");
	}
	
	public void add(int a, double b, int c)
	{
		System.out.println("add 3 numbers");
	}
}
