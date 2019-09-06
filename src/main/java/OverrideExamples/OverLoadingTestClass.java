package OverrideExamples;

public class OverLoadingTestClass {

	public int overload(int a, int b)
	{
		System.out.println("sum of 2 number");
		return a + b;	
	}
	
	public int overload(int a, int b, int c)
	{
		System.out.println("sum of 3 number");
		return a + b + c;
	}
	
	public static void main(String[] args)
	{
		OverLoadingTestClass o = new OverLoadingTestClass();
		int z = o.overload(20, 10);
		System.out.println(z);
	}
}

