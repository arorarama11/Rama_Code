package done;

import java.util.Arrays;

public class MiniumElementArray_Done {
	
	public static void main(String[] args)
	{
		int[] a = {2,3,1};
		
		int min = a[0];
		int max = a[0];
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
			
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
