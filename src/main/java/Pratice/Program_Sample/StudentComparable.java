package Pratice.Program_Sample;

public class StudentComparable implements Comparable<StudentComparable> {

	int age;
	String loc;

	public StudentComparable(int age, String loc) {
		this.age = age;
		this.loc = loc;
	}
    

	@Override
	public String toString() {
		return "StudentComparable[age=" + age + ",loc =" + loc + "]";
	}

	@Override
	public int compareTo(StudentComparable o) {

		// 0 //1 //-1
		int val = this.loc.compareTo(o.loc);
		if (val == 0) {
			return 0;
		} else if (val > 1) {
			return 1;
		} else {
			return -1;
		}
	}
}
