package Selenium;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDataFromFile {

	public static void main(String[] args) throws Exception
	{
		FileReader fr =  new FileReader("C:\\Users\\ramaaror\\Desktop\\rama.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = "";
		
		while((s = br.readLine()) != null)
		{
			System.out.println(s);
		}
	}

}
