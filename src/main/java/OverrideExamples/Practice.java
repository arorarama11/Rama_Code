package OverrideExamples;

import java.io.IOException;


class Building{
	
	public void color()
	{
		System.out.println("blue");
	}
	
	public void rama()
	{
		System.out.println("rama");
	}
}
public class Practice extends Building{

	public void color()
	{
		System.out.println("red");
	}
	
	public void arora()
	{
		System.out.println("arora");
	}
	public static void main(String[] args) 
	{
		Building obj = new Practice();
		obj.color();
		
	}
}
