package inheritance.new_teacher;

class DummyB extends DummyA{
	static String b1 = "b1 variable";
	public static void b1() {
		System.out.println("static b1()");
	}
	
	static {
		System.out.println("DummyB static initializer");
	}
	
	String b2 = "b2 variable";
	public void b2() {
		System.out.println("non static b2()");
	}
	
	{
		System.out.println("DummyB non static initializer");
	}
	
	public DummyB() {
		
		System.out.println("DemoB constructor");
	}
	
	public static void main(String[] args) {
		DummyB obj  = new DummyB();
		System.out.println("Main() dummyB");
		a1(); // static  method
		obj.a2(); // non static method
		//a2() CTE
	}
}
