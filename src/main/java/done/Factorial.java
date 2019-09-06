package done;

public class Factorial {
	
	public static void main(String[] args){
		
		/*System.out.println(Factorial(5));
	}
	
	public static long Factorial(int n)
	{
		if(n == 1)
		return 1;
		return n * Factorial(n-1);
	}*/
		int fact =1;
		for(int i=1; i<=5; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
