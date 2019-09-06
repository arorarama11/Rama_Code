package Selenium;

import java.util.ArrayList;
import java.util.Collections;

public class AscDesc {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("A");
		s.add("Y");
		s.add("O");
		s.add("B");
		s.add(" ");
		s.add(" ");
		s.add("A");
		
		for(String list : s)
		{
			System.out.print(list);
		}
		
		System.out.println('\n');
		
		Collections.sort(s, Collections.reverseOrder());
		
		for(String rev : s)
		{
			System.out.print(rev);
		}
		
		System.out.println('\n');
		
		Collections.sort(s);
		
		for(String asc : s)
		{
			System.out.print(asc);
		}
		

	}

}
