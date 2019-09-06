package OOPS;

public class UBS2 {

	public static void main(String[] args)
	{
		B b = new C();
		
		A1 a = b;
		
		if (a instanceof A1)
		{
			System.out.println("A");
		}
		if (a instanceof B)
		{
			System.out.println("B");
		}
		if (a instanceof C)
		{
			System.out.println("C");
		}
		if (a instanceof D)
		{
			System.out.println("D");
		}
	
	}
}

class A1
{
    
}

class B extends A1
{
	
	
}
class C extends B
{
	
}
class D extends C
{
	
}


