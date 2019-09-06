package InterviewQuestion;

public class StaticTestClass {

	static int a;
	static String name;
	
	static {
		
		a = 10;
		name = "rama";
	}
	public static void main(String[] args) {
		
         System.out.println(a);
         System.out.println(name);
	}

}
