package OOPS;

class Rama
{
	public static int NoOfHands;
	public static int NoOfEyes;
	public String name;
	public String SName;
	
	public static void sleep()
	{
		System.out.println("Logic for sleep");
	}
	
	public static void eat()
	{
		System.out.println("logic for eat");
	}
	
	public void study()
	{
		System.out.println("logic for study");
	}
	
	public void hobbies()
	{
		System.out.println("logic for hobbies");
	}
}


public class BoyStatic {

	public static void main(String[] args)
	{
		Rama.NoOfEyes = 2;
		Rama.NoOfHands = 2;
		System.out.println(Rama.NoOfEyes);
		
		Rama.sleep();
		Rama.eat();
		
		Rama a = new Rama();
		a.name = "AB";
		a.SName = "NN";
		System.out.println(a.name + " " + a.SName);
		
		a.study();
		a.hobbies();
	}
	
}

