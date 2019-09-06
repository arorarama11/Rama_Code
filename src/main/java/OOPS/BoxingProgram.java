package OOPS;

import java.util.ArrayList;
import java.util.List;

public class BoxingProgram {

	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i < 10 ; i++)
		{
			list.add(i);
			list.add(Integer.valueOf(i));
		}

	}
}
