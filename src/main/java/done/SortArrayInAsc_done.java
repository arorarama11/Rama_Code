package done;

import java.util.Arrays;

public class SortArrayInAsc_done {

	
	public static int[] sortArray(int[] arr, int l)
	{
		int temp = 0;
		for(int i=0; i<l; i++)
		{
			for(int j= i+1; j<l;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		int[] a = {4,3,6,2,1};
		int len = a.length;
		sortArray(a,len);
		System.out.println(Arrays.toString(a));
		
	}
}

