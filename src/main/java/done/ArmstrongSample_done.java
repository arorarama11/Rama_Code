package done;

public class ArmstrongSample_done {
	
	public static void main(String[] args)
	{
		int num = 153;
		int arm = 0;
		int rem;
		
		while(num > 0)
		{
			rem = num%10;
			arm = arm + (rem*rem*rem);
			num = num/10;
		}
		if(arm==num)
		{
			System.out.println("Armstrong number " + arm);
		}
		else
		{
			System.out.println("Number is not Armstrong ");
		}
	}

}
