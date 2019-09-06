package OverrideExamples;


class Human
{
	public void eat()
	{
		System.out.println("eat parent");
	}
}


public class Override_Sample extends Human{
	
	public void eat()
	{
		System.out.println("eat child");
	}

	public static void main(String[] args)
	{
		Override_Sample h = new Override_Sample();
		h.eat();
	}
}

