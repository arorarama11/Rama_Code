package Pratice.Program_Sample;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		return stu1.age-stu2.age;  //0 //1 //-1
	}

}
