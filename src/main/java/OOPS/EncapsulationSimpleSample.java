package OOPS;

public class EncapsulationSimpleSample {

	public static void main(String[] args)
	{
		P p = new P();
		p.m1();
		
		C1 c = new C1();
		c.m1();
		c.m2();
		
		P p1 = new C1();
		p1.m1();
		
		
		C1 c1 = (C1) new P();
		c1.m1();
		c1.m2();
	}
}

class P
{
	void m1()
	{
		
	}
}

class C1 extends P
{
	void m2()
	{
		
	}
}