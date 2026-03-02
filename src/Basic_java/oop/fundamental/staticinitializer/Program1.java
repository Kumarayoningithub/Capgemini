package oop.fundamental.staticinitializer;

public class Program1 {
	
	// Application--------> opening
	
	
	
	static int i = test();

	public static void main(String[] args) {
		
		System.out.println("Main start");
		System.out.println(i);
		System.out.println("Main End");

	}
	
	public static int test() {
		System.out.println("Test");
		System.out.println(i);
		return 10;
	}

}
