package inheritance.new_teacher;

public class DummyA {
	static String a1 = "a1 variable";
	public static void a1()
	{
		System.out.println("static a1()");
	}
	static
	{
		System.out.println("Dummy A static initializer");
	}
	String a2 = "a2 variable";
	public void a2()
	{
		System.out.println("Non Static a2()");
	}
	{
		System.out.println("Dummy A non static initializer");
	}
	
	public DummyA()
	{
		super();
		System.out.println("Dummy A Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Dummy A main");
	}
}









