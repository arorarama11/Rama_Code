package OverrideExamples;

class Parent_1 {
	void m1() throws RuntimeException, Exception {
		System.out.println("From parent m1()");
	}
}

class Child1 extends Parent_1 {

	void m1() throws RuntimeException {
		System.out.println("From child1 m1()");
	}
}

class Child2 extends Parent_1 {

	void m1() throws ArithmeticException {
		System.out.println("From child2 m1()");
	}
}

class Child3 extends Parent_1 {
	
	void m1() 
	{
		System.out.println("From child3 m1()");
	}
}

class Child4 extends Parent_1 
{ 
	void m1() throws Exception 
    { 
		System.out.println("From child4 m1()");
	} 
} 
