package OOPS;

class A
{
	int x = 10;
	
	public void assign(int x)
	{
		x = x;
		System.out.println(this.x);
	}
}

public class UBS1 {

	public static void main(String[] args)
	{
		new A().assign(100);
	}

}



