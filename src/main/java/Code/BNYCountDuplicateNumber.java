package Code;

public class BNYCountDuplicateNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 3, 4, 1};
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}
		
		/*int[] a = { 1,3,3,4,4,4};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length-1;j++)
			{
				if(a[i] == a[j])
				{
					System.out.print(a[i] + " ");
				}
			}
		}*/
	}
	
	
	
}
