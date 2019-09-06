package Code;

import java.util.ArrayList;
import java.util.List;

public class BNYOddNumbers {
	
	static List<Integer> oddNumbers(int l, int r)
	{
		List<Integer> list = new ArrayList<>();
		for(int i= l; i<=r; i++)
		{
			if(i%2 != 0)
			{
				list.add(i);
			}
		}
		return list;
	}
	
	public static void main(String args[])
	{
		BNYOddNumbers sd = new BNYOddNumbers();
		 
		int l = 3;
		int r = 9;
		
		List<Integer> res = sd.oddNumbers(l, r);
		
		System.out.println(res);
	}

}
