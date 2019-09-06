package Pratice.Program_Sample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparator {

	public static void main(String[] args)
	{
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(40, "PUNE"));
		al.add(new Student(30, "MUMBAI"));
		al.add(new Student(20, "DELHI"));
		al.add(new Student(50, "AGRA"));
		al.add(new Student(10, "UP"));
		System.out.println(al);
		Collections.sort(al,new StudentAgeComparator());
		System.out.println(al);
	}
}
