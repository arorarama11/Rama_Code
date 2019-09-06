package done;

import java.util.HashSet;
import java.util.Set;

public class Average_done {
	
	public static double average (int arr[], int l)
	{
		int sum = 0;
		for(int i=0; i<l; i++)
		{
			sum = sum + arr[i];
		}
		
		double d = sum/l;
		return d;
	}
	
	public static void main(String[] args)
	{
		int[] a = {10, 2, 3, 4, 5, 6, 7, 8, 9};
		int len = a.length;
		double ab = average(a,len);
		System.out.println(ab);
	}
}
