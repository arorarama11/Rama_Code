package done;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonDuplicateElementsIn2Array {

	public static void main(String[] args)
	{
		
		int[] a = {1,2,2,3,4,4,5,5,6,7};
		int[] a1 = new int[a.length];
		int j;
		 int size = a.length;
		 
		 for(int i=0; i<size; i++)
		 {
			 
			 for(j=0; j<size; j++)
				 if(a[i] == a[j] && i != j)
				 {
				        break;
				 }
				 if(j==a.length){
					 System.out.println(a[i]);
				 }
		 }
		 System.out.println();
		
		 for(int k=0; k<a1.length; k++)
		 {
			 if(a1[k]!=0)
			 {
			 System.out.println(a1[k]);
			 }
		 }
}
}
