package OOPS;

class A_Class
{
	private int i;
	
	public A_Class(int j)
	{
		i = j;
	}
	
	public int getValue()
	{
		return i;
	}
}
public class EncapsulationSample {
	
	public static void main(String[] args)
	{
		A_Class a = new A_Class(5);
		int x = a.getValue();
		System.out.println(x);
	}

}
