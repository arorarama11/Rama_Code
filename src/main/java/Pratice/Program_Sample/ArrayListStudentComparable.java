package Pratice.Program_Sample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStudentComparable {

	public static void main(String[] args)
	{
		ArrayList<StudentComparable> al = new ArrayList<>();
		al.add(new StudentComparable(50, "PUNE"));
		al.add(new StudentComparable(40, "MUMBAI"));
		al.add(new StudentComparable(30, "DELHI"));
		al.add(new StudentComparable(20, "AGRA"));
		al.add(new StudentComparable(10, "UP"));
		System.out.println(al + " ");
		Collections.sort(al);
		System.out.println(al);
	}
}
