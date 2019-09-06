package Selenium;

public class DataBase_ConnectionClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Class.forName("Selenium.P").newInstance();
	}
}

class P
{
	static
	{
		System.out.println("static");
	}
	
	//
	{
		System.out.println("instance");
	}
}

