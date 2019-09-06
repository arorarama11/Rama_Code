package Code;

import java.util.ArrayList;
import java.util.List;

public class BNYFindNumber {

	public static String findNumber(List<Integer> listNumber, int k)
	{
		String answer = "No";
		for(Integer i : listNumber)
		{
			if(k == i)
			{
				answer = "YES";
				break;
			}
		}
		
		return answer;
		
		 
	}
	
	public static void main(String args[])
	{
		BNYFindNumber sd = new BNYFindNumber();
		
		List<Integer> listNumber = new ArrayList<Integer>();
		
		listNumber.add(5);
		listNumber.add(1);
		listNumber.add(2);
		listNumber.add(3);
		listNumber.add(4);
		listNumber.add(5);
		listNumber.add(1);

		for(int i=0; i<listNumber.size(); i++)
		{
			for(int j= i+1; j<listNumber.size(); j++)
			{
				if(listNumber.get(i).equals(listNumber.get(j)))
				{
					listNumber.remove(j);
				}
			}
		}
		System.out.println(listNumber);
		
		int k = 1;
		
		String res = findNumber(listNumber, k);
		
		System.out.println(res);
	}
}
