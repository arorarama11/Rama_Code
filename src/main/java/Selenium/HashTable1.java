package Selenium;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<String,String> hash = new Hashtable<String,String>();
		
		hash.put("1", "A");
		hash.put("2", "B");
		hash.put("3", "C");
		hash.put(" ", "D");
		hash.put(" ", " ");
		hash.put("5", " ");
		
		
		for(Map.Entry<String, String> e : hash.entrySet())
		{
			System.out.println(e);
		}

	}

}
