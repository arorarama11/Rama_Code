package done;

import java.util.ArrayList;

/**
 * compare 2 array list and delete common elements
 * @author ramaaror
 *
 */
public class ArrayProgram {

	public static void main(String[] args)
	{
		 ArrayList<String> al1 = new ArrayList<>();
		 al1.add("A");
		 al1.add("B");
		 al1.add("C");
		 
		 ArrayList<String> al2 = new ArrayList<>();
		 al2.add("A");
		 al2.add("B");
		 al2.add("C");
		 al2.add("D");
		 al2.add("E");
		 al2.add("F");

		 ArrayList<String> al3 = new ArrayList<>(al1.size());
		 
		for(int i=0; i < al1.size(); i++)
		{
			for(int j=0; j<al2.size(); j++)
			{
				if((al1.get(i).equalsIgnoreCase(al2.get(j))))
				{
					al2.remove(j);
  				}
			}
		}
		System.out.println(al2);
}		
}