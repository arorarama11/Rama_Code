package Pratice.Program_Sample;

import java.util.ArrayList;

public class ArrayListStudent {

	public static void main(String[] args)
	{
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(10, "PUNE"));
		al.add(new Student(20, "MUMBAI"));
		al.add(new Student(30, "DELHI"));
		al.add(new Student(40, "AGRA"));
		al.add(new Student(50, "UP"));
		System.out.println(al);
	}
}
