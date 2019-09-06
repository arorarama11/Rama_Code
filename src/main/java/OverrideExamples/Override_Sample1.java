package OverrideExamples;


class ABC
{
	public void disp()
	{
		System.out.println("disp() of parent class");
	}
	
	protected void accessModifierTest()
	{
		System.out.println("check override for Access Modifier in parent class");
	}
}


public class Override_Sample1 extends ABC{
	
	public void disp()
	{
		super.disp();
		System.out.println("disp() of child class");
	}
	
	public void newMethod()
	{
		System.out.println("New method of child class");
	}
	
	public void accessModifierTest()
	{
		System.out.println("check override for Access Modifier in child classs");
	}
	
	public static void main(String[] args)
	{
		ABC a =  new ABC();
		a.disp();
		
		Override_Sample1 os = new Override_Sample1();
		os.disp();
		os.accessModifierTest();
		
		ABC b = new Override_Sample1();
		((Override_Sample1) b).newMethod();
		b.disp();
		b.accessModifierTest();
		
		
		
	}

}
