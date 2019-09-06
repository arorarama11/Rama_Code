package Selenium;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Student> arr = new ArrayList<Student>();

		/*arr.add("A");
		arr.add("B");
		arr.add("C");
		
		for(String str : arr)
		{
			System.out.println(str);
		}*/
		
		Student s1 = new Student(2, "rama", 20);
		Student s2 = new Student(1, "nishant", 30);
		
		arr.add(s1);
		arr.add(s2);
		
		Iterator it = arr.iterator();
		
		while(it.hasNext())
		{
			Student st = (Student) it.next();
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}
		
		

	}

}

class Student
{
	int rollNo;
	int age;
	String name;
	
	Student(int rollno, String name, int age)
	{
		rollno = this.rollNo;
		age = this.age;
		name = this.name;
	}
}