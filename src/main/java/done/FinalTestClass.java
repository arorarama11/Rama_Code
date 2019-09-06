package done;

public class FinalTestClass {

	public static void main(String[] args) {

		final StringBuffer  s = new StringBuffer("aaa");
		s.append("xxx");
		System.out.println(s);
		
		final StringBuilder s1 = new StringBuilder("ssf");
		s1.append("asdsa");
		System.out.println(s1);
	}

}
