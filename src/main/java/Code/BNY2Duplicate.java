package Code;

public class BNY2Duplicate {

	public static void main(String[] args)
	{
		 int[] arr = {1,3,3,4,4,4};
		 int len = arr.length;
		 
		 int count = 0;
		 for(int i=0; i<len; i++)
		 {
			 for(int j=i+1; j<len-1; j++)
			 {
				 if(arr[i] == arr[j])
				 {
					 System.out.println(arr[i]);
				 }
			 }
		 }
	}
}
