package OverrideExamples;

class Parent 
{ 
    void m1() 
    { 
    	System.out.println("From parent m1()");
    } 
      
    void m2() throws Exception 
    { 
    	System.out.println("From parent  m2()"); 
    } 
} 

public class Override_Sample2 extends Parent{

	void m1() throws ArithmeticException 
    { 
		System.out.println("From child m1()");
	} 
	
	void m2() throws Exception
	{ 
		System.out.println("From child m2");
	} 
	
	public static void main(String[] args)
	{
		System.out.println("hello");
	}
}
