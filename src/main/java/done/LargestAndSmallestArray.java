package done;

public class LargestAndSmallestArray {

	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,6};
		int temp;
		
		for(int i=0; i <a.length; i++)
		{
			for(int j=1; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Largest two numbers are:"+a[0]+" and "+a[1]);
	}
}
